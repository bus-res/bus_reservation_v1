<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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

<form action = "getbuses.lti">
<button type="submit">Show All Buses</button>
</form><br>


<form action = "routeregister.jsp">
<button type="submit">Add Route</button>
</form><br>


<form action = "routeconfirm.jsp">
<button type="submit">Search Route from Source</button>
</form><br>

</body>
</html>