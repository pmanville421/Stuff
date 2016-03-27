<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formatting JSTL</title>
<link rel="stylesheet" type="text/css" href="stylesheet.css" />
</head>
<body>
<h1><span style="color:red">Formatting JSTL</span></h1>

<h2>formatNumber, setLocale, parseNumber</h2>
<c:set var="paid" value="421.87" />
<fmt:formatNumber type="percent" maxIntegerDigits="2" value="${paid}" />
<br />

<fmt:setLocale value="en_US"/>
<fmt:formatNumber value="${paid}" type="currency"/>
<br />
Parsing the Value for "Paid":
<fmt:parseNumber var="i" integerOnly="true" type="number" value="${paid}" />
<c:out value="${i}" />


<h2>formatDate</h2>
<p>Shows todays date</p>
<c:set var="today" value="<%=new java.util.Date()%>" />
<fmt:formatDate pattern="yyyy-MM-dd" value="${today}" />
<br />



<p>
<c:url var="url" value="/index.jsp"/>
<a href="${url}">Go Back to Homepage</a>

</p>    
</body>
</html>