<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>X-workz</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8f9fa; /* Light grey background */
            padding: 20px;
        }
        .form-container {
            background-color: #ffffff; /* White background for the form */
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); /* Subtle shadow for better appearance */
            max-width: 500px;
            margin: auto;
        }
        .form-title {
            color: #007bff; /* Custom title color */
            margin-bottom: 20px;
        }
        .form-group {
            margin-bottom: 15px;
        }
        label {
            display: block;
            margin-bottom: 5px;
        }
        input[type="text"], input[type="email"], input[type="password"], input[type="number"] {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        button {
            background-color: #28a745;
            color: white;
            padding: 10px 15px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        button:hover {
            background-color: #218838; 
        }
    </style>
</head>
<body>
<div class="form-container">
    <h2 class="form-title">Am Creation</h2>
    <form action="selectAll" method="post">
        <div class="form-group">
            <label for="name">Name</label>
            <input type="text" id="name" name="name" required>
        </div>
        <div class="form-group">
            <label for="email">Email</label>
            <input type="email" id="email" name="email" required>
        </div>
        <div class="form-group">
            <label for="password">Password</label>
            <input type="password" id="password" name="password" required>
        </div>
        <div class="form-group">
            <label for="phone">Phone Number</label>
            <input type="text" id="phone" name="phone">
        </div>
        <div class="form-group">
            <label for="age">Age</label>
            <input type="number" id="age" name="age">
        </div>
        <div class="form-group">
            <label for="gender">Gender</label>
            <input type="text" id="gender" name="gender">
        </div>
        <button type="submit">Submit</button>
    </form>
</div>
</body>
</html>
