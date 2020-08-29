<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


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




<c:set var="age" value="10.555"/>


<%-- <fmt:parseNumber var="x" integerOnly="true" type="number" value="${age}"/>

<c:out value="${age}"></c:out>
<br>

after convert
<br>
<c:out value="${x}"></c:out>
 --%>
  
<br>
<fmt:formatNumber var="x" type = "number" maxFractionDigits = "1" value = "${age}" />
<c:out value="${x}"/>


<!--
fn:endsWith()
startsWith()
trim()
toLowerCase()
toUpperCase()
subString()
subStringBefore()
subStringAfter()
-->


</body>
</html>