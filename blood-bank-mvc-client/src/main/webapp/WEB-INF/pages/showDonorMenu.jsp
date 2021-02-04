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
<div>
<p>Donors by Blood group</p>
<div>
		<form action="donorsByBloodGroup">
		<div>
			<label for="">Select Group</label>
			<select name="bloodGroup">
				<option value="apos">A+</option>
				<option value="aneg">A-</option>
				<option value="bpos">B+</option>
				<option value="bneg">B-</option>
				<option value="opos">O+</option>
				<option value="oneg">O-</option>
				<option value="abpos">AB+</option>
				<option value="abneg">AB-</option>
			</select>
		</div>
		<div>
			<input type="submit" value="Search" />
		</div>
	</form>
</div>

</div>


<div>
<p>Donors by City</p>
<div>
		<form action="donorsByCity">
		<div>
			<label for="">Select city</label>
			<select name="city">
				
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