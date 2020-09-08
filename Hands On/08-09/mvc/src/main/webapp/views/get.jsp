<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>
<tr> <th> Username </th> <th> Password </th></tr>
<c:forEach items="${myUsers}" var="myUsers">
<tr>
<td> ${myUsers.userName}</td>
<td> ${myUsers.password} </td>
</tr>
</c:forEach>
</table>

</body>
</html>