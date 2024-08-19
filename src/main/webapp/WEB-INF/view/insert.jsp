<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored ="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
			
			${msg}
	

	<form action="insert" method="post">
		<input type="text" name="id" placeholder="Enter ID"> <br>
		<input type="text" name="name" placeholder="Enter Name"> <br>
		<input type="text" name="address" placeholder="Enter Address"> <br>
		 <input type="text" name="salary" placeholder="Enter Salary">
		<button>INSERT</button>
	</form>

</body>
</html>