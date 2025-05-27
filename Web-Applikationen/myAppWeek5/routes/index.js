const express = require('express');
const router = express.Router();
const blogRouter = require('./blog');
// Importieren des Blog-Routers
router.use('/blog', blogRouter);

router.get('/', function(req, res, next) {
  res.render('index', { title: 'Startseite', name: 'Nikolai' });
});

router.get('/second', function(req, res, next) {
  res.render('second', { title: 'Zweite Seite', name: 'Nikolai' });
});

router.get('/:year/:month/:day', (req, res) => {
  const { year, month, day } = req.params;
  const name = req.query.name;

  if (name) {
    res.send(`Hallo, ${name}! Dein Datum ist: ${day}.${month}.${year}`);
  } else {
    res.send(`Datum: ${day}.${month}.${year}`);
  }
});


router.get('/names', (req, res) => {
  const user_name = req.query.name;
  res.send(`Hallo ${user_name}`);
});

router.post('/daten', (req, res) => {
  const name = req.body.name;
  res.send(`Hallo ${name}, deine Daten wurden empfangen.`);
});


module.exports = router;
