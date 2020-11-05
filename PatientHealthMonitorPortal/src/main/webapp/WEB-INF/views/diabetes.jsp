<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Diabetes</title>
</head>
<body>
	<div align="center">
		<form:form action="diabetes" method="post" modelAttribute="diabetes">
			<table border=1>
				<tr>
					<td>Patient Id</td>
					<td><form:input type="text" path="patientId"
							style="width: 120px" placeholder="Enter patient id" /><font
						color="red"><form:errors path="patientId"></form:errors></font></td>
				</tr>
				<tr>
					<td>BMI</td>
					<td><form:input type="text" path="bmi"
							style="width: 120px" /><font color="red"><form:errors
								path="bmi"></form:errors></font></td>
				</tr>
				<tr>
					<td>bPSystolicValue</td>
					<td><form:input type="text" path="bPSystolicValue"
							style="width: 120px" /><font color="red"><form:errors
								path="bPSystolicValue"></form:errors></font></td>
				</tr>
				<tr>
					<td>bPDiastolicValue</td>
					<td><form:input type="text" path="bPDiastolicValue"
							style="width: 120px" /><font color="red"><form:errors
								path="bPDiastolicValue"></form:errors></font></td>
				</tr>
				<tr>
					<td>fastingGlucose</td>
					<td><form:input type="text" path="fastingGlucose"
							style="width: 120px" /><font color="red"><form:errors
								path="fastingGlucose"></form:errors></font></td>
				</tr>
				<tr>
					<td>hDLCholesterol</td>
					<td><form:input type="text" path="hDLCholesterol"
							style="width: 120px" /><font color="red"><form:errors
								path="hDLCholesterol"></form:errors></font></td>
				</tr>
				<tr>
					<td>serumTriglycerides</td>
					<td><form:input type="text" path="serumTriglycerides"
							style="width: 120px" /><font color="red"><form:errors
								path="serumTriglycerides"></form:errors></font></td>
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