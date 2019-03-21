<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>

		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
  		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>
  		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>
  		
  		<link rel="stylesheet" type="text/css" href="Login.css">

</head>
<body>
	  <div class="container-fluid h-100">
	   <div class="row justify-content-center align-items-center h-100">
	     <div class="col col-sm-6 col-md-6 col-lg-4 col-xl-3">
	     <div class="login-body">
		    <form action="LoginServlet">
			  <table style="background-color: skyblue; margin-left: 20px; margin-top: 250px;">
			    <tr><td colspan="2">eUniversity Login</td></tr>
				<tr><td>Username : </td><td><input type="text" name="un"/></td></tr>	
				<tr><td>Password : </td><td><input type="password" name="pw"></td></tr>	
				<tr><td><input type="submit" value="Login"></td><td><a href="studRegistration.jsp">Registration</a></td></tr>
			  </table>
		</form>
		</div>
		</div>
		</div>
		</div>
</body>
</html>