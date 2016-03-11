
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Guessing Game - JavaBean Version</title>
<jsp:useBean id="msg" scope="session" class="model.MessageBean" />
</head>
<body>
<H1>Guessing Game - JavaBean Version</h1>

<p><jsp:getProperty name="msg" property="correctGuessMsg" /></p>

<p>
<a href=index.jsp>
  Play Again
</a>
</p>
</body>
</html>