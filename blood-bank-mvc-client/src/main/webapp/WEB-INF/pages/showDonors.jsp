<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="styll.css" />
</head>
<body>
<header>
	<%@ include file="bloodDonorMenu.jsp" %>
</header>

	<%@ include file="showDonorMenu.jsp" %>


	<div>
		<table>
		<thead>
			<tr>
				<th>Donor ID</th>
				<th>Name</th>
				<th>age</th>
				<th>mobile Number</th>
				<th>Email</th>
				<th>gender</th>
				<th>bloodGroup</th>
				<th>Date of Birth</th>
				<th>last date  of Donation</th>
				<th>city</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="donors" items="${donorsList}">
				<tr>
					<td>${donors.donorId}</td>
					<td>${donors.name }</td>
					<td>${donors.age }</td>
					<td>${donors.mobileNumber }</td>
					<td>${donors.email }</td>
					<td>${donors.gender }</td>
					<td>${donors.bloodGroup }</td>
					<td>${donors.dateOfBirth }</td>
					<td>${donors.lastDateOFDonation }</td>
					<td>${donors.city }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>
</body>
</html>