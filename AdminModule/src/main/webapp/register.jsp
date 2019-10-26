<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="external.css">
<meta charset="ISO-8859-1">
<title>Add Bus</title>
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

<b>
<form action="addbus.lti" >
<table>
<tr>
<td>Enter Bus Name : </td>
 <td><input type="text" name="busName" /></td>
 </tr> <br />
 <tr>
<td>Enter Number Plate : </td>
<td><input type="text" name="numberPlate" /> </td>
</tr><br />
<tr>
<td>Enter No of Seats : </td>
 <td><input type="number" name="noSeats" /></td>
 </tr> <br />
 <tr><td>
<button type="submit" class="button1">Add</button>
</td></tr>
</table>
</form>
</b>

</body>
</html>