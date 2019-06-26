<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="/scripts/jquery-3.4.1.min"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
	<form action="login" method ="post">
		<table
			style="background: yellow; margin-left: 20px; margin-left: 20px;">
			<tr>
				<td><h3 style="color: black">Login</h3></td>
			</tr>
			<tr>
				<td>User Name :</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="Password" name="password"></td>
			</tr>
			
				<tr>
				<td><input type="submit" name="submit" value="Login"></td>
				<td><input type="button" onclick="back()" value="back"></td>
				<td></td>
			</tr>
			</table>
			<div id="errorMessageId" >
			<p> loginErrorMessage: <%= request.getAttribute("loginErrorMessage") %></p>
			</div>
	</form>
	
</body>
<script type="text/javascript">
	 document.getElementById("errorMessageId").style.display = "none";
  function back() {
	window.location.assign("index.jsp");

}
</script>
</html>