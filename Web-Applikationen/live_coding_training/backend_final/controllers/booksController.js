var fs = require('fs');
var data = fs.readFileSync('models/books.json');

let books;
if (data.length > 0) {
  books = JSON.parse(data);
} else {
  books = [];
}

function handleFiles(fileInput) {
  let file = fileInput;
  file.name = file.name.replace(/\s/g, '_');
  file.name = file.name.replace(/[^a-zA-Z0-9_.-]/g, '');
  file.mv('public/uploads/' + file.name);
  return '/uploads/' + file.name;
}

const getAllBooks = () => {
  return { status: 200, data: books };
}

const createBook = (data) => {
  let { title, author, description, count } = data.body;
  if (!title || !author || !description || !count) {
    return { status: 422, data: "title, author, description and count must be set" };
  }
  try {
    let filename = '';
    if (data.files) {
      filename = handleFiles(data.files.file);
    }

    let newId = books.length ? books[books.length - 1].id + 1 : 0;
    if (data.id) {
      newId = parseInt(data.id)
    }

    let book = {
      id: newId,
      title: title,
      author: author,
      pic: filename,
      description: description,
      count: count
    }
    books.push(book);
    fs.writeFileSync('models/books.json', JSON.stringify(books, null, 2));
    return { status: 201, data: book };
  } catch (err) {
    return { status: 500, data: err };
  }
}

const readBook = (id) => {
  let book = books.find(p => p.id === parseInt(id));
  if (book) {
    return { status: 200, data: book };
  } else {
    return { status: 404, data: "book existiert nicht" };
  }
}


const updateBook = (id, data) => {
  let bookIndex = books.findIndex(p => p.id === parseInt(id));

  let { title, author, description, count } = data.body;

  if (bookIndex != -1) {
    let filename = books[bookIndex].pic;
    if (data.files) {
      filename = handleFiles(data.files.file);
    }
    books[bookIndex].pic = filename;

    if (title != undefined) { books[bookIndex].title = title; }
    if (author != undefined) { books[bookIndex].author = author; }
    if (description != undefined) { books[bookIndex].description = description; }
    if (count != undefined) { books[bookIndex].count = count; }

    fs.writeFileSync('models/books.json', JSON.stringify(books, null, 2));
    return { status: 200, data: books[bookIndex] };
  } else {
    data.id = id;
    return createBook(data);
  }
}

const deleteBook = (id) => {
  let bookIndex = books.findIndex(p => p.id === parseInt(id));
  if (bookIndex != -1) {
    books.splice(bookIndex, 1);
    fs.writeFileSync('models/books.json', JSON.stringify(books, null, 2));
  }
  return { status: 200, data: books };
}

const getBooksByAuthor = (authorName) => {
  let foundBooks = Array.isArray(books)
    ? books
      .filter(book => book.author.toLowerCase() === authorName.toLowerCase())
      .map(book => ({
        title: book.title,
        description: book.description
      }))
    : [];
  if (foundBooks.length === 0) {
    // If no books found, return a 404 status with a message
    return { status: 404, data: "No books found for this author." };
  }
  else {
    return { status: 200, data: foundBooks };
  }
}

module.exports = {
  getAllBooks,
  createBook,
  readBook,
  updateBook,
  deleteBook,
  getBooksByAuthor
}