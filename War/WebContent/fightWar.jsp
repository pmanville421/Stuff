<jsp:useBean id="card" scope="session" class="model.Card" />
<jsp:useBean id="deck" scope="session" class="model.Deck" />
<jsp:useBean id="player" scope="session" class="model.Player" />

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>War Challenge!</title>
<link rel="stylesheet" type="text/css" href="stylesheet.css" />
</head>
<body>
<h1><span style="color:#0066ff">THIS</span> IS WAR! (<span style="color:#0066ff">The Card Game</span>)</h1>
<div id ="red">
<p>
<p>
${sessionScope.playerName1}
</p>
<img class ="card-image" src= "classic-cards/${player1TopCard}.png"/>
<%
	Deck warDeckPlayer1 = (Deck) session.getAttribute("warDeckPlayer1");
	for(int i = 0;i < warDeckPlayer1.getCardsLeft();i++)
	{
%>
<img class ="card-image" src= "classic-cards/<%=warDeckPlayer1.getCard(i).toString()%>.png"/>
<%} %>

<p>
Score:${sessionScope.playerScore1} 
</p>

</div>


<div id ="blue">
<p>

${sessionScope.playerName2}
</p>
<img class ="card-image" src= "classic-cards/${player2TopCard}.png"/>
<%
	Deck warDeckPlayer2 = (Deck) session.getAttribute("p2WarDeck");
	for(int i = 0; i < warDeckPlayer2.getCardsLeft();i++)
{
%>
<img class ="card-image" src= "classic-cards/<%=warDeckPlayer2.getCard(i).toString() %>.png"/>
<%} %>



<p>
Score:${sessionScope.playerScore2} 
</p>

<div align="center" style="margin-top: 50px;">
 
 <form name="playGame" action="doPlay" method="post">
		
<div class="footer">

<p class="submit"><input type="submit" name="continue" value="Continue"></p>
		
</div>
</form>

</div>
</div>

</body>
</html>