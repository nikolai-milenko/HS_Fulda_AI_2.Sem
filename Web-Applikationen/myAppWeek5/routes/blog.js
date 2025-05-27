const express = require('express');
const router = express.Router();

// Speicher für Blogeinträge (nur im RAM)
const blogPosts = [];

// POST /blog – neuen Beitrag erstellen
router.post('/', (req, res) => {
  const { year, month, day, author, title, text } = req.body;

  if (!year || !month || !day || !author || !title || !text) {
    return res.status(400).send('Alle Felder müssen ausgefüllt sein.');
  }

  const newPost = { year, month, day, author, title, text };
  blogPosts.push(newPost);

  res.status(201).send('Blogeintrag gespeichert.');
});

// GET /blog – alle Beiträge anzeigen
router.get('/', (req, res) => {
  res.json(blogPosts);
});

// GET /blog/:id – Blogeintrag per Index anzeigen
router.get('/:id', (req, res) => {
  const id = parseInt(req.params.id);
  if (isNaN(id) || id < 0 || id >= blogPosts.length) {
    return res.status(404).send('Blogeintrag nicht gefunden.');
  }

  res.json(blogPosts[id]);
});


module.exports = router;
