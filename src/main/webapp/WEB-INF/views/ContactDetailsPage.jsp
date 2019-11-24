<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:include page="include.jsp"/>
<h2><center>Contact Details are</center></h2>
<body>

<center>
<h3>Address :</h3>
<pre><h3>
The college : ${con.collegeName }
 > Adress :${con.area },${con.city }
 > Prakasam distict-${con.pincode }
 > Phone No : ${con.phoneno }
 > Email : ${con.email }
 > Monday-Saturrdat 9am-5pm
 > Sunday-Closed
 </center></h3></pre>
 
</body>
</html>