let sessionLength = 25;
let breakLength = 5;
let timeLeft = sessionLength * 60;
let isRunning = false;
let isSession = true;
let interval;

const timeDisplay = document.getElementById('time');
const sessionLengthDisplay = document.getElementById('session-length');
const breakLengthDisplay = document.getElementById('break-length');

document.getElementById('session-decrement').addEventListener('click', () => {
    if (sessionLength > 1) {
        sessionLength--;
        sessionLengthDisplay.textContent = sessionLength;
        if (isSession) {
            timeLeft = sessionLength * 60;
            updateTimeDisplay();
        }
    }
});

document.getElementById('session-increment').addEventListener('click', () => {
    sessionLength++;
    sessionLengthDisplay.textContent = sessionLength;
    if (isSession) {
        timeLeft = sessionLength * 60;
        updateTimeDisplay();
    }
});

document.getElementById('break-decrement').addEventListener('click', () => {
    if (breakLength > 1) {
        breakLength--;
        breakLengthDisplay.textContent = breakLength;
    }
});

document.getElementById('break-increment').addEventListener('click', () => {
    breakLength++;
    breakLengthDisplay.textContent = breakLength;
});

document.getElementById('reset').addEventListener('click', reset);
document.getElementById('start').addEventListener('click', start);

function reset() {
    clearInterval(interval);
    isRunning = false;
    isSession = true;
    sessionLength = 25;
    breakLength = 5;
    timeLeft = sessionLength * 60;
    sessionLengthDisplay.textContent = sessionLength;
    breakLengthDisplay.textContent = breakLength;
    updateTimeDisplay();
}

function start() {
    if (isRunning) {
        clearInterval(interval);
        isRunning = false;
        document.getElementById('start').textContent = 'Start';
    } else {
        interval = setInterval(countDown, 1000);
        isRunning = true;
        document.getElementById('start').textContent = 'Pause';
    }
}

function countDown() {
    if (timeLeft <= 0) {
        isSession = !isSession;
        timeLeft = (isSession ? sessionLength : breakLength) * 60;
    } else {
        timeLeft--;
    }
    updateTimeDisplay();
}

function updateTimeDisplay() {
    const minutes = Math.floor(timeLeft / 60);
    const seconds = timeLeft % 60;
    timeDisplay.textContent = `${minutes < 10 ? '0' : ''}${minutes}:${seconds < 10 ? '0' : ''}${seconds}`;
}

updateTimeDisplay();
