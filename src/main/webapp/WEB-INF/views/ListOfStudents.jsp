<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:include page="include.jsp"></jsp:include>
<center><h3><b>Student Details Are</b></h3></center>
<body>
<h3><center><table border=1>
<tr>
<td><b>Id</b></td>
<td><b>StudentName</b></td>
<td><b>Gender</b></td>
<td><b>Degree</b></td>
<td><b>Branch</b></td>
<td><b>RoolNo</b></td>
<td><b>Mobileno</b></td>
<td><b>MailId</b></td>
<td><b>Operations</b></td>
</tr>
<c:forEach items="${list }" var="s">
<tr>
<td>${s.id }</td>
<td>${s.name }</td>
<td>${s.gender}</td>
<td>${s.degree}</td>
<td>${s.branch }</td>
<td>${s.rooNo}</td>
<td>${s.phoneno}</td>
<td>${s.email }</td>
<td>
<a href="/get?id=${s.id }">Update || </a>
<a href="/delete?id=${s.id }">Delete</a>

</td>
</tr>
</c:forEach>
</table></center>
${delete }
${update }
</h3></body>
</html>