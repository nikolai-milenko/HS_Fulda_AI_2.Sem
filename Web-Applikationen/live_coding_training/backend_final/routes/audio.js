/**
* @swagger
* components:  
*   schemas:
*     CreateAudio:
*       type: object
*       required:
*         - title
*         - composer
*         - description
*         - count
*       properties:
*         id:
*           type: integer
*           description: The unique identifier for a audio
*         title:
*           type: string
*           description: The title of the audio
*         composer:
*           type: string
*           description: The composer of the audio
*         description:
*           type: string
*           description: A brief description of the audio
*         count: 
*           type: integer
*           description: The number of copies available
*         pic:
*           type: file 
*           description: The cover image of the audio
*       example:
*         title: "Syntax Symphony"
*         composer: "Julius Kramer"
*         description: "Ein orchestraler Streifzug durch die Welt von HTML, CSS und JavaScript."
*         count: 5
*     Audio:
*       allOf:
*         - $ref: '#/components/schemas/CreateAudio'
*         - example:
*             id: 0
*             pic: "/uploads/audio-cover.jpg"
*/
/** 
* @swagger
* tags:
*   name: Audios
*   description: API for managing audios
*
* /audios:
*   get:
*     summary: Get all audios
*     tags: [Audios]
*     responses:
*       200:
*         description: List of all audios
*         content:
*           application/json:
*             schema:
*               type: array
*               items:
*                 $ref: '#/components/schemas/Audio'
*       404:
*         description: No audios found
*       500:
*         description: Server error
*   post:
*     summary: Create a new audio
*     tags: [Audios]
*     requestBody:
*       required: true
*       content:
*         application/json:
*           schema:
*             $ref: '#/components/schemas/CreateAudio'
*     responses:
*       201:
*         description: Audio created successfully
*         content:
*           application/json:
*             schema:
*               $ref: '#/components/schemas/Audio'
*       422:
*         description: Validation error, title, composer, description and count must be set
*       500:
*         description: Server error
*
* /audios/{id}:
*   get:
*     summary: Get a audio by ID
*     tags: [Audios]
*     parameters:
*       - in: path
*         name: id
*         required: true
*         schema:
*           type: integer
*         description: The audio ID
*     responses:
*       200:
*         description: Audio details
*         content:
*           application/json:
*             schema:
*               $ref: '#/components/schemas/Audio'
*       404:
*         description: Audio not found
*       500:
*         description: Server error
*   put:
*     summary: Update a audio by ID or create a new audio if it doesn't exist
*     tags: [Audios]
*     parameters:
*       - in: path
*         name: id
*         required: true
*         schema:
*           type: integer
*         description: The audio ID
*     requestBody:
*       required: true
*       content:
*         application/json:
*           schema:
*             $ref: '#/components/schemas/CreateAudio'
*     responses:
*       200:
*         description: Audio updated successfully
*         content:
*           application/json:
*             schema:
*               $ref: '#/components/schemas/Audio'
*       422:
*         description: Validation error, title, composer, description and count must be set
*       500:
*         description: Server error
*   delete:
*     summary: Delete a audio by ID
*     tags: [Audios]
*     parameters:
*       - in: path
*         name: id
*         required: true
*         schema:
*           type: integer
*         description: The audio ID
*     responses:
*       200:
*         description: The list of audios
*         content:
*           application/json:
*             schema:
*               type: array
*               items:
*                 $ref: '#/components/schemas/Audio'
*       500:
*         description: Server error
*/

var express = require('express');
var router = express.Router();

let audioController = require('../controllers/audioController')

router.route("/")
  .get((req, res, next) => {
    let response = audioController.getAllAudio();
    res.status(response.status).json(response.data);
  })
  .post((req, res, next) => {
    let response = audioController.createAudio(req);
    res.status(response.status).json(response.data);
  })

router.route("/:id")
  .get((req, res, next) => {
    let response = audioController.readAudio(req.params.id, req.body);
    res.status(response.status).json(response.data);
  })
  .put((req, res, next) => {
    let response = audioController.updateAudio(req.params.id, req);
    res.status(response.status).json(response.data);
  })
  .delete((req, res, next) => {
    let response = audioController.deleteAudio(req.params.id, req.body);
    res.status(response.status).json(response.data);
  })

module.exports = router;
