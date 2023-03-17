<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Lead</title>
</head>
<body>
  <form action="getLeadById" method="post">
    <label for="search">Enter Lead Id:</label>
    <input type="text" id="search" name="id">
    <button type="submit">Search</button>
  </form>
  
</body>
</html>