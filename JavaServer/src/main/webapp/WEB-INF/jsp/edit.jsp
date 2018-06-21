<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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



<h3>Välkommen, Uppdatera bok</h3>

<form:form method="POST" action="/editsave" modelAttribute="Book"> 
         <table>
            <tr>
             <td><form:input id="id"  hidden="true" path="id"/></td>
             <tr>
            <tr>
                <td><form:label path="title">Boktitel</form:label></td>
                <td><form:input value="${book.getTitle()}" path="title"/></td>                           
            </tr>
            <tr>
                <td><form:label path="author">Författare</form:label></td>
                <td><form:input value="${book.getAuthor()}" path="author"/></td>
            </tr>
            <tr>
                <td><form:label path="published">Utgivningsår</form:label></td>
                <td><form:input value="${book.getPublished()}" path="published"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="Submit"/></td>
            </tr>
        </table>
  </form:form>