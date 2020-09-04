<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enter car details</title>
</head>
<body>

Enter car details in showroom ${showroom.showroomName}


<%-- <p name="showroomName" value="${showroom.showroomName}"> --%>
<form action="dispCars">

Name: <input type="text" name="name">
<br>
Brand: <input type="text" name="brand">
<br>
Colour: <input type="text" name="colour">
<br>
<input type="submit" value="Add Car">
</form>
<form action="displayCars">
<input type="submit">
</form>
</body>
</html>