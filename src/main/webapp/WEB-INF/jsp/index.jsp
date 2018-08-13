<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<head>
  <title>Account MS</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Account Management System</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">All User</a></li>
      <li><a href="newUser">New user</a></li>
    </ul>
  </div>
</nav>
 	
 	<div class="container">
 	<c:choose>
 		<c:when test="${mode == 'USER_VIEW'}">
 		<table class="table table-hover">
    <thead>
      <tr>
        
        <th>First Name</th>
        <th>Last Name</th>
        <th>Account No.</th>
        <th>Edit</th>
        <th>Delete</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach var="user" items="${users}">
    		<tr>
    			
    			<td>${user.firstname}</td>
    			<td>${user.lastname}</td>
    			<td>${user.accountNo}</td>
    			<td><a href="updateUser?id=${user.id}"><div class="glyphicon glyphicon-pencil"></div></a></td>
    			<td><a href="deleteUser?id=${user.id}"><div class="glyphicon glyphicon-remove"></div></a></td>
    		</tr>
    </c:forEach>
  	</tbody>
 		</table>
 		</c:when>
 		
 		<c:when test="${mode == 'USER_EDIT' || mode == 'USER_NEW'}">
 		<form action="save" method="post">
 		<input type="hidden" class="form-control" value="${user.id}" name="id" id="id">
 			<div class="form-group">
 				<label for="firstName">First Name</label>
 				<input type="text" class="form-control" value="${user.firstname}" name="firstName" id="firstName">
 				</div>
 				
 				<div class="form-group">
 				<label for="lastName">Last Name</label>
 				<input type="text" class="form-control" value="${user.lastname}" name="lastName" id="lastName">
 				</div>
 				
 				
 				<div class="form-group">
 				<label for="accountNo">Account Number</label>
 				<input type="number" class="form-control" value="${user.accountNo}" name="accountNo" id="accountNo">
 				</div>
 				<button type="submit" class="btn btn-default">Submit</button>
 			</form>
 			</c:when>
 			</c:choose>
 			
 		</div>

</body>
</html>
