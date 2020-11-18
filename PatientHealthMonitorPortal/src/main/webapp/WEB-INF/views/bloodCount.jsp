<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Blood Count</title>
</head>
<body>
	<div align="center">
	<h1>Blood Count</h1>
		<form:form action="bloodCount" method="post" modelAttribute="bloodCount">
			<table border=1>
				<tr>
					<td>Patient Id</td>
					<td><form:input type="text" path="patientId"
							style="width: 120px" placeholder="Enter your patient id" /><font
						color="red"><form:errors path="patientId"></form:errors></font></td>
				</tr>
				<tr>
					<td>RBC Count</td>
					<td><form:input type="text" path="rbc"
							style="width: 120px" /><font color="red"><form:errors
								path="rbc"></form:errors></font></td>
				</tr>
				<tr>
					<td>WBC count</td>
					<td><form:input type="text" path="wbc"
							style="width: 120px" /><font color="red"><form:errors
								path="wbc"></form:errors></font></td>
				</tr>
				<tr>
					<td>Platelet</td>
					<td><form:input type="text" path="platelet"
							style="width: 120px" /><font color="red"><form:errors
								path="platelet"></form:errors></font></td>
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