const express = require('express');
const router = express.Router();

const fs = require('fs');

const blogPosts = require('../models/blog.json');

var lastPostId = blogPosts.length > 0
  ? blogPosts[blogPosts.length - 1].postId
  : -1;

const multer = require('multer');
const path = require('path');

const storage = multer.diskStorage({
  destination: function (req, file, cb) {
    cb(null, './public/uploads');
  },
  filename: function (req, file, cb) {
    const unique = Date.now() + '-' + Math.round(Math.random() * 1e9);
    cb(null, unique + path.extname(file.originalname));
  }
});

const upload = multer({ storage: storage });

// Blog-Routen

// POST /blog – neuen Blogeintrag erstellen
// Erwartet: { author: 'Autor', title: 'Titel', text: 'Inhalt' }
router.post('/', upload.single('image'), (req, res) => {
  const { author, title, text } = req.body;
  const image = req.file ? req.file.filename : null;

  if (!author || !title || !text) {
    console.log(`${author}, ${title}, ${text}, ${image}`);
    return res.status(400).send('Alle Felder müssen ausgefüllt sein.');
  }
  const postId = ++lastPostId;
  console.log(`Neuer Blogeintrag mit ID: ${postId}`);
  const date = new Date();
  const year = date.getFullYear();
  const month = String(date.getMonth() + 1).padStart(2, '0'); // Monat von 0-11, daher +1
  const day = String(date.getDate()).padStart(2, '0'); // Tag von 1-31

  const newPost = { postId, year, month, day, author, title, text, image };
  blogPosts.push(newPost);

  fs.writeFileSync(`./models/blog.json`, JSON.stringify(blogPosts, null, 2), 'utf8');

  res.status(201).send(newPost);
});

// GET /blog – alle Beiträge anzeigen
router.get('/', (req, res) => {
  if (blogPosts.length === 0) {
    return res.status(404).send('Keine Blogeinträge gefunden.');
  }
  blogPosts.forEach(post => {
    console.log(`ID: ${post.postId}, Titel: ${post.title}`);    
  });
  res.json(blogPosts);
});

// GET /blog/:id – Blogeintrag per Index anzeigen
router.get('/:postID', (req, res) => {
  const id = parseInt(req.params.postID);
  if (isNaN(id) || id < 0 || id >= blogPosts.length) {
    return res.status(404).send('Kein Eintrag');
  }

  res.status(200).json([blogPosts[id].postId, blogPosts[id].title]);
});


module.exports = router;
