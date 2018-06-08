<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
 <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>

<html lang="en">

<body>

<header>
[<a href="/books">Visa boklista</a>]
[<a href="#">Lägg till ny bok</a>] 
</header>
	
	
<div class="container">
 		<h2>Books</h2>    
  		<table class="table table-condensed">
    		<thead>
      			<th>Titel</th>
        		<th>Författare</th>
        		<th>Utgivningsår</th>
    		</thead>
    	<tbody>
      		<tr>
      		<c:forEach items="${books}" var="book">
        		<td>${book.getTitle()}</td>
        		<td>${book.getAuthor()}</td>
        		<td>${book.getPublished()}</td>
        	</c:forEach>
      		</tr>
    	</tbody>
  		</table>
</div>
	

</body>

</html>