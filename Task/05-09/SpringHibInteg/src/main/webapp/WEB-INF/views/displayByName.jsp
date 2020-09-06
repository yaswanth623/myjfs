<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Authors</title>
</head>
<body>
<table border="border" width="80%">
<tr> <td> AuthorId </td> <td> Name </td> <td> City </td>  </tr>
<c:forEach items="${author}" var="author">
<tr>
<td> ${author.authorId}</td>
<td> ${author.authorName} </td>
<td> ${author.city} </td>
</tr>
</c:forEach>

</table>
</body>
</html>