<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Phillip's Amortization Calculator</title>
</head>
<body>
<h1>Phillip's Amortization Calculator</h1>

<form name="view" action="doAmortization" method="post">

	<label>
		Loan Principal:
	</label>
		<input type="text" name="Principal" value="0"/><br><br>
		
		Loan Term:
	<label>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="Term" value="0"/><br><br>
	
		Loan Rate:
	</label>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="Rate" value="0"/><br><br><br>
		
	<input type="submit" value="Submit"/>	

</form>
</body>
</html>