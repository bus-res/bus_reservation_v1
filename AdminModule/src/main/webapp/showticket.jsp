<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core"  prefix = "c"%>
    <%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="external.css">
<script>

function myFunction(){
	window.print();
}

</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display buses</title>
</head>
<body>


<ul>
  <li><a href="#about">About  </a></li>
  <li><a href="#myDashboard">My Dashboard </a></li>
  <li><a href="#contact">Contact Us</a></li>
  <li style="float:right"> <div class="dropdown">
    <button class="dropbtn"  text-transform="uppercase"><a class="active" href="#about"><b> ${ firstname } ${ lastname }</b></a></button>
    <div class="dropdown-content">
      <a href="logout.lti">Logout</a>
      <a href="myprofile.lti"> My Profile</a>
    </div></div></li>
    </div></div></li> 
</ul>
<br/><br/>
<h4 class="heading4">Your Ticket Details :</h4><br/>
<table border = "1" cellpadding = "5">
<tr>
             <th>Bus Sr. Id</th>
            <th>Source</th>
            <th>Destination</th>
            <th>Date of Journey</th>
            <th>No. of booked seats</th>
           <!-- <th>Bus Company Name</th> --> 
        
            
         
 </tr>
<tr>
             <td>${bussrid}</td>
			<td>${src}</td>
			<td>${dest}</td>
			<td>${doj}</td>
			<td>${bkseats }</td>
			<!--<td>${busname}</td>  -->
			


</tr>

</table>
<br/>
<button onclick="myFunction()" class="button1">Print</button>

</body>
</html>