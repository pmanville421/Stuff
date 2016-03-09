
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Guessing Game With EL</title>
</head>
<body>
<H1>Guessing Game With EL</h1>

<H2>Your Results:</H2>

${guesses.value <= guessTimates["10"] ? "You're Psychic!" : guesses.value <= guessTimates["50"] ? "Superb!": 
guesses.value <= guessTimates["100"] ? "Excellent!" : guesses.value <= guessTimates["500"] ? "Not Bad!" : 
guesses.value <= guessTimates["1000"] ? "Decent." : guesses.value <= guessTimates["5000"] ? "Hmm, you can do better.": 
guesses.value <= guessTimates["10000"] ? "You might need to play a different game..." : "EPIC FAIL!"}



${empty param.guess ? "Please enter a number!" : "Thanks for playing!"}

<p>
<a href=index.jsp>
  Play Again
</a>
</p>
<br/>
${header["user-agent"]}
</body>
</html>