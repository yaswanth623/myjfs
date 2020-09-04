<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Design</title>
</head>
<body>
<P>Name : ${student.name}</P>
<P>Student Id : ${student.studentId}</P>
<P>Address : ${student.address}</P>
<P>Sem : ${student.sem}</P>
<p>Dob: ${student.studentDob }</p>
<P>City : ${student.address.city}</P>
<P>State : ${student.address.state}</P>
<p>Preferred Location:
<c:forEach items="${student.plocation}" var="loc">
${loc} 
</c:forEach>
</p>
</body>
</html>
