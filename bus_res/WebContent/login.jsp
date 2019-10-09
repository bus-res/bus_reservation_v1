<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title> 
</head>
<center><u><b>
<h1>Login Form</h1></u>
<form action="register" method="post" >

			<table style="with: 50%">
					<tr>
					<td>Email :</td>
					<td><input type="email" name="email" /></td>
				</tr>
					<tr>
					<td>Password :</td>
					<td><input type="password" name="password" /></td>
				</tr>
				</table>
				<a href ="xyz.html">Forgot Password ?</a><br><br>
			<input type="submit" value="Sign-In" />			
			<input type="reset" value="Cancel" /></br><br>
			</form>
			<!-- ------------------------ -->
			<form  action="login_signup.jsp">
			<input type="submit"  name= "Sign_up"value="Signup" />
			</center>
			</form></b>
</body>
</html>