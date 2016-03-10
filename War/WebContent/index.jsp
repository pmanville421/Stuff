<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>WAR!</title>
<link rel="stylesheet" type="text/css" href="stylesheet.css" />
</head>
<body>
<h1>THIS IS WAR!</h1>

<div class="headermsg">
<p>
    Prepare for War! Enter your Names and Hit START!
</p>
</div>  
<div class="img"><img src="classic-cards/background.jpg" alt="background" ></div>
  
  <div class="form"><form name="players" method="get">
     <label>
        Player 1
     </label>
     <input type="text" name="player1" /><br />
     <label>
     	Player 2
     </label>
     <input type="text" name="player2" /><br /><br />
     <input type="submit" name="play" value="START!">
     
     
</form>
</div>

</body>
</html>