<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="/logindemo1/scripts/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="/logindemo1/scripts/jquery.validate.js"></script>
	<script src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js"></script>	
<script type="text/javascript">
$(document).ready(function() {

$('form[id="registrationFormId"]').validate({
			rules : {
				fullname : 'required',
				address  : 'required',
				age		 : 'required',
				qualification : 'required',	
				percentage : 'required',	
				emailid	 : 'required', 
				username : 'required',		
				password : 'required'
			},
			message : {
				fullname: 'This field is required',
				address  : 'This field is required',
				age		 : 'This field is required',
				qualification :'This field is required',	
				percentage : 'This field is required',	
				emailid	 : 'This field is required',
				username : 'This field is required',		
			    password : 'This field is required'
			},
			submitHandler: function(form) {
			    form.submit();
		}

});

});
 // document.getElementById("errorMessageId").style.display = "none";
  function back() {
	window.location.assign("index.jsp");

}
 
  </script>
  
<style type="text/css">
form label {
  display: inline-block;
  width: 100px;
}
 
form td {
  margin-bottom: 10px;
}
 
.error {
  color: red;
  margin-left: 5px;
}
 
label.error {
  display: inline;
}

form input.readonly {
	background: grey;
}
  
  </style>
  <script>
function myColor() {
document.getElementById("password").style.color = "grey";

}
</script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body> 
	<form action="registration" method ="post" id="registrationFormId">
	  <input type="hidden" name="password" value="${student.password}"> 
	  <input type="hidden" name="flag" value="true">
	   <input type="hidden" name="id" value="${student.id}">  
		<table
			style="background: yellow; margin-left: 20px; margin-left: 20px;">
			<tr>
				<td><h3 style="color: black">REGISTER</h3></td>
			</tr>
			<tr>
				<td> <label for="fullname">Full Name:</label></td>
				<td><input type="text" value="${student.fullName} " name="fullname" id="fullnameId"></td>
			</tr>
			<tr>
				<td> <label for="address">Address :</label></td>
				<td><input type="text" value="${student.address}" name="address" id="addressId"></td>
			</tr>
			<tr>
				<td> <label for="age"> Age :</label></td>
				<td><input type="text" value="${student.age}"  name="age" id="ageId"></td>
			</tr>
			<tr>
				<td><label for="qualification">Qualification :</label></td>
				<td><input type="text" value="${student.qualification}"  name="qualification" id="QualificationId"></td>
			
			</tr>
			<tr>
				<td><label for="percentage">Percentage :</label></td>
				<td><input type="text" value="${student.percentage}" name="percentage" id="PercentageId"></td>
			</tr>
			<tr>
				<td><label for="emailid">EmailId :</label></td>
				<td><input type="text"  value="${student.email}" name="emailid" id="EmailId"></td>
			</tr>
			<tr>
				<td><label for="username">Username :</label></td>
				<td><input type="text" readonly="readonly" value="${student.username}" name="username" id="UsernameId"></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="Update"></td>
				<td><input type="button" onclick="back()" value="Back"></td>
				<td></td>
			</tr>
		</table>
	</form>
</body>
<script>

</script>
</html>