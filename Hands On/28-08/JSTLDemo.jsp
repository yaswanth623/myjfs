<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- core  
functional
formatting
sql
xml
 -->


<c:out value="${'hello welcome to jstl world'}"/>

<br>
<c:set var="age" scope="session" value="20"/>
<c:out value="${age}"/>


<c:out value="${age}"/>

<c:out value="${age}"/>

<c:out value="${age}"/>

<c:out value="${age}"/>

<c:out value="${'remove age'}"/>

<c:remove var="age"/>

<c:out value="${age}"/>
<br>
-----------------------
<br>

<c:set var="age" scope="session" value="20"/>

<c:if test="${age > 15}">
age is more than 15
</c:if>
<br>
----------------------------------
<br>
<br>
below is the result of c:choose
<br>


<c:choose>

<c:when test="${age > 20}"> age = 20 </c:when>

<c:when test="${age > 25}"> age > 25 </c:when>

<c:otherwise> else less <= 20 </c:otherwise>

</c:choose>

<c:forEach var="i" begin="1" end="10">
<c:out  value="${i}"/> <br>
</c:forEach>

names from servlet are as follows
<br>

<%-- <c:forEach var="name" items="${studList}">
 <c:out  value="${name}"/> <br>
</c:forEach> --%>



<c:forEach var="i" begin="1" end="6">
<c:out  value="${i}"/>
</c:forEach>

<c:forTokens items = "${playerList}" delims = "," var = "name">
<c:out value = "${name}"/><br>
</c:forTokens>




</body>
</html>