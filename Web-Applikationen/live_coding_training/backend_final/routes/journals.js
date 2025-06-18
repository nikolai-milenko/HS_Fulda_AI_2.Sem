/**
* @swagger
* components:  
*   schemas:
*     CreateJournal:
*       type: object
*       required:
*         - title
*         - author
*         - description
*         - count
*       properties:
*         id:
*           type: integer
*           description: The unique identifier for a journal
*         title:
*           type: string
*           description: The title of the journal
*         author:
*           type: string
*           description: The author of the journal
*         description:
*           type: string
*           description: A brief description of the journal
*         count: 
*           type: integer
*           description: The number of copies available
*         pic:
*           type: file 
*           description: The cover image of the journal
*       example:
*         title: "Frontend Weekly"
*         author: "Lisa Bergmann"
*         description: "Aktuelle Trends, Tools und Best Practices für moderne Weboberflächen."
*         count: 5
*     Journal:
*       allOf:
*         - $ref: '#/components/schemas/CreateJournal'
*         - example:
*             id: 0
*             pic: "/uploads/journal-cover.jpg" 
*/
/** 
* @swagger
* tags:
*   name: Journals
*   description: API for managing journals
*
* /journals:
*   get:
*     summary: Get all journals
*     tags: [Journals]
*     responses:
*       200:
*         description: List of all journals
*         content:
*           application/json:
*             schema:
*               type: array
*               items:
*                 $ref: '#/components/schemas/Journal'
*       500:
*         description: Server error
*   post:
*     summary: Create a new journal
*     tags: [Journals]
*     requestBody:
*       required: true
*       content:
*         application/json:
*           schema:
*             $ref: '#/components/schemas/CreateJournal'
*     responses:
*       201:
*         description: Journal created successfully
*         content:
*           application/json:
*             schema:
*               $ref: '#/components/schemas/Journal'
*       422:
*         description: Validation error, title, author, description and count must be set
*       500:
*         description: Server error
*
* /journals/{id}:
*   get:
*     summary: Get a journal by ID
*     tags: [Journals]
*     parameters:
*       - in: path
*         name: id
*         required: true
*         schema:
*           type: integer
*         description: The journal ID
*     responses:
*       200:
*         description: Journal details
*         content:
*           application/json:
*             schema:
*               $ref: '#/components/schemas/Journal'
*       404:
*         description: Journal not found
*       500:
*         description: Server error
*   put:
*     summary: Update a journal by ID or create a new journal if it doesn't exist
*     tags: [Journals]
*     parameters:
*       - in: path
*         name: id
*         required: true
*         schema:
*           type: integer
*         description: The journal ID
*     requestBody:
*       required: true
*       content:
*         application/json:
*           schema:
*             $ref: '#/components/schemas/CreateJournal'
*     responses:
*       200:
*         description: Journal updated successfully
*         content:
*           application/json:
*             schema:
*               $ref: '#/components/schemas/Journal'
*       422:
*         description: Validation error, title, author, description and count must be set
*       500:
*         description: Server error
*   delete:
*     summary: Delete a journal by ID
*     tags: [Journals]
*     parameters:
*       - in: path
*         name: id
*         required: true
*         schema:
*           type: integer
*         description: The journal ID
*     responses:
*       200:
*         description: The list of journals
*         content:
*           application/json:
*             schema:
*               type: array
*               items:
*                 $ref: '#/components/schemas/Journal'
*       500:
*         description: Server error
*/

var express = require('express');
var router = express.Router();

let journalsController = require('../controllers/journalsController')

router.route("/")
  .get((req, res, next) => {
    let response = journalsController.getAllJournals();
    res.status(response.status).json(response.data);
  })
  .post((req, res, next) => {
    let response = journalsController.createJournal(req);
    res.status(response.status).json(response.data);
  })

router.route("/:id")
  .get((req, res, next) => {
    let response = journalsController.readJournal(req.params.id, req.body);
    res.status(response.status).json(response.data);
  })
  .put((req, res, next) => {
    let response = journalsController.updateJournal(req.params.id, req);
    res.status(response.status).json(response.data);
  })
  .delete((req, res, next) => {
    let response = journalsController.deleteJournal(req.params.id, req.body);
    res.status(response.status).json(response.data);
  })

module.exports = router;
