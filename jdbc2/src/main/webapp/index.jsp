<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Sign In Form</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background: linear-gradient(to right, #007bff, #6610f2);
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        .form-container {
            background: white;
            border-radius: 15px;
            padding: 2rem;
            box-shadow: 0 10px 20px rgba(0, 0, 0, 0.2);
            width: 420px;
        }
        .form-title {
            margin-bottom: 1.5rem;
            font-size: 1.8rem;
            color: gray;
            text-align: center;
        }
        .btn-custom {
            background-color: #007bff;
            color: white;
        }
        .btn-custom:hover {
            background-color: green;
        }
        .text-primary {
            color: #007bff !important;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h1 class="form-title">Sign In</h1>
        <form action="sign" method="post">
            <div class="form-group">
                <label for="name">User Name</label>
                <input type="text" class="form-control" id="name" name="name" required>
            </div>
            <div class="form-group">
                <label for="email">Email</label>
                <input type="email" class="form-control" id="email" name="email" required>
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" class="form-control" id="password" name="password" required>
            </div>
            <button type="submit" class="btn btn-success btn-block">Sign In</button>
        </form>
      
    </div>

</body>
</html>
