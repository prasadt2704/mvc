<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>hello ${sessionScope.studentdetail.name}</h3>
<h3>${requestScope.status}</h3>

<c:forEach var="v" items="${requestScope.studentList}">

<tr>
<td>${v.id}</td>
<td>${v.email}</td>
<td>${v.marks}</td>
<td>${v.name}</td>
<td>${v.password}</td>
<a href="<spring:url value='/student/update?id=${v.id}'/>">update Vendor</a>
</tr>
</c:forEach>
<h5>
		<a href="<spring:url value='/student/logout'/>">Log Me Out</a>
	</h5>
</body>
</html>