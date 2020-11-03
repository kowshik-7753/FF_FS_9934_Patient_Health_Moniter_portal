<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="true"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<div align="center">
		<marquee>Welcome to Patient Health Moniter Portal</marquee>
		<form:form action="login" method="post" modelAttribute="login">
			<table border=1>
				<tr>
					<td>User Name</td>
					<td><form:input type="text" path="userName" style="width: 120px"
							placeholder="Enter your user Name" /><font color="red"><form:errors
								path="userName"></form:errors></font></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><form:input type="password" path="password"
							style="width: 120px" /><font color="red"><form:errors
								path="password"></form:errors></font></td>
				</tr>
				<tr>
					<td align="center" colspan="2"><input type="submit"
						value="Login">
						<a href="registration">Register</a></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>