/**
* @swagger
* components:  
*   schemas:
*     CreateBorrow:
*       type: object
*       required:
*         - userid
*         - articleId
*         - articleType
*         - start
*         - end
*       properties:
*         userid:
*           type: integer
*           description: The unique identifier for a borrow
*         articleId:
*           type: integer
*           description: The unique identifier for the article being borrowed
*         articleType:
*           type: string
*           description: The type of borrow being borrowed (e.g., book, audio, film, journal)
*         start:
*           type: string
*           format: date-time
*           description: The start date and time of the borrow
*         end:
*           type: string
*           format: date-time
*           description: The end date and time of the borrow
*       example:
*         userid: 4
*         articleId: 5
*         articleType: "book"
*         start: "2025-05-05"
*         end: "2025-05-08"
*     Borrow:
*       allOf:
*         - $ref: '#/components/schemas/CreateBorrow'
*         - example:
*             id: 0
*/
/** 
* @swagger
* tags:
*   name: Borrows
*   description: API for managing borrows
*
* /borrows:
*   get:
*     summary: Get all borrows
*     tags: [Borrows]
*     responses:
*       200:
*         description: List of all borrows
*         content:
*           application/json:
*             schema:
*               type: array
*               items:
*                 $ref: '#/components/schemas/Borrow'
*       500:
*         description: Server error
*   post:
*     summary: Create a new borrow
*     tags: [Borrows]
*     requestBody:
*       required: true
*       content:
*         application/json:
*           schema:
*             $ref: '#/components/schemas/CreateBorrow'
*     responses:
*       201:
*         description: Borrow created successfully
*         content:
*           application/json:
*             schema:
*               $ref: '#/components/schemas/Borrow'
*       404:
*         description: Borrow creation failed due to missing or invalid data
*       422:
*         description: Borrow end must be after borrow star
*       500:
*         description: Server error
*
* /borrows/{id}:
*   get:
*     summary: Get a borrow by ID
*     tags: [Borrows]
*     parameters:
*       - in: path
*         name: id
*         required: true
*         schema:
*           type: integer
*         description: The borrow ID
*     responses:
*       200:
*         description: Borrow details
*         content:
*           application/json:
*             schema:
*               $ref: '#/components/schemas/Borrow'
*       404:
*         description: Borrow not found
*       500:
*         description: Server error
*   put:
*     summary: Update a borrow by ID or create a new borrow if it doesn't exist
*     tags: [Borrows]
*     parameters:
*       - in: path
*         name: id
*         required: true
*         schema:
*           type: integer
*         description: The borrow ID
*     requestBody:
*       required: true
*       content:
*         application/json:
*           schema:
*             $ref: '#/components/schemas/CreateBorrow'
*     responses:
*       200:
*         description: Borrow updated successfully
*         content:
*           application/json:
*             schema:
*               $ref: '#/components/schemas/Borrow'
*       404:
*         description: Borrow creation failed due to missing or invalid data
*       422:
*         description: Borrow end must be after borrow start
*       500:
*         description: Server error
*   delete:
*     summary: Delete a borrow by ID
*     tags: [Borrows]
*     parameters:
*       - in: path
*         name: id
*         required: true
*         schema:
*           type: integer
*         description: The borrow ID
*     responses:
*       200:
*         description: The list of borrows
*         content:
*           application/json:
*             schema:
*               type: array
*               items:
*                 $ref: '#/components/schemas/Borrow'
*       500:
*         description: Server error
*/

var express = require('express');
var router = express.Router();

let borrowController = require('../controllers/borrowsController')

router.route("/")
  .get((req, res, next) => {
    let response = borrowController.getAllBorrows();
    res.status(response.status).json(response.data);
  })
  .post((req, res, next) => {
    let response = borrowController.createBorrow(req.body);
    res.status(response.status).json(response.data);
  })

router.route("/:id")
  .get((req, res, next) => {
    let response = borrowController.readBorrow(req.params.id, req.body);
    res.status(response.status).json(response.data);
  })
  .put((req, res, next) => {
    let response = borrowController.updateBorrow(req.params.id, req.body);
    res.status(response.status).json(response.data);
  })
  .delete((req, res, next) => {
    let response = borrowController.deleteBorrow(req.params.id, req.body);
    res.status(response.status).json(response.data);
  })

module.exports = router;