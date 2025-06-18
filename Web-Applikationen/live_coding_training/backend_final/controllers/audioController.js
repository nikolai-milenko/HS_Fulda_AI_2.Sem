var fs = require('fs');
var data = fs.readFileSync('models/audio.json');

let audios;
if (data.length > 0) {
  audios = JSON.parse(data);
} else {
  audios = [];
}


function handleFiles(fileInput) {
  let file = fileInput;
  file.name = file.name.replace(/\s/g, '_');
  file.name = file.name.replace(/[^a-zA-Z0-9_.-]/g, '');
  file.mv('public/uploads/' + file.name);
  return '/uploads/' + file.name;
}

const getAllAudio = () => {
  return { status: 200, data: audios };
}

const createAudio = (data) => {
  let { title, composer, description, count } = data.body;
  if (!title || !composer || !description || !count) {
    return { status: 422, data: "title, composer, description and count must be set" };
  }
  try {
    let filename = '';
    if (data.files) {
      filename = handleFiles(data.files.file);
    }

    let newId = audios.length ? audios[audios.length - 1].id + 1 : 0;
    if (data.id) {
      newId = parseInt(data.id)
    }

    let audio = {
      id: newId,
      title: title,
      composer: composer,
      pic: filename,
      description: description,
      count: count
    }
    audios.push(audio);
    fs.writeFileSync('models/audio.json', JSON.stringify(audios, null, 2));
    return { status: 201, data: audio };
  } catch (err) {
    return { status: 500, data: err };
  }
}

const readAudio = (id) => {
  let audio = audios.find(p => p.id === parseInt(id));
  if (audio) {
    return { status: 200, data: audio };
  } else {
    return { status: 404, data: "audio existiert nicht" };
  }
}


const updateAudio = (id, data) => {
  let audioIndex = audios.findIndex(p => p.id === parseInt(id));

  let { title, composer, description, count } = data.body;

  if (audioIndex != -1) {
    let filename = audios[audioIndex].pic;
    if (data.files) {
      filename = handleFiles(data.files.file);
    }
    audios[audioIndex].pic = filename;

    if (title != undefined) { audios[audioIndex].title = title; }
    if (composer != undefined) { audios[audioIndex].composer = composer; }
    if (description != undefined) { audios[audioIndex].description = description; }
    if (count != undefined) { audios[audioIndex].count = count; }

    fs.writeFileSync('models/audio.json', JSON.stringify(audios, null, 2));
    return { status: 200, data: audios[audioIndex] };
  } else {
    data.id = id;
    return createAudio(data);
  }
}

const deleteAudio = (id) => {
  let audioIndex = audios.findIndex(p => p.id === parseInt(id));
  if (audioIndex != -1) {
    audios.splice(audioIndex, 1);
    fs.writeFileSync('models/audio.json', JSON.stringify(audios, null, 2));
  }
  return { status: 200, data: audios };
}

module.exports = {
  getAllAudio,
  createAudio,
  readAudio,
  updateAudio,
  deleteAudio
}