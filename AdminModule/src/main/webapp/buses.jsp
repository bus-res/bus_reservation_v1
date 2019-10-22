<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>All Buses in System</h2>

    <table border="1">
        <tr>
            <th>Bus Id</th>
            <th>Bus Name</th>
            <th>Bus Number Plate</th>
            <th>Number of Seats</th>
        </tr>
       <c:forEach items="${admin}" var="admin">
      <tr>
          <td>
              <c:out value="${admin.busId}"/>
          </td>
          <td>
              <c:out value="${admin.busName}" />
         </td>
         <td>
              <c:out value="${admin.numberPlate}" />
         </td>
         <td>
              <c:out value="${admin.noSeats}" />
         </td>
     </tr>
</c:forEach>

    </table>
</body>
</html>