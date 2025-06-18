var fs = require('fs');
var data = fs.readFileSync('models/journals.json');

let journals;
if (data.length > 0) {
  journals = JSON.parse(data);
} else {
  journals = [];
}

function handleFiles(fileInput) {
  let file = fileInput;
  file.name = file.name.replace(/\s/g, '_');
  file.name = file.name.replace(/[^a-zA-Z0-9_.-]/g, '');
  file.mv('public/uploads/' + file.name);
  return '/uploads/' + file.name;
}

const getAllJournals = () => {
  return { status: 200, data: journals };
}

const createJournal = (data) => {
  let { title, author, description, count } = data.body;
  if (!title || !author || !description || !count) {
    return { status: 422, data: "title, author, description and count must be set" };
  }
  try {
    let filename = '';
    if (data.files) {
      filename = handleFiles(data.files.file);
    }

    let newId = journals.length ? journals[journals.length - 1].id + 1 : 0;
    if (data.id) {
      newId = parseInt(data.id)
    }

    let journal = {
      id: newId,
      title: title,
      author: author,
      pic: filename,
      description: description,
      count: count
    }
    journals.push(journal);
    fs.writeFileSync('models/journals.json', JSON.stringify(journals, null, 2));
    return { status: 201, data: journal };
  } catch (err) {
    return { status: 500, data: err };
  }
}

const readJournal = (id) => {
  let journal = journals.find(p => p.id === parseInt(id));
  if (journal) {
    return { status: 200, data: journal };
  } else {
    return { status: 404, data: "journal existiert nicht" };
  }
}


const updateJournal = (id, data) => {
  let journalIndex = journals.findIndex(p => p.id === parseInt(id));

  let { title, author, description, count } = data.body;

  if (journalIndex != -1) {
    let filename = journals[journalIndex].pic;
    if (data.files) {
      filename = handleFiles(data.files.file);
    }
    journals[journalIndex].pic = filename;

    if (title != undefined) { journals[journalIndex].title = title; }
    if (author != undefined) { journals[journalIndex].author = author; }
    if (description != undefined) { journals[journalIndex].description = description; }
    if (count != undefined) { journals[journalIndex].count = count; }

    fs.writeFileSync('models/journals.json', JSON.stringify(journals, null, 2));
    return { status: 200, data: journals[journalIndex] };
  } else {
    data.id = id;
    return createJournal(data);
  }
}

const deleteJournal = (id) => {
  let journalIndex = journals.findIndex(p => p.id === parseInt(id));
  if (journalIndex != -1) {
    journals.splice(journalIndex, 1);
    fs.writeFileSync('models/journals.json', JSON.stringify(journals, null, 2));
  }
  return { status: 200, data: journals };
}

module.exports = {
  getAllJournals,
  createJournal,
  readJournal,
  updateJournal,
  deleteJournal
}