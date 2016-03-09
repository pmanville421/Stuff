<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
    
<jsp:useBean id="guesses" scope="session" class="model.GameNumber" />
<jsp:useBean id="message" scope="session" class="model.MessageBean" />
<jsp:useBean id="target" scope="session" class="model.GameNumber" />

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Piercy's Guessing Game</title>
</head>
<body>
  <h1>Piercy's Guessing Game</h1>
  
  <p>
     <jsp:getProperty property="message" name="message"/>
  </p>
  
  <form name="guessForm" action="doGuess" method="get">
     <label>
        Guess <jsp:getProperty property="value" name="guesses"/>: 
     </label>
     <input type="text" name="guess" /><br />
     <input type="submit" name="submit" value="Make Guess">
  
  </form>
</body>
</html>