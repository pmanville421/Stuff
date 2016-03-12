<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<%@ page import="model.Player" %>


    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>WAR!</title>
<link rel="stylesheet" type="text/css" href="stylesheet.css" />
</head>
<body>
<h1><span style="color:#0066ff">THIS</span> IS WAR! (<span style="color:#0066ff">The Card Game</span>)</h1>
  
<div class="img"><img src="classic-cards/background.jpg" alt="background"></div>
  
<div class="instructions"><p><span style="color:#0066ff">Prepare</span> for War! Enter Your <span style="color:#0066ff">Names</span> and Hit <span style="color:#0066ff">START!</span></p></div>
  
  
  
  
<div align="center" style="margin-top: 50px;">
 
 <form name="playWar" action="doPlay" method="post">
		
<div class="footer">
	<label> P1 Name: <input type="text" name="player1" />
		    P2 Name: <input type="text" name="player2" />
	</label>
		<p class="submit"><input type="submit" name="start" value="START!"></p>
		
</div>
</form>

     
</div>   

</body>
</html>