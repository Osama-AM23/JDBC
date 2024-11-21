<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Am.Creation</title>
</head>
<body>
<span style="font-size: 1.5em; font-weight: bold; color: green;">${success}</span>
<span style="font-size: 1.5em; font-weight: bold; color: red;">${failure}</span>

<form action="getEmail" method="post">
Email <input type="text" name="email"/>
<button type="submit"> Update</button>
</form>

</body>
</html>