<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="true"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Registration</title>
</head>
<body>

	<div align="center">
		<h1>Welcome to Registration Page</h1>
		<form:form action="registration" method="post" modelAttribute="users">
			<table border=1>
				<tr>
					<td>First Name</td>
					<td><form:input type="text" path="firstName"
							style="width: 170px" placeholder="Enter first Name" /><font
						color="red"><form:errors path="firstName"></form:errors></font></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><form:input type="text" path="lastName"
							style="width: 170px" placeholder="Enter Last Name" /><font
						color="red"><form:errors path="lastName"></form:errors></font></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><form:input type="password" path="password"
							style="width: 170px" /><font color="red"><form:errors
								path="password"></form:errors></font></td>
				</tr>
				<tr>
					<td>Age</td>
					<td><form:input type="text" path="age" style="width: 170px"
							placeholder="Enter Age" /><font color="red"><form:errors
								path="age"></form:errors></font></td>
				</tr>
				<tr>
					<td>Gender</td>
					<td><form:select path="gender" id="gender"
							style="width: 170px">
							<option value="male">Male</option>
							<option value="female">Female</option>
						</form:select></td>
				</tr>
				<tr>
					<td>Contact Number</td>
					<td><form:input type="text" path="contactNumber"
							style="width: 180px" placeholder="Enter Contact Number" /><font
						color="red"><form:errors path="contactNumber"></form:errors></font></td>
				</tr>
				<tr>
					<td>Email Id</td>
					<td><form:input type="text" path="email"
							style="width: 170px" placeholder="Enter Email Id" /><font
						color="red"><form:errors path="email"></form:errors></font></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><form:textarea rows="4" cols="20" path="address"></form:textarea><font
						color="red"><form:errors path="address"></form:errors></font></td>
				</tr>
				<tr>
					<td>Zip Code</td>
					<td><form:input type="text" path="zipCode"
							style="width: 170px" placeholder="Enter zip  code" /><font
						color="red"><form:errors path="zipCode"></form:errors></font></td>
				</tr>
				<tr>
					<td>city</td>
					<td><form:input type="text" path="city" style="width: 170px"
							placeholder="Enter city" /><font color="red"><form:errors
								path="city"></form:errors></font></td>
				</tr>
				<tr>
					<td align="center" colspan="2"><input type="submit"
						value="Register"> <input type="reset" value="Reset">
					</td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>