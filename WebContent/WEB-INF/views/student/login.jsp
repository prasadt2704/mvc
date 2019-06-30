<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>${requestScope.status}</h3>
<form method="post">
<table>
<tr>
<td>enter email</td>
<td><input type="text" name="email" /></td>
</tr>
<tr>
<td>enter password</td>
<td><input type="text" name="password" /></td>


</tr>
<tr>
<td><input type="submit" value="Login" /></td>
</tr>

</table>


</form>

</body>
</html>