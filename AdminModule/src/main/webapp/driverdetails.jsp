<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core"  prefix = "c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Driver Details</title>
</head>
<body>
<caption>
<h2>List of all drivers</h2></caption>
<table border = "1" cellpadding = "5">
	
	
	
	<tr>
		<th>Driver Id</th>
		<th>Driver Name</th>
		<th>Driver License</th>
		<th>Driver Contact</th>
		<th>Action</th>
		
	</tr>


<c:forEach items="${ listofdrivers}" var="c">
<tr>
	<td>${ c.driverId } <br /></td>
	<td>${ c.driverName }<br /></td>
	<td>${ c.license } <br /></td>
	<td>${ c.contact }<br /></td>
	<td>
	<a href = "driverdeleteform.jsp">Delete</a></td>
	</tr>
</c:forEach>
</table>
</body>
</html>