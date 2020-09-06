<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Create Player</title>
<style>
input[type=submit] {
font-family: Trebuchet MS;
background-color: black;
border-color: black;
border-width: 2px solid black;
text-decoration: none;
color: white;
padding: 10px 60px;
margin: 20px 20px;
cursor: pointer;
}
input[type=submit]:hover {
background-color: white;
color: black;
}
input[type=text], select {
  width: 50%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
</style>
</head>
<body bgcolor="black">
<br>
<center>
<div style="background-color: black">
<font face="Trebuchet MS" size="8" color="white">Welcome To Player Portal</font>
</div>
<div style="background-color: white;width: 550px;height: 450px">
<br>
<font face="Trebuchet MS" size="5">Fill the details to create player</font>

<form action="createPlayer">
<br>
<font face="Trebuchet MS">Player ID:</font><br><input type="text" name="playerId" placeholder="Enter Player ID">
<br><br>
<font face="Trebuchet MS">Name:</font><br><input type="text" name="playerName" placeholder="Enter Player Name">
<br><br>
<font face="Trebuchet MS">Team:</font><br>
<select name="playerTeam">
<option value="Chennai Super Kings">Chennai Super Kings</option>
<option value="Delhi Capitals">Delhi Capitals</option>
<option value="Kings XI Punjab">Kings XI Punjab</option>
<option value="Kolkata Knight Riders">Kolkata Knight Riders</option>
<option value="Mumbai Indians">Mumbai Indians</option>
<option value="Rajasthan Royals">Rajasthan Royals</option>
<option value="Royal Challengers Bangalore">Royal Challengers Bangalore</option>
<option value="Sunrisers Hyderabad">Sunrisers Hyderabad</option>
</select>
<br><br>
<input type="submit" value="Create">
</form>


</div>
</center>
</body>
</html>
