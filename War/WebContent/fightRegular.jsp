
<jsp:useBean id="card" scope="session" class="model.Card" />
<jsp:useBean id="deck" scope="session" class="model.Deck" />
<jsp:useBean id="player" scope="session" class="model.Player" />

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Regular Battle JSP</title>
<link rel="stylesheet" type="text/css" href="stylesheet.css" />
</head>
<body>
<h1><span style="color:#0066ff">THIS</span> IS WAR! (<span style="color:#0066ff">The Card Game</span>)</h1>

<div class="img"><img src="classic-cards/background.jpg" alt="background"></div>


<div id ="blue">
<p>
<img class ="cards" src= "classic-cards/${player1TopCard}.png"/>
</p>
	Cards Left: ${player1CardsLeft}
<p>
	${sessionScope.player1}
</p>
<p>
	Score:${sessionScope.playerScore1} 
</p>

</div>


<div id ="red">
<p>
<img class ="card-image" src= "classic-cards/${player2TopCard}.png">
</p>
	Cards Left: ${player2CardsLeft }
<p>
	${sessionScope.player2}
</p>

<p>
	Score:${sessionScope.playerScore2} 
</p>

</div>

<div align="center" style="margin-top: 50px;">
 
 <form name="playGame" action="doPlay" method="post">
		
<div class="footer">
	
	<%boolean warStart = ((Boolean)session.getAttribute("warStart")).booleanValue();
			if(warStart){%>
				 <input type="submit" name="warStart" value= "Prepare For War!">
			
			<%}else{%>
	
		<p class="submit"><input type="submit" name="continue" value="Continue"></p>
		<%} %>
</div>
</form>

     
</div> 

</body>
</html>