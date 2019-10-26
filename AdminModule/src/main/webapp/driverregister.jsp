<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="external.css"> 
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Driver</title>
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

<form action="adddriver.lti" >
<table><tr><td>
Enter Driver Name : </td>
<td><input type="text" name="driverName" /></td><br />
<tr>
<td>Enter Driver License Number :</td>
<td> <input type="text" name="license" /> </td></tr><br />

<tr><td>Enter Driver Contact Number :</td>
<td> <input type="number" name="contact" /> </td><br />

<tr><td><button type="submit"   class="button1">Add</button></td></tr>
</form>
</body>
</html>