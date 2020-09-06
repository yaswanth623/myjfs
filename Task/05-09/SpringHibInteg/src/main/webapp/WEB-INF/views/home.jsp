<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Home</title>
<link href="<c:url value="/resources/css/mystyle.css" />" rel="stylesheet">

</head>
<body>
<h1>
Hello Author, please provide your details!  
</h1>
<form action="display">

Name:<input type="text" name="authorName">
<br>
Id:<input type="text" name="authorId">
<br>City: <input type="text" name="city">
<br>
<input type="submit" name="save author">
</form>
<br><br>
<h2>Search Authors by City</h2>

<form action="authorsByCity">

City: <select name="city">
<option value="Bengaluru">Bengaluru</option>
<option value="Chennai">Chennai</option>
<option value="Hyderabad">Hyderabad</option>
<option value="Mumbai">Mumbai</option>
</select>
<input type="submit">
</form>
<br><br>
<h2>Search Authors by Name</h2>
<form action="authorsByName">
Name:<input type="text" name="authorName">
<input type="submit">
</form>
<br><br>
<h2>Delete Entry by Author Name</h2>
<form action="deleteByName">
Name:<input type="text" name="authorName">
<input type="submit">
</form>

<h1>Click below button to update details</h1>

<form action="updatePage">
<input type="submit" value="Update">
</form>





</body>
</html>