<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>

<html>

<head>Student Confirmation</head>
<body>
<br><br>
The Student is confirmed: ${student.firstName} ${student.lastName}

<br><br>

Student Country: ${student.country}


<br><br>

Favorite Language: ${student.favoriteLanguage}
<br><br>

Operating Systems:
<ul>
	<c:forEach var="temp" items="${student.operatingSystems}" > 
		<li>${temp} </li>
	</c:forEach>
</ul>



</body>

</html>