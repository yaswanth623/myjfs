<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>

<form action="accountValidate">

user Id:<input type="text" name="userId">
<br>
Security Question:
<select name="securityQuestion">
<option value="Why">Why</option>
<option value="What">What</option>
<option value="when">When</option>
</select>
<br>
Security Answer:<input type="text" name="securityAnswer">
<br>
<input type="submit" value="Validate">

</form>

</body>
</html>