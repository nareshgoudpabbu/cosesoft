let randomNumber = Math.floor(Math.random() * 100) + 1;
let attempts = 0;

function checkGuess() {

    let guess = Number(document.getElementById("guessInput").value);

    attempts++;
    document.getElementById("attempts").innerText = attempts;

    if (guess === randomNumber) {
        document.getElementById("message").innerHTML =
            "🎉 Congratulations! You guessed correctly.";
    }
    else if (guess > randomNumber) {
        document.getElementById("message").innerHTML =
            "📈 Too High! Try Again.";
    }
    else {
        document.getElementById("message").innerHTML =
            "📉 Too Low! Try Again.";
    }
}
