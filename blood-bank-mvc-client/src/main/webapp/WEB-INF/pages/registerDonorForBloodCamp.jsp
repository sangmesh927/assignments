<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="styll.css" />
</head>
<body>
<form:form action="registerDonorForBloodCamp" post="POST">
	<div>
		<label for="">Enter  camp Name</label>
	 	<form:input type="text" path="campName" required="required" />
	</div>
	
	<div>
		<label for="">Enter donor ID</label>
		<form:input type="number" path="donorId" required="required"/>
	</div>

	<div>
		<input type="submit" value="Add">
	</div>
</form:form>
</body>
</html>