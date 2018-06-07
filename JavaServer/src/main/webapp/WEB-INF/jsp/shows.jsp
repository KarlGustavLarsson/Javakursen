<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
 <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
</head>

<html lang="en">

<body>
	
	
	<div class="container">
 		<h2>Shows</h2>    
  		<table class="table table-condensed">
    		<thead>
      					<th>Movietitle</th>
        				<th>Theatre</th>
        				<th>Starttime</th>
        				<th>Endtime</th>
      				
      			
    		</thead>
    	<tbody>
      		<tr>
      		<c:forEach items="${shows}" var="show">
      			<tr>
      			<c:forEach items="${movies}" var="movie">
           			<c:if test="${movie.getId() == show.getMovieId()}">
           				<td>${movie.getName()}</td>
           			</c:if>
        		</c:forEach>
				<c:forEach items="${theatres}" var="theatre">
				<c:if test="${theatre.getId() == show.getTheatreId()}">
           				<td>${theatre.getName()}</td>
           			</c:if>
        		</c:forEach> 	
        		
        		<td>${show.getStart()}</td>
        		<td>${show.getEnd()}</td>
        	</c:forEach>
      		</tr>
    	</tbody>
  		</table>
</div>
	

</body>

</html>