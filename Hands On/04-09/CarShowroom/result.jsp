<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cars</title>
</head>
<body>

<h1>Welcome to ${showroom.showroomName }</h1>
<p> Cars Available are </p>

<table border="border" width="80%">
<tr> <td> Name </td> <td> Brand </td> <td> Colour </td>  </tr>
<c:forEach items="${showroom.cars}" var="car">

<tr>

<td> ${car.name}</td>
<td> ${car.brand} </td>
<td> ${car.colour} </td>
</tr>


</c:forEach>

</table>
</body>
</html>