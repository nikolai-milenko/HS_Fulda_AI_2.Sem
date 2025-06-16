var fs = require('fs');

const blogPosts = require('../models/blog.json');

var lastPostId = blogPosts.length > 0
  ? blogPosts[blogPosts.length - 1].postId
  : -1;


/* http://localhost:3100/blog/ */
// GET /blog – Alle Blogeinträge anzeigen
const getAllPosts = (req, res) => {
  if (blogPosts.length === 0) {
    return res.status(404).send('Keine Blogeinträge gefunden.');
  }
  blogPosts.forEach(post => {
    console.log(`ID: ${post.postId}, Titel: ${post.title}`);    
  });
  res.status(200).json(blogPosts);
}

/* http://localhost:3100/blog */
/*
 * POST /blog – Neuen Blogeintrag erstellen
 * Erwartet: author, title, text, image (optional)
 */
const createPost = (req, res) => {
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

  fs.writeFileSync('./models/blog.json', JSON.stringify(blogPosts, null, 2), 'utf8');

  res.status(201).send(newPost);
}

/* http://localhost:3100/blog/:postID */
// GET /blog/:postID – Blogeintrag per ID anzeigen
const getPostById = (req, res) => {
  const id = parseInt(req.params.postID);
  if (isNaN(id) || id < 0 || id >= blogPosts.length) {
    return res.status(404).send('Kein Eintrag');
  }
  res.status(200).json([blogPosts[id].postId, blogPosts[id].title]);
}

/* http://localhost:3100/blog/:postID */
// PUT /blog/:postID – Blogeintrag aktualisieren
const updatePost = (req, res) => {
  const found_id = blogPosts.findIndex(post => post.postId === parseInt(req.params.postID));
  if (found_id === -1) {
    return res.status(404).send('Kein Eintrag gefunden');
  }
  const { author, title, text } = req.body;
  if (!author || !title || !text) {
    return res.status(400).send('Alle Felder müssen ausgefüllt sein.');
  }
  const image = req.file ? req.file.filename : null;
  const date = new Date();
  const year = date.getFullYear();
  const month = String(date.getMonth() + 1).padStart(2, '0'); // Monat von 0-11, daher +1
  const day = String(date.getDate()).padStart(2, '0'); // Tag von 1-31
  const updatedPost = { ...blogPosts[found_id], year, month, day, author, title, text, image };
  blogPosts[found_id] = updatedPost;
  fs.writeFileSync(`./models/blog.json`, JSON.stringify(blogPosts, null, 2), 'utf8');
  res.status(200).json(updatedPost);
}

/* http://localhost:3100/blog/:postID */
// DELETE /blog/:postID – Blogeintrag löschen
const deletePost = (req, res) => {
  const found_id = blogPosts.findIndex(post => post.postId === parseInt(req.params.postID));
  if (found_id === -1) {
    return res.status(404).send('Kein Eintrag gefunden');
  }
  blogPosts.splice(found_id, 1);
  fs.writeFileSync(`./models/blog.json`, JSON.stringify(blogPosts, null, 2), 'utf8');
  res.status(204).send();
}

module.exports = {
  getAllPosts,
  createPost,
  getPostById,
  updatePost,
  deletePost
};
