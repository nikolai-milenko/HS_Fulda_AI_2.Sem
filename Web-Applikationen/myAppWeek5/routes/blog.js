const express = require('express');
const router = express.Router();

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

var blogController = require('../controllers/blogController');

// Blog-Routen
router.route('/')
  .get(blogController.getAllPosts)
  .post(upload.single('image'), blogController.createPost);

router.route('/:postID')
  .get(blogController.getPostById)
  .put(upload.single('image'), blogController.updatePost)
  .delete(blogController.deletePost);

module.exports = router;
