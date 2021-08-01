<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<meta charset="ISO-8859-1">
<title>LCS Project</title>
</head>
<body>
<h2>FIND LCS</h2>
<form method = "POST" action = "lcs">
	<table>
		<label for="firstString">String 1:</label>
		<input type="text" id="firstString" name="firstString"><br><br>
		<label for="secondString">String 2:</label>
		<input type="text" id="secondString" name="secondString"><br><br>
		<input type="submit" value="LCS">
	</table>  
</form>
<script>
	function onSubmit( form ){
		var data = JSON.stringify( $(form).serializeArray() );
		return data;
	}
</script>
</body>
</html>