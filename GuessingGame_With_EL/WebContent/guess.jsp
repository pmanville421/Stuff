<jsp:useBean id="guesses" scope="session" class="model.GameNumber">
	<jsp:setProperty name="guesses" property="value" value="1"/>
</jsp:useBean>


<jsp:useBean id="msg" scope="session" class="model.MessageBean"/>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Guessing Game With EL</title>
</head>
<body>
  <h1>Guessing Game With EL</h1>
  
  <p> Choose between: 
    1 and 1000
  </p>
  <p><jsp:getProperty name="msg" property="guessMsg" /></p>

  
  <form name="guessForm" action="doGuess" method="get">
       <label id="guessLabel">Guess <jsp:getProperty name="guesses" property="value" />:</label>
     <input type="text" name="guess" /><br />
     <input type="submit" name="submit" value="Make Guess">
     

  </form>
  
<h2>Lets Check Our Map Guide!</h2>
<!-- Map below -->
<table border=1>
<tr>
<td>See where you rank in Guesstimates!!</td></tr>
<tr><td>${guessTimates["10"]}</td>
</tr>
<tr>
<td>${guessTimates["50"]}</td>
</tr>
<tr>
<td>${guessTimates["100"]}</td>
</tr>
<tr>
<td>${guessTimates["500"]}</td>
</tr>
<tr>
<td>${guessTimates["1000"]}</td>
</tr>
<tr>
<td>${guessTimates["5000"]}</td>
</tr>
<tr>
<td>${guessTimates["10000"]}</td>
</tr>
</table>
</body>
</html>