<jsp:useBean id="card" scope="session" class="model.Card" />
<jsp:useBean id="deck" scope="session" class="model.Deck" />
<jsp:useBean id="player" scope="session" class="model.Player" />

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Winner!</title>
</head>
<body>
<h1><span style="color:#0066ff">THIS</span> IS WAR! (<span style="color:#0066ff">The Card Game</span>)</h1>
<div class="img"><img src="classic-cards/background.jpg" alt="background"></div>
<p>
The WINNER is: ${gameWinner}
</p>
</body>
</html>