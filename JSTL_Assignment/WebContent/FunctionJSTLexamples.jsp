<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>        
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Functions JSTL</title>
<link rel="stylesheet" type="text/css" href="stylesheet.css" />
</head>
<body>
<h1><span style="color:red">Function JSTL</span></h1>


<h2>contains, containsIgnoreCase, endsWith</h2>
<c:set var="BatmanVsSuperman" value="Dawn of Justice"/>

<c:if test="${fn:contains(BatmanVsSuperman, 'Justice')}">
   <p>Prepare for alot of Justice!<p>
</c:if>
<c:if test="${fn:contains(BatmanVsSuperman, 'justice')}">
   <p>Prepare for a little justice!<p>
</c:if>


<c:if test="${fn:containsIgnoreCase(BatmanVsSuperman, 'justice')}">
   <p>Justice comes in many forms!<p>
</c:if>
<c:if test="${fn:containsIgnoreCase(BatmanVsSuperman, 'justice')}">
   <p>Prepare for a little justice!<p>
</c:if>
<c:if test="${fn:endsWith(BatmanVsSuperman, 'fire')}">
   <p>Dawn of justice...<p>
</c:if>
<c:if test="${fn:endsWith(BatmanVsSuperman, 'ice')}">
   <p>Dawn of Justice!<p>
</c:if>


<br />
<p>
<c:url var="url" value="/index.jsp"/>
<a href="${url}">Go Back to Homepage</a>
</p>    
</body>
</html>