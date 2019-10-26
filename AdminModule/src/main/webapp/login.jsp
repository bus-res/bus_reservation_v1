<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="external.css">

<script src='https://kit.fontawesome.com/a076d05399.js'></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<title>Login page</title>
</head>

<body>
	<center><u><b>

<h1 class="heading">Login Form</h1></u>

<div class="logo"><img src="bus logo.png" ></div>

<div class="enclose">

 <form action="login.lti"  >
 
  <table style="with: 70%" align="left">
   <tr><td></td></tr>
   <tr>
    <td>Email :</td><td></td>
    <td><input type="email" name="email" placeholder="Enter email address"/></td>
   </tr>
   <tr>
    <td>Password:</td><td></td>
    <td><input type="password" name="password" placeholder="Enter password" /></td>
   </tr>
  </table>
  
  <br/>
  
  <input type="submit" value="Sign-In" class="button_signin" />
 </form><br/>
   
 <a href ="forgot.jsp">Forgot Password ?</a><br>
 
  <table>
   <tr>
    <td></td><td></td>
    <td>
     <form><input type="reset" value="Cancel" class="button1" />
     </form>
    </td><td></td>
    <td>
     
     	<form  action="registration.jsp">
     	<input type="submit"  name= "Sign_up"value="Sign-up" class="button1" />
    	</form>
    </td>
   </tr>
  </table>
  
  <br>
  
    </div>
 
      </b>
   </center>
 </body>
</html>