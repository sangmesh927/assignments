<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="styll.css" />
</head>
<body>
<div>
<h1>Blood Bank</h1>
<h3>Donation camp services</h3>
<a href="registerBloodCamp">Add Blood camp</a>
<a href="showAllBloodCamps">show All Blood Camps</a>
<a href="registerDonorForBloodCamp">register Donor For BloodCamp</a>
<a href="getRegisteredDonors">show all registered donors</a>


<p>Blood camp by City</p>
<div>
		<form action="showBloodCampsByPlace">
		<div>
			<label for="">Select city</label>
			<select name="place">
				
				<option value="Bangalore">Bangalore</option>
				<option value="Mysore">Mysore</option>
				<option value="Bidar">Bidar</option>
				<option value="Udupi">Udupi</option>
			</select>
		</div>
		<div>
			<input type="submit" value="Search" />
		</div>
	</form>
</div>

</div>
</body>
</html>