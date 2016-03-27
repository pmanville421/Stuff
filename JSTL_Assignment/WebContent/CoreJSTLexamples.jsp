<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Core JSTL</title>
<link rel="stylesheet" type="text/css" href="stylesheet.css" />
</head>
<body>
<h1><span style="color:red">Core JSTL</span></h1>
<h2>
Example of forEach, if, and out (featuring import). <br />
(11 reference from <span style="color:blue"><em>"This is Spinal Tap"</em></span> lol)<br />
<c:import url="/importJSTL1.html"/>

</h2>
<c:forEach var="i" begin="1" end="11">
Guitar Amp Volume: 
<c:if test="${i > 10}">
<c:out value="This one goes to "/>
</c:if>
<c:out value="${i}"/><p></p>
</c:forEach>
<br />

<c:import url="/importJSTL.html"/>

<h2>Example of forTokens (featuring import).</h2>
<h3>Who are the founding members of the Justice League?</h3>
<c:forTokens items="Superman,Batman,WonderWoman,Flash,GreenLantern,MartianManhunter,Hawkgirl" delims="," var="JusticeLeague">
<c:out value="${JusticeLeague}"/> <p>
</c:forTokens>
<br />

<h2>Example choose/otherwise</h2>
<c:set var="i" scope="session" value="${11}"/>
<p>How do the heros enjoy their music?</p>
<c:choose>
<c:when test="${i > 10}">The Flash enjoys his music turned up high!</c:when>
<c:when test="${i < 10}">Superman likes his music at low volume.</c:when>
<c:otherwise>Batman prefers the silence of his Bat Cave...</c:otherwise>
</c:choose>    
<br /><br />

<h4>Example of url</h4>    
<p>
<c:url var="url" value="/index.jsp"/>
<a href="${url}">Go Back to Homepage</a>
</p>    
</body>
</html>