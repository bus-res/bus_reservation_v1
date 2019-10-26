<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="external.css" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin actions</title>
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
       <!-- <form action="profile.bus"> --><a href="profile.bus">Profile</a><!-- </form> -->
    </div></div></li>
    </div></div></li> 
</ul>



<h4 class="heading4">Welcome Admin</h4>

<br>
<hr>

<h4 class="heading4">Please select an action :</h4>
<center>
<table border="1px solid blue">

<tr>
<td>
<form action = "register.jsp">
<button type="submit" class="button_select">Add Buses</button>
</form> <br>
</td>

<td>
<form action = "search.jsp">
<button type="submit" class="button_select">Search Buses</button>
</form><br>
</td>
</tr>

<tr>
<td>
<form action = "busdetails.lti">
<button type="submit" class="button_select">Show All Buses</button>
</form><br>
</td>
<td>
<form action = "delete.jsp">
<button type="submit" class="button_select">Delete Buses</button>
</form><br>
</td>
</tr>

<tr>
<td>
<form action = "routeregister.jsp">
<button type="submit" class="button_select">Add Route</button>
</form><br>
</td>
<td>
<form action = "routesearchform.jsp">
<button type="submit" class="button_select">Search Route from Source</button>
</form><br>
</td>
</tr>
<tr>
<td>
<form action = "driverregister.jsp">
<button type="submit" class="button_select">Add new driver</button>
</form><br>
</td>
<td>
<form action = "driversearch.jsp">
<button type="submit" class="button_select">Search Driver details</button>
</form><br>
</td>
</tr>

<tr>
<td>
<form action = "driverdeleteform.jsp">
<button type="submit" class="button_select">Delete Driver details</button>
</form><br>
</td>
<td>
<form action = "driverdetails.lti">
<button type="submit" class="button_select">Get Driver details</button>
</form><br>
</td>
</tr>
<tr>
<td>
<form action = "userdetails.lti">
<button type="submit" class="button_select">Get All User Details</button>
</form><br>
</td>
</tr>
</table>

</center>
</body>
</html>