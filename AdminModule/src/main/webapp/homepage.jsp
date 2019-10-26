<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="external.css">


<script src='https://kit.fontawesome.com/a076d05399.js'></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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


<center>

<form action="findbus.lti">
<table>

<tr>
<td><p>Source:</p> </td>
<td><input type="text" name="source"></td>
<td><span style='font-size:50px;'>&#8594;</span></td><td>&nbsp Destination: </td>
<td><input type="text" name="destination"></td>
</tr>
</table><br/>
<center>
<table>
<tr>
<td><p>Date of Journey:</p> </td>
<td><input type="date" name="doj"></td>
</tr>
</table>
</center>
<br/>

<br/>
<input type="submit" value="Search Bus" class="button1" > <br/>


</form>



</center>



<footer>

  <p>
   <a href="" >Copyright information</a> |
  <a href="">T&C</a> |
  <a href="">Privacy policy</a> |
  </p>
</footer>



</body>
</html>