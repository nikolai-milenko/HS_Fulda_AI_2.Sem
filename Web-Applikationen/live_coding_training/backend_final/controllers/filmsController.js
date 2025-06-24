var fs = require('fs');
var data = fs.readFileSync('models/films.json');

let films;
if (data.length > 0) {
  films = JSON.parse(data);
} else {
  films = [];
}

function handleFiles(fileInput) {
  let file = fileInput;
  file.name = file.name.replace(/\s/g, '_');
  file.name = file.name.replace(/[^a-zA-Z0-9_.-]/g, '');
  file.mv('public/uploads/' + file.name);
  return '/uploads/' + file.name;
}

const getAllFilms = () => {
  return { status: 200, data: films };
}

const createFilm = (data) => {
  let { title, director, description, count, eanNummer } = data.body;
  // console.log(eanNummer)
  if (!title || !director || !description || !count || !eanNummer || eanNummer.toString().length !== 13) {
    return { status: 422, data: "title, director, description, count and EAN-Number must be set. EAN-Number length must be exactly 13." };
  }
  try {
    let filename = '';
    if (data.files) {
      filename = handleFiles(data.files.file);
    }

    let newId = films.length ? films[films.length - 1].id + 1 : 0;
    if (data.id) {
      newId = parseInt(data.id)
    }

    let film = {
      id: newId,
      title: title,
      director: director,
      pic: filename,
      description: description,
      count: count,
      eanNummer: eanNummer
    }
    films.push(film);
    fs.writeFileSync('models/films.json', JSON.stringify(films, null, 2));
    return { status: 201, data: film };
  } catch (err) {
    return { status: 500, data: err };
  }
}

const readFilm = (id) => {
  let film = films.find(p => p.id === parseInt(id));
  if (film) {
    return { status: 200, data: film };
  } else {
    return { status: 404, data: "film existiert nicht" };
  }
}


const updateFilm = (id, data) => {
  let filmIndex = films.findIndex(p => p.id === parseInt(id));

  let { title, director, description, count, eanNummer } = data.body;

  if (filmIndex != -1) {
    let filename = films[filmIndex].pic;
    if (data.files) {
      filename = handleFiles(data.files.file);
    }
    films[filmIndex].pic = filename;

    if (title != undefined) { films[filmIndex].title = title; }
    if (director != undefined) { films[filmIndex].director = director; }
    if (description != undefined) { films[filmIndex].description = description; }
    if (count != undefined) { films[filmIndex].count = count; }
    if (eanNummer != undefined) {
      if (eanNummer.toString().length !== 13) {
        return { status: 422, data: "EAN-Number length must be exactly 13." };
      }
      films[filmIndex].eanNummer = eanNummer;
    }

    fs.writeFileSync('models/films.json', JSON.stringify(films, null, 2));
    return { status: 200, data: films[filmIndex] };
  } else {
    data.id = id;
    return createFilm(data);
  }
}

const deleteFilm = (id) => {
  let filmIndex = films.findIndex(p => p.id === parseInt(id));
  if (filmIndex != -1) {
    films.splice(filmIndex, 1);
    fs.writeFileSync('models/films.json', JSON.stringify(films, null, 2));
  }
  return { status: 200, data: films };
}

const getFilmsByDirector = (director) => {
  let filteredFilms = films.filter(film => film.director.toLowerCase() === director.toLowerCase());
  if (filteredFilms.length > 0) {
    return { status: 200, data: filteredFilms };
  }
  return { status: 404, data: "No films found for this director" };
}

module.exports = {
  getAllFilms,
  createFilm,
  readFilm,
  updateFilm,
  deleteFilm,
  getFilmsByDirector
}