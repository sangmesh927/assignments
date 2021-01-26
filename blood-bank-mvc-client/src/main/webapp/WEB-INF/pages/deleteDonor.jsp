<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete donor</title>
</head>
<body>
<form action="delete" method="POST">
	<div>
		<label for="">Enter Donor Id</label>
	 	<input type="number" name="id" required/>
	</div>
	<div>
		<input type="submit" value="Remove" />
	</div>
</form>

</body>
</html>