<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign Up</title>
</head>
<body>
	<h1>Sign Up!</h1>
	<form action="/signup-confirmation">
	<p>
		<label>Name</label> <input autocomplete="off" />
	</p>
	<p>
		<label>Email</label> <input type="email" required autocomplete="off" />
	</p>
	<p>
		<label>Password</label> <input type="password" required />
	</p>
	<p>
		<button type="submit">Sign Up!</button>
	</p>
	</form>
</body>
</html>