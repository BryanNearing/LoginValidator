<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard</title>
</head>
<body>
Welcome : <%=session.getAttribute("seshname")%>
<br/>
<a href="Logout">Logout</a>
</body>
</html>