<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" cellspacing="0" cellpadding="10">
		<tr>
			<td>ID</td>
			<td>lastName</td>
			<td>Email</td>
			<td>gender</td>
		</tr>
		<c:forEach items="${emps}" var="emp">
			<tr>
				<td>${emp.id}</td>
				<td>${emp.lastName}</td>
				<td>${emp.email}</td>
				<td>${emp.gender}</td>
			<tr>
		</c:forEach>
	</table>
</body>
</html>