/**
* @swagger
* components:  
*   schemas:
*     CreateBook:
*       type: object
*       required:
*         - title
*         - author
*         - description
*         - count
*       properties:
*         id:
*           type: integer
*           description: The unique identifier for a book
*         title:
*           type: string
*           description: The title of the book
*         author:
*           type: string
*           description: The author of the book
*         description:
*           type: string
*           description: A brief description of the book
*         count: 
*           type: integer
*           description: The number of copies available
*         pic:
*           type: file 
*           description: The cover image of the book
*       example:
*         title: "The Great Gatsby"
*         author: "F. Scott Fitzgerald"
*         description: "A novel set in the 1920s about the American dream."
*         count: 5
*     Book:
*       allOf:
*         - $ref: '#/components/schemas/CreateBook'
*         - example:
*             id: 0
*             pic: "/uploads/book-cover.jpg"
*/
/** 
* @swagger
* tags:
*   name: Books
*   description: API for managing books
*
* /books:
*   get:
*     summary: Get all books
*     tags: [Books]
*     responses:
*       200:
*         description: List of all books
*         content:
*           application/json:
*             schema:
*               type: array
*               items:
*                 $ref: '#/components/schemas/Book'
*       500:
*         description: Server error
*   post:
*     summary: Create a new book
*     tags: [Books]
*     requestBody:
*       required: true
*       content:
*         application/json:
*           schema:
*             $ref: '#/components/schemas/CreateBook'
*     responses:
*       201:
*         description: Book created successfully
*         content:
*           application/json:
*             schema:
*               $ref: '#/components/schemas/Book'
*       422:
*         description: Validation error, title, author, description and count must be set
*       500:
*         description: Server error
*
* /books/{id}:
*   get:
*     summary: Get a book by ID
*     tags: [Books]
*     parameters:
*       - in: path
*         name: id
*         required: true
*         schema:
*           type: integer
*         description: The book ID
*     responses:
*       200:
*         description: Book details
*         content:
*           application/json:
*             schema:
*               $ref: '#/components/schemas/Book'
*       404:
*         description: Book not found
*       500:
*         description: Server error
*   put:
*     summary: Update a book by ID or create a new book if it doesn't exist
*     tags: [Books]
*     parameters:
*       - in: path
*         name: id
*         required: true
*         schema:
*           type: integer
*         description: The book ID
*     requestBody:
*       required: true
*       content:
*         application/json:
*           schema:
*             $ref: '#/components/schemas/CreateBook'
*     responses:
*       200:
*         description: Book updated successfully
*         content:
*           application/json:
*             schema:
*               $ref: '#/components/schemas/Book'
*       422:
*         description: Validation error, title, author, description and count must be set
*       500:
*         description: Server error
*   delete:
*     summary: Delete a book by ID
*     tags: [Books]
*     parameters:
*       - in: path
*         name: id
*         required: true
*         schema:
*           type: integer
*         description: The book ID
*     responses:
*       200:
*         description: The list of books
*         content:
*           application/json:
*             schema:
*               type: array
*               items:
*                 $ref: '#/components/schemas/Book'
*       500:
*         description: Server error
*/

var express = require('express');
var router = express.Router();

let booksController = require('../controllers/booksController')

router.route("/")
  .get((req, res, next) => {
    let response = booksController.getAllBooks();
    res.status(response.status).json(response.data);
  })
  .post((req, res, next) => {
    let response = booksController.createBook(req);
    res.status(response.status).json(response.data);
  })

router.route("/:id")
  .get((req, res, next) => {
    let response = booksController.readBook(req.params.id, req.body);
    res.status(response.status).json(response.data);
  })
  .put((req, res, next) => {
    let response = booksController.updateBook(req.params.id, req);
    res.status(response.status).json(response.data);
  })
  .delete((req, res, next) => {
    let response = booksController.deleteBook(req.params.id, req.body);
    res.status(response.status).json(response.data);
  })

router.route("/author/:authorName")
  .get((req, res, next) => {
    const response = booksController.getBooksByAuthor(req.params.authorName);
    res.status(response.status).json(response.data);
  })


module.exports = router;
