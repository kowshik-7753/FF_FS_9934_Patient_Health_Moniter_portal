<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Diabetes</title>
</head>
<body>
<div align="center">
        <h1>Patient Diabetes Details</h1>
        <table border=1>
            <tr>
                <th>Patient Id</th>
                <th>BMI</th>
                <th>bPSystolicValue</th>
                <th>bPDiastolicValue</th>
                <th>fastingGlucose</th>
                <th>hDLCholesterol</th>
                <th>serumTriglycerides</th>
                <th>riskofDiabetes</th>
            </tr>
            <c:forEach var="calc" items="${list}">
                <tr>
                    <td>${calc.patientId}</td>
                    <td>${calc.bmi}</td>
                    <td>${calc.bPSystolicValue}</td>
                    <td>${calc.bPDiastolicValue}</td>
                    <td>${calc.fastingGlucose}</td>
                    <td>${calc.hDLCholesterol}</td>
                    <td>${calc.serumTriglycerides}</td>
                    <td>${calc.riskofDiabetes }</td>
                </tr>
            </c:forEach> 
        </table>
    </div>

</body>
</html>