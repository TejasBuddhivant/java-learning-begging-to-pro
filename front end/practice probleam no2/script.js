let count = 0;

function updateCounter() {
    const counter = document.getElementById('output');
    counter.innerText = count;
    // counter.style.fontSize = `${5 + count * 0.5}rem`;
   
}

function plusOne() {
    count++;
    updateCounter();
}

function minusOne() {
    count--;
    updateCounter();
}