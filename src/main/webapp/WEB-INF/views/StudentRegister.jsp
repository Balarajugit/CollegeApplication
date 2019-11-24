<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:include page="include.jsp"/>
<h3><center>Enter Student Details</center></h3>
<body>
<center><h3>
<form:form action="saveStudent" method="POST" modelAttribute="student">
<pre>
StudentName : <form:input path="name"/><br>
Gender : <form:radiobutton path="gender" value="Male"/>Male
			<form:radiobutton path="gender" value="Female"/>Female
Degree : <form:input path="degree"/><br>
Department : <form:input path="branch"/><br>
UniversityId : <form:input path="rooNo"/><br>
MobileNo : <form:input path="phoneno"/><br>
MailId : <form:input path="email"/><br>
<input type="submit" value="Register"/>
</pre>
</form:form>
${msg }
</h3></center>
</body>
</html>