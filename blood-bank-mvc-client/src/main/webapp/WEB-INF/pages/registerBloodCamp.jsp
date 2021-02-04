<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Blood Camp</title>
<link rel="stylesheet" href="styll.css" />
</head>
<body>
<div><h1>Blood Bank</h1></div>
<div>
<h3>Donation camp services</h3>
</div>
<div>
<a href="registerBloodCamp">Add Blood camp</a>
<a href="showAllBloodCamps">show All Blood Camps</a>
<a href="registerDonorForBloodCamp">register Donor For BloodCamp</a>
<a href="getRegisteredDonors">Register Blood Camp</a>
</div>
<form:form action="registerBloodCamp" post="POST">
	<div>
		<label for="">Enter blood camp Name</label>
	 	<form:input path="campName" required="required" />
	</div>
	
	<div>
		<label for="">Enter blood camp Date</label>
		<form:input type="date" path="campDate" required="required"/>
	</div>
	<div>
		<label for="">Choose place</label>
	 	<form:select path="place">
	 		<form:option value="Bangalore" label="Bangalore" />
	 		<form:option value="Mysore" label="Mysore" />
	 		<form:option value="Bidar" label="Bidar" />
	 		<form:option value="Udupi" label="Udupi" />
	 	</form:select>
	</div>
	<div>
		<input type="submit" value="Add">
	</div>
</form:form>
</body>
</html>