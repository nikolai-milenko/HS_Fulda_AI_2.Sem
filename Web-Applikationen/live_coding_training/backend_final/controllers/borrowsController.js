var fs = require('fs');
var data = fs.readFileSync('models/borrows.json');

let borrows;
if (data.length > 0) {
    borrows = JSON.parse(data);
} else {
    borrows = [];
}

let userController = require('./usersController');
let bookController = require('./booksController');
let audioController = require('./audioController');
let filmController = require('./filmsController');
let journalController = require('./journalsController');


function checkBorrow(bor) {
    let { userid, articleId, articleType, start, end } = bor;

    if (userController.readUser(userid).status !== 200) {
        return { status: 404, data: "user does not exists" };
    }
    if (articleType === "book") {
        if (bookController.readBook(articleId).status !== 200) {
            return { status: 404, data: "book does not exists" };
        }
    }
    if (articleType === "audio") {
        if (audioController.readAudio(articleId).status !== 200) {
            return { status: 404, data: "audio does not exists" };
        }
    }
    if (articleType === "film") {
        if (filmController.readFilm(articleId).status !== 200) {
            return { status: 404, data: "film does not exists" };
        }
    }
    if (articleType === "journal") {
        if (journalController.readJournal(articleId).status !== 200) {
            return { status: 404, data: "journal does not exists" };
        }
    }
    if (!start || !end) {
        return { status: 404, data: "Borrow start and end must be set" };
    }

    let startDate, endDate;
    try {
        startDate = Date.parse(start);
        endDate = Date.parse(end);
        if (!startDate || !endDate) {
            return { status: 422, data: "Date format error" };
        } else if (endDate < startDate) {
            return { status: 422, data: "Borrow end must be after borrow start" };
        }
    } catch (err) {
        return { status: 404, data: err };
    }
    return { status: 200, data: "" };
}

const getAllBorrows = () => {
    return { status: 200, data: borrows };
}

const createBorrow = (bor) => {
    let { userid, articleId, articleType, start, end } = bor;

    let check = checkBorrow(bor);
    if (check.status !== 200) {
        return { status: check.status, data: check.data };
    }

    let newId = borrows.length ? borrows[borrows.length - 1].id + 1 : 0;
    if (data.id) {
        newId = parseInt(data.id)
    }

    try {
        let borrow = {
            id: newId,
            userid: userid,
            articleId: articleId,
            articleType: articleType,
            start: start,
            end: end
        }
        borrows.push(borrow);
        fs.writeFileSync('models/borrows.json', JSON.stringify(borrows, null, 2));
        return { status: 201, data: borrow };
    } catch (err) {
        return { status: 404, data: err };
    }
}

const readBorrow = (id) => {
    let borrow = borrows.find(p => p.id === parseInt(id));
    if (borrow) {
        return { status: 201, data: borrow };
    } else {
        return { status: 404, data: "Borrow existiert nicht" };
    }
}

const updateBorrow = (id, bor) => {
    let borrowIndex = borrows.findIndex(p => p.id === parseInt(id));
    let { userid, articleId, articleType, start, end } = bor;

    let check = checkBorrow(bor);
    if (check.status !== 200) {
        return { status: check.status, data: check.data };
    }

    if (borrowIndex != -1) {
        if (userid != undefined) { borrows[borrowIndex].userid = userid; };
        if (articleId != undefined) { borrows[borrowIndex].articleId = articleId; };
        if (articleType != undefined) { borrows[borrowIndex].articleType = articleType; };
        if (start != undefined) { borrows[borrowIndex].start = start; };
        if (end != undefined) { borrows[borrowIndex].end = end; };

        fs.writeFileSync('models/borrows.json', JSON.stringify(borrows, null, 2));
        return { status: 200, data: borrows[borrowIndex] };
    } else {
        data.id = id;
        return createBorrow(bor);
    }
}

const deleteBorrow = (id) => {
    let borrowIndex = borrows.findIndex(p => p.id === parseInt(id));
    if (borrowIndex != -1) {
        borrows.splice(borrowIndex, 1);
        fs.writeFileSync('models/borrows.json', JSON.stringify(borrows, null, 2));
    }
    return { status: 200, data: borrows };
}

const findOverdueAfterDate = (endDate) => {
    let end = Date.parse(endDate);
    if (!end) {
        return { status: 422, data: "Date format error" };
    }
    let result = borrows.filter(b => Date.parse(b.end) <= end);
    return { status: 200, data: result };
}

module.exports = {
    getAllBorrows,
    createBorrow,
    readBorrow,
    updateBorrow,
    deleteBorrow,
    findOverdueAfterDate: findOverdueAfterDate
}