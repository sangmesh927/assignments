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

<form action="deleteBloodCamp" method="POST">
	<div>
		<label for="">Enter Blood Camp ID</label>
	 	<input type="text" name="campId" required/>
	</div>
	<div>
		<input type="submit" value="Remove" />
	</div>
</form>
</body>
</html>