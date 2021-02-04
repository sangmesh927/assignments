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

<br>
	<div>
		<table>
		<thead>
			<tr>
				<th>Camp Name</th>
				<th>Camp Date</th>
				<th>Place</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="bloodCamp" items="${bloodCampList}">
				<tr>
					<td>${bloodCamp.campName}</td>
					<td>${bloodCamp.campDate }</td>
					<td>${bloodCamp.place }</td>
			</c:forEach>
		</tbody>
	</table>
	</div>
</body>
</html>