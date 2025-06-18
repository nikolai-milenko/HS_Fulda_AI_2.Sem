var createError = require('http-errors');
var express = require('express');
var path = require('path');
var cookieParser = require('cookie-parser');
var logger = require('morgan');

var indexRouter = require('./routes/index');
var usersRouter = require('./routes/users');
var audioRouter = require('./routes/audio');
var filmRouter = require('./routes/films');
var journalRouter = require('./routes/journals');
var bookRouter = require('./routes/books');
var borrowRouter = require('./routes/borrow');

const swaggerJsdoc = require("swagger-jsdoc"),
  swaggerUi = require("swagger-ui-express");

var app = express();


app.use(logger('dev'));
app.use(express.json());
app.use(express.urlencoded({ extended: false }));
app.use(cookieParser());
app.use(express.static(path.join(__dirname, 'public')));

const options = {
  definition: {
    openapi: "3.1.0",
    info: {
      title: "Borrow Express API with Swagger",
      version: "0.1.0",
      description:
        "RestFul API for Borrowing Equipment",
    },
    servers: [
      {
        url: "http://localhost:3000",
        description: "Example server",
      },
    ],
  },
  apis: ["./routes/*.js"],
};

const specs = swaggerJsdoc(options);
app.use(
  "/api-docs",
  swaggerUi.serve,
  swaggerUi.setup(specs)
);

const fileUpload = require('express-fileupload');
app.use(fileUpload({
  createParentPath: true
}));
app.use(express.static('public/uploads'));

app.get('/swagger.json', (req, res) => {
  res.setHeader('Content-Type', 'application/json');
  res.send(specs);
});

app.use('/', indexRouter);
app.use('/users', usersRouter);
app.use('/audios', audioRouter);
app.use('/films', filmRouter);
app.use('/journals', journalRouter);
app.use('/books', bookRouter);
app.use('/borrows', borrowRouter);

// catch 404 and forward to error handler
app.use(function (req, res, next) {
  next(createError(404));
});

// error handler
app.use(function (err, req, res, next) {
  res.status(err.status || 500).send(err);
});

module.exports = app;
