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


<caption>
<h1 class="heading">List of available Buses :</h1></caption>
<form action="bookticket.lti">

<table border = "1" cellpadding = "5">
	
        <tr>
            <th>Source</th>
            <th>Destination</th>
            <th>Date of Journey</th>
            <th>Bus Number</th>
            <th>Bus Company Name</th>
            <th>Number Plate</th>
            <th> Total  Seats in Bus</th>
            <th></th>
         
        </tr>
       
        <tr>
          <td> ${requestScope.source}<br></td>
          <td> ${requestScope.destination}<br></td>
           <td> ${requestScope.dateofj}<br></td>
           <c:forEach items="${ requestScope.adminval}" var="admin">
           	
          <td> ${admin.busId}<br></td>
          <td>${admin.busName}<br></td>
         <td>${admin.numberPlate}<br></td>
         <td>${admin.noSeats}<br></td>
     
           </c:forEach>
           
           <td><input type="submit" value="Book Ticket" class="button_select"></td>
     </tr>
        
    </table>
   </form>
</body>
</html>