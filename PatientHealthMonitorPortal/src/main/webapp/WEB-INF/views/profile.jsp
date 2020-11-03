<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="true"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Profile</title>
</head>
<body>

	<div align="center">
		<h1>Profile</h1>
		<form:form action="profile" method="post" modelAttribute="profile">
			<table border=1>
				<tr>
					<td>User Name</td>
					<td><form:input type="text" path="userName"
							style="width: 120px" placeholder="Enter user Name" /><font
						color="red"><form:errors path="userName"></form:errors></font></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><form:input type="password" path="password"
							style="width: 120px" /><font color="red"><form:errors
								path="password"></form:errors></font></td>
				</tr>
				<tr>
					<td>Date Of Birth</td>
					<td><form:input type="text" path="dob" style="width: 120px"
							placeholder="Enter Date of Birth" /><font color="red"><form:errors
								path="age"></form:errors></font></td>
				</tr>
				<tr>
					<td>Contact Number</td>
					<td><form:input type="text" path="contactNumber"
							style="width: 120px" placeholder="Enter Contact Number" /><font
						color="red"><form:errors path="userId"></form:errors></font></td>
				</tr>
				<tr>
					<td>Email Id</td>
					<td><form:input type="text" path="emailId"
							style="width: 120px" placeholder="Enter Email Id" /><font
						color="red"><form:errors path="emailId"></form:errors></font></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><form:textarea rows="4" cols="50" path="address"></form:textarea><font color="red"><form:errors
								path="address"></form:errors></font></td>
				</tr>
				<tr>
					<td>City</td>
					<td><form:input type="text" path="city" style="width: 120px"
							placeholder="Enter city" /><font color="red"><form:errors
								path="city"></form:errors></font></td>
				</tr>
				<tr>
					<td>Country</td>
					<td><form:input type="text" path="country"
							style="width: 120px" placeholder="Enter Country" /><font
						color="red"><form:errors path="country"></form:errors></font></td>
				</tr>
				<tr>
					<td>Pin Code</td>
					<td><form:input type="text" path="pincode"
							style="width: 120px" placeholder="Enter pincode" /><font
						color="red"><form:errors path="pincode"></form:errors></font></td>
				</tr>
				<tr>
					<td>Gender</td>
					<td><form:input type="radio" path="gender" />Male <form:input
							type="radio" path="gender" />Female <font color="red"><form:errors
								path="gender"></form:errors></font></td>

				</tr>
				<tr>
					<td>Guardian First Name</td>
					<td><form:input type="text" path="guardianFirstName"
							style="width: 120px" placeholder="Enter Guardian first Name" /><font
						color="red"><form:errors path="guardianFirstName"></form:errors></font></td>
				</tr>
				<tr>
					<td>Guardian Last Name</td>
					<td><form:input type="text" path="guardianLastName"
							style="width: 120px" placeholder="Enter guardian  Last Name" /><font
						color="red"><form:errors path="guardianLastName"></form:errors></font></td>
				</tr>
				<tr>
					<td align="center" colspan="2"><input type="submit"
						value="submit"></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>