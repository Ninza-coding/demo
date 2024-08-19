<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
 
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${msg}<br><br>
<c:forEach var="cricketer" items="${data}">
    ID:${cricketer.id} <br>
    Name:${cricketer.name} <br>
    Address:${cricketer.address} <br>
    Salary:${cricketer.salary} <br>
    <a href="deletefromread?id=${cricketer.id}">Delete</a><br><br>
</c:forEach>
</body>
</html>