<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script type="text/javascript" src="/scripts/jquery-3.4.1.min"></script>
<style type="text/css">
table, th, td {
  border: 1px solid black;
}
</style>
<title>Welcome </title>
</head>

<b><H2>Welcome ${userName} </H2></b>
<hr>
<br>
 <body bgcolor="white">
    <table>
      <TH>Name</th>
      <TH>Address</TH>
      <TH>Age</TH>
      <TH>Qualification</TH>
      <TH>Percentage</TH>
      <TH>Email</TH>
       <TH>User Name</TH>
      <c:forEach items="${listOfStudents}" var="student">
        <tr>
          <td><c:out value="${student.fullName}" /></td>
          <td><c:out value="${student.address}" /></td>
          <td><c:out value="${student.age}" /></td>
          <td><c:out value="${student.qualification}"/></td>
          <td><c:out value="${student.percentage}" /></td>
          <td><c:out value="${student.email}"/></td>
          <td><c:out value="${student.username}"/></td>
        </tr>
      </c:forEach>
    </table>
  </body>
</html>

