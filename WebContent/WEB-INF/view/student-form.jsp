<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE HTML>

<html>

<head>Student Registration Form</head>
<body>

<form:form action="processForm" modelAttribute="student">

FirstName: <form:input path="firstName" />

<br><br>

Last Name: <form:input path="lastName"/>

<br> <br>
<form:select path="country">
<form:options items="${student.countryOptions }" />


</form:select>


<br><br>
Favorite Language:
JAVA <form:radiobutton path="favoriteLanguage" value="Java"/>
C# <form:radiobutton path="favoriteLanguage" value="C#"/>
PHP <form:radiobutton path="favoriteLanguage" value="Php"/>
RUBY <form:radiobutton path="favoriteLanguage" value="Ruby"/>


<br><br>
Operating Systems:


LINUX <form:checkbox path="operatingSystems" value="Linux" />
MAC OS <form:checkbox path="operatingSystems" value="Mac OS" />
UBUNTU <form:checkbox path="operatingSystems" value="Ubuntu" />
WINDOWS <form:checkbox path="operatingSystems" value="Windows" />

<br><br>
<input type="submit" value="Submit" />
</form:form>

</body>

</html>