<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<link rel="stylesheet" href="style.css" />
</head>
<body>
	<nav>
		<c:if test="${ empty user }">
			<a href="/login">Log in</a>
			<a href="/signup">Sign up</a>
		</c:if>
		<c:if test="${ not empty user }">
			Welcome ${ user.name }
			<a href="/logout">Log out</a>
		</c:if>
	</nav>
	<h1>Home</h1>
</body>
</html>