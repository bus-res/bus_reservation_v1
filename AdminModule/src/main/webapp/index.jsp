<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin actions</title>
</head>
<body>

<h1>Welcome Admin</h1>

<br>
<hr>

<h4>Please select an action</h4>

<form action = "register.jsp">
<button type="submit">Add Buses</button>
</form> <br>

<form action = "search.jsp">
<button type="submit">Search Buses</button>
</form><br>

<form action = "busdetails.lti">
<button type="submit">Show All Buses</button>
</form><br>

<form action = "delete.jsp">
<button type="submit">Delete Buses</button>
</form><br>


<form action = "routeregister.jsp">
<button type="submit">Add Route</button>
</form><br>


<form action = "routesearchform.jsp">
<button type="submit">Search Route from Source</button>
</form><br>


<form action = "driverregister.jsp">
<button type="submit">Add new driver</button>
</form><br>


<form action = "driversearch.jsp">
<button type="submit">Search Driver details</button>
</form><br>


<form action = "driverdeleteform.jsp">
<button type="submit">Delete Driver details</button>
</form><br>


<form action = "driverdetails.lti">
<button type="submit">Get Driver details</button>
</form><br>


<form action = "userdetails.lti">
<button type="submit">Get All User Details</button>
</form><br>


</body>
</html>