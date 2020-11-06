<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Patient BMI Calculation</title>
</head>
<body>
<div align="center">
        <h1>Patient BMI Calculation Details</h1>
        <table border=1>
            <tr>
                <th>Patient Id</th>
                <th>Height</th>
                <th>Weight</th>
                <th>BMI</th>
                <th>Date</th>
            </tr>
            <c:forEach var="calc" items="${list}">
                <tr>
                    <td>${calc.patientId}</td>
                    <td>${calc.height}</td>
                    <td>${calc.weight}</td>
                    <td>${calc.bmi}</td>
                    <td>${calc.currentDate}</td>
                </tr>
            </c:forEach> 
        </table>
    </div>

</body>
</html>