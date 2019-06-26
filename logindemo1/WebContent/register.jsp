<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="/scripts/scjquery-3.4.1.min.js"></script>
<script type="text/javascript" src="/scripts/jquery.validate.js">	



 // document.getElementById("errorMessageId").style.display = "none";
  function back() {
	window.location.assign("index.jsp");

}
 
  function required() 
  {
	   var empt = document.forms["registration"]["fullname","address","age","qualification",
		  "percentage","emailid","username","password"].value;
	  if (empt == "")
	  {
	  alert("Please input a Value");
	  return false;
	  }
	  else 
	  {
	  alert('Code has accepted : you can try another');
	  return true; 
	  }
	}
</script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body> 
	<form action="registration" method ="post" id="registrationFormId">
		<table
			style="background: yellow; margin-left: 20px; margin-left: 20px;">
			<tr>
				<td><h3 style="color: black">REGISTER</h3></td>
			</tr>
			<tr>
				<td> <label>for="fullnameId" </label>Full Name :</td>
				<td><input type="text" name="fullname" id="fullnameId"></td>
			</tr>
			<tr>
				<td>Address :</td>
				<td><input type="text" name="address" id="addressId"></td>
			</tr>
			<tr>
				<td>Age :</td>
				<td><input type="text" name="age" id="ageId"></td>
			</tr>
			<tr>
				<td>Qualification :</td>
				<td><input type="text" name="qualification" id="QualificationId"></td>
			
			</tr>
			<tr>
				<td>Percentage :</td>
				<td><input type="text" name="percentage" id="PercentageId"></td>
			</tr>
			<tr>
				<td>EmailId :</td>
				<td><input type="text" name="emailid" id="EmailId"></td>
			</tr>
			<tr>
				<td>Username :</td>
				<td><input type="text" name="username" id="UsernameId"></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="password" name="password" id="PasswordId"></td>
			</tr>
			<tr>
				<td><input type="button" onclick="validate()" value="REGISTER"></td>
				<td><input type="button" onclick="back()" value="Back"></td>
				<td></td>
			</tr>
		</table>
	</form>
</body>
<script type="text/javascript">
  function validate() 
  {
	  var fullName = document.getElementById("fullnameId");
	  var address = document.getElementById("addressId");
	  var Age = document.getElementById("ageId");
	  var qualification = document.getElementById("QualificationId");
	  var percentage = document.getElementById("PercentageId");
	  var emailId = document.getElementById("EmailId");
	  var username = document.getElementById("UsernameId");
	  var password = document.getElementById("PasswordId");
	 		
	  var flag = isEmpty(fullName) && isEmpty(address) && isEmpty(Age) && isEmpty(qualification) && isEmpty(percentage) 
			  && isEmpty(emailId) && isEmpty(username) && isEmpty(password);
	 if (flag == true){
		 document.getElementById("registrationFormId").submit();
	 }
	 else{
		 alert("please fill mandatory fields");
	 }
}
  
  function isEmpty(val)
  {
	  if(  val.value ) 
	  {
		  return true;
	}
	  else { 
		return false; 
		}
  }
</script>
</html>