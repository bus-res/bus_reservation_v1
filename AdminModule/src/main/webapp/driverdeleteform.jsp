<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="external.css"> 
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Driver Form</title>
</head>
<body>

<ul>
  <li><a href="#about">About  </a></li>
  <li><a href="#myDashboard">My Dashboard </a></li>
  <li><a href="#contact">Contact Us</a></li>
  <li style="float:right"> <div class="dropdown">
    <button class="dropbtn"  text-transform="uppercase"><a class="active" href="#about"><b> ${ register.firstName } ${ register.lastName }</b></a></button>
    <div class="dropdown-content">
      <a href="login.jsp">Logout</a>
       <!-- <form action="profile.bus"> -->
       <a href="profile.bus">Profile</a><!-- </form> -->
    </div></div></li>
    </div></div></li> 
</ul>


<form action="deletedriver.lti">
<h5>Delete Driver Details</h5>
<table>
<tr>
<td>
Enter Driver's license number<input type="text" name = "license"></td></tr>
<tr><td><button type="submit"  class="button1">Delete Driver Details</button></td></tr>
</table>
</form>
</body>
</html>