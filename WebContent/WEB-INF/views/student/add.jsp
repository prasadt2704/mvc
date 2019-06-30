<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sf:form method="post" modelAttribute="student">
<table>
<tr>
<td>enter email</td>
<td><sf:input path="email" ></sf:input></td>
</tr>
<tr>
<td>enter password</td>
<td><sf:input path="password" ></sf:input></td>
</tr>
<tr>
<td>enter marks</td>
<td><sf:input path="marks"></sf:input></td>
</tr>
<tr>
<td>enter name</td>
<td><sf:input path="name" ></sf:input></td>
</tr>
<tr>
<td><input type="submit" value="Register Me" ></td>
</tr>




</table>



</sf:form>

</body>
</html>