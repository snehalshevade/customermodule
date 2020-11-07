<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<h1>Login</h1>
<form action="CustomerServlet" method="get" name="loginform">
UserName:<input type="text" name="username">
Password:<input type="text" name="password">
<input type="submit" value="login">
</form>
</body>
</html>