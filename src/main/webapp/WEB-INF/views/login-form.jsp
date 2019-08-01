<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Log in</title>
<link rel="stylesheet" href="style.css" />
</head>
<body>
	<h1>Log in</h1>
	
	<c:if test="${ not empty message }">
		<p class="message">${ message }</p>
	</c:if>
	
	<form action="/login" method="post" autocomplete="off" >
	<p>
		<label>Email</label> <input type="email" name="email" required />
	</p>
	<p>
		<label>Password</label> <input type="password" name="password" required />
	</p>
	<p>
		<button type="submit">Log in</button>
	</p>
	</form>
</body>
</html>