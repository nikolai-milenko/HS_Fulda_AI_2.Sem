// Diese Elemente werden nicht verändert und deshalb sind sie constant
const preview = document.getElementById('preview');
const historyList = document.getElementById('history');
const resetBtn = document.getElementById('reset');
const undoBtn  = document.getElementById('undo');

// Diese Elemente werden verändert und deshalb sind sie let
// Hier wird die Historie der Farben gespeichert
let colorHistory = [];

function chooseColor(color) {
    preview.style.backgroundColor = color;
    colorHistory.push(color);
    const li = document.createElement('li');
    li.textContent = color;
    historyList.appendChild(li);
}

document.getElementById('palette').addEventListener('click', e => {
    if (e.target.tagName === 'BUTTON') {
        const c = e.target.dataset.color;
        chooseColor(c);
    }
});

// Undo: letzte Farbe entfernen
undoBtn.addEventListener('click', () => {
    if (colorHistory.length === 0){
        alert('Es gibt keine Farben mehr in der Historie.');
        return;
    };
    if (colorHistory.length === 1){
        colorHistory.pop();
        historyList.removeChild(historyList.lastElementChild);
        alert('Es gibt nur eine Farbe in der Historie, deshalb wird die Farbe jetzt nicht verändert.');
        return;
    }
    colorHistory.pop();
    historyList.removeChild(historyList.lastElementChild);
    const last = colorHistory[colorHistory.length - 1];
    preview.style.backgroundColor = last;
});
