<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center>

<form action="TicketFinder.jsp" method="post">
<table>

<tr>
<td><p>Source:</p> </td>
<td><input type="text" name="source" ></td>
<td><p><i class="fa fa-long-arrow-right" style="font-size:28px"></i>&nbsp Destination:</p> </td>
<td><input type="text" name="destination"></td>
</tr><br/>
<tr>
<td><p>Date of Journey:</p> </td>
<td><input type="date" name="doj"></td>
<td><p>Date of Return: </p></td>
<td><input type="date" name="dor"></td>
</tr>


<table>
<br/>

<br/>
<input type="submit" value="Search Bus" class="button1" style=""><br/>


</form>



</center>

</body>
</html>