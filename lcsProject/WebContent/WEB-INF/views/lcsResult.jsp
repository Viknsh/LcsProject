<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LCS Result</title>
</head>
<body>
<h3>The Longest Common Substring of ${lcs} is <u>${lcsResult}</u></h3>

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
      
      <!-- <button onclick="goBack()">Go Back</button> -->
<script>
	function onSubmit( form ){
		var data = JSON.stringify( $(form).serializeArray() );
		return data;
	}
	
	function goBack() {
		window.history.back();
	}
</script>
</body>
</html>