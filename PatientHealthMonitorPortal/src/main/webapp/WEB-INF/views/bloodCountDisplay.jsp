<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BloodCount</title>
</head>
<body>
<div align="center">
        <h1>Blood Count Details</h1>
        <table border=1>
            <tr>
                <th>Patient Id</th>
                <th>rbc</th>
                <th>wbc</th>
                <th>platelets</th>
            </tr>
            <c:forEach var="blood" items="${list}">
                <tr>
                    <td>${blood.patientId}</td>
                    <td>${blood.rbc}</td>
                    <td>${blood.wbc}</td>
                    <td>${blood.platelet}</td>
                </tr>
            </c:forEach> 
        </table>
    </div>

</body>
</html>