function getNumbers() {
    const firstNum = parseFloat(document.getElementById('firstnum').value) || 0;
    const secondNum = parseFloat(document.getElementById('secondnum').value) || 0;
    return { firstNum, secondNum };
}

let displayResult = (result)=>{
    document.getElementById('output').innerText = result;
}

function Addition() {
    const { firstNum, secondNum } = getNumbers();
    displayResult(firstNum + secondNum);
}

function Minus() {
    const { firstNum, secondNum } = getNumbers();
    displayResult(firstNum - secondNum);
}

function Multiplication() {
    const { firstNum, secondNum } = getNumbers();
    displayResult(firstNum * secondNum);
}

function Division() {
    const { firstNum, secondNum } = getNumbers();
    if (secondNum === 0) {
        displayResult('Error: Division by zero');
    } else {
        displayResult(firstNum / secondNum);
    }
}

function Moduler() {
    const { firstNum, secondNum } = getNumbers();
    if (secondNum === 0) {
        displayResult('Error: Division by zero');
    } else {
        displayResult(firstNum % secondNum);
    }
}