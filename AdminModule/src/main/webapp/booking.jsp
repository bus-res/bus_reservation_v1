<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<link rel="stylesheet" href="external.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Tickets</title>
<script>
$(document).ready(function(){
	$("#bkseats").blur(function(){
		var n=document.getElementById("bkseats").value;
		$("#price").val(n*700);
	})});
</script>


</head>
<body>
<ul>
  <li><a href="#about">About  </a></li>
  <li><a href="#myDashboard">My Dashboard </a></li>
  <li><a href="#contact">Contact Us</a></li>
  <li style="float:right"> <div class="dropdown">
    <button class="dropbtn"  text-transform="uppercase"><a class="active" href="#about"><b> ${firstname } ${ lastname }</b></a></button>
    <div class="dropdown-content">
      <a href="logout.lti">Logout</a>
      <a href="myprofile.lti"> My Profile</a>
    </div></div></li>
    </div></div></li> 
</ul>

<center><b>
	<form action="bookingProcess.lti" >
	<input type="hidden" name="userId"  value="${user_id}" readonly />
		<table>
		
		<tr>
				<td>	 Bus_sr_Id </td>
				<td><input type="number" name="busSrId"  value="<%=session.getAttribute("bus_sr_id") %>" readonly /></td>
			</tr>
			
			<tr>
				<td>Source : </td>
				<td><input type="text" name="source"  value="<%=session.getAttribute("r_source")%>"  readonly/></td>
				
			</tr>
			<tr>
				<td>Destination : </td>
				<td><input type="text" name="destination"   value="<%=session.getAttribute("r_destination")%>"  readonly/></td>
				
			</tr>
			<tr>
				<td>	 Journey Date: </td>
				<td><input type="text" name="journeyDate"  value="<%= session.getAttribute("doj")%>"  readonly/></td>
				
			</tr>
			<tr>
				<td>	 Number of seats: </td>
				<td><input type="number" name="bkSeats" id="bkseats" /></td>
				
			</tr>
			
			 <tr>
				<td>	 Total Price: </td>
				<td><input type="number" name="totalPrice" id="price" /></td>
			</tr>
			
			<tr><td></td>
			<td><input type="submit" value="Book Ticket" class="button1" ></td>
			</tr>
			
		</table>
	</form>
</center></b>
</body>
</html>