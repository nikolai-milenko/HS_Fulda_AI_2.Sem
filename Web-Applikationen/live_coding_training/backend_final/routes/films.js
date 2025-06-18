/**
* @swagger
* components:  
*   schemas:
*     CreateFilm:
*       type: object
*       required:
*         - title
*         - director
*         - description
*         - count
*       properties:
*         id:
*           type: integer
*           description: The unique identifier for a film
*         title:
*           type: string
*           description: The title of the film
*         director:
*           type: string
*           description: The director of the film
*         description:
*           type: string
*           description: A brief description of the film
*         count: 
*           type: integer
*           description: The number of copies available
*         pic:
*           type: file 
*           description: The cover image of the film
*       example:
*         title: "The JavaScript Jungle"
*         director: "Hans Müller"
*         description: "Ein actiongeladener Streifzug durch Frameworks, Bugs und Debugging – für mutige Entwicklerherzen."
*         count: 5
*     Film:
*       allOf:
*         - $ref: '#/components/schemas/CreateFilm'
*         - example:
*             id: 0
*             pic: "/uploads/film-cover.jpg"
*/
/** 
* @swagger
* tags:
*   name: Films
*   description: API for managing films
*
* /films:
*   get:
*     summary: Get all films
*     tags: [Films]
*     responses:
*       200:
*         description: List of all films
*         content:
*           application/json:
*             schema:
*               type: array
*               items:
*                 $ref: '#/components/schemas/Film'
*       500:
*         description: Server error
*   post:
*     summary: Create a new film
*     tags: [Films]
*     requestBody:
*       required: true
*       content:
*         application/json:
*           schema:
*             $ref: '#/components/schemas/CreateFilm'
*     responses:
*       201:
*         description: film created successfully
*         content:
*           application/json:
*             schema:
*               $ref: '#/components/schemas/Film'
*       422:
*         description: title, director, description and count must be set
*       500:
*         description: Server error
*
* /films/{id}:
*   get:
*     summary: Get a film by ID
*     tags: [Films]
*     parameters:
*       - in: path
*         name: id
*         required: true
*         schema:
*           type: integer
*         description: The film ID
*     responses:
*       200:
*         description: film details
*         content:
*           application/json:
*             schema:
*               $ref: '#/components/schemas/Film'
*       404:
*         description: film not found
*       500:
*         description: Server error
*   put:
*     summary: Update a film by ID or create a new film if it doesn't exist
*     tags: [Films]
*     parameters:
*       - in: path
*         name: id
*         required: true
*         schema:
*           type: integer
*         description: The film ID
*     requestBody:
*       required: true
*       content:
*         application/json:
*           schema:
*             $ref: '#/components/schemas/CreateFilm'
*     responses:
*       200:
*         description: film updated successfully
*         content:
*           application/json:
*             schema:
*               $ref: '#/components/schemas/Film'
*       422:
*         description: title, director, description and count must be set
*       500:
*         description: Server error
*   delete:
*     summary: Delete a film by ID
*     tags: [Films]
*     parameters:
*       - in: path
*         name: id
*         required: true
*         schema:
*           type: integer
*         description: The film ID
*     responses:
*       200:
*         description: The list of films
*         content:
*           application/json:
*             schema:
*               type: array
*               items:
*                 $ref: '#/components/schemas/Film'
*       500:
*         description: Server error
*/

var express = require('express');
var router = express.Router();

let filmsController = require('../controllers/filmsController')

router.route("/")
  .get((req, res, next) => {
    let response = filmsController.getAllFilms();
    res.status(response.status).json(response.data);
  })
  .post((req, res, next) => {
    let response = filmsController.createFilm(req);
    res.status(response.status).json(response.data);
  })

router.route("/:id")
  .get((req, res, next) => {
    let response = filmsController.readFilm(req.params.id, req.body);
    res.status(response.status).json(response.data);
  })
  .put((req, res, next) => {
    let response = filmsController.updateFilm(req.params.id, req);
    res.status(response.status).json(response.data);
  })
  .delete((req, res, next) => {
    let response = filmsController.deleteFilm(req.params.id, req.body);
    res.status(response.status).json(response.data);
  })

router.route("/director/:name")
  .get((req, res, next) => {
    let response = filmsController.getFilmsByDirector(req.params.name);
    res.status(response.status).json(response.data);
  }
)
module.exports = router;
