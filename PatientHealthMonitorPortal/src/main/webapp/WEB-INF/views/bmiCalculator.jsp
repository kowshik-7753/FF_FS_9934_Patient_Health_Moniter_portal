<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Body mass index calculator</title>
</head>
<body>
	<div align="center">
		<form:form action="bmiCalculator" method="post" modelAttribute="bmiCalculator">
			<table border=1>
				<tr>
					<td>Patient Id</td>
					<td><form:input type="text" path="patientId"
							style="width: 120px" placeholder="Enter patient id" /><font
						color="red"><form:errors path="patientId"></form:errors></font></td>
				</tr>
				<tr>
					<td>Height</td>
					<td><form:input type="text" path="height"
							style="width: 120px" /><font color="red"><form:errors
								path="height"></form:errors></font></td>
				</tr>
				<tr>
					<td>Weight</td>
					<td><form:input type="text" path="weight"
							style="width: 120px" /><font color="red"><form:errors
								path="weight"></form:errors></font></td>
				</tr>
				<tr>
					<td>Date</td>
					<td><form:input type="date" path="currentDate"
							style="width: 120px" /><font color="red"><form:errors
								path="currentDate"></form:errors></font></td>
				</tr>
				<tr>
					<td align="center" colspan="2"><input type="submit"
						value="submit"> </td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>