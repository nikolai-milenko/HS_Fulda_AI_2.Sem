const express = require('express');
const router = express.Router();

router.get('/', function(req, res, next) {
  res.render('index', { title: 'Startseite', name: 'Nikolai' });
});

router.get('/second', function(req, res, next) {
  res.render('second', { title: 'Zweite Seite', name: 'Nikolai' });
});

module.exports = router;
