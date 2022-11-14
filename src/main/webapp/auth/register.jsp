<%--
  Created by IntelliJ IDEA.
  User: Youcode
  Date: 11/2/2022
  Time: 11:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<form action="register" method="post">
    <p>Enter first name
        <input type="text" name="firstName" /></p>

    <p>Enter  last name
        <input type="text" name="lastName" /></p>

    <p>Enter  your phone number
        <input type="text" name="phone" /></p>

    <p>Enter your username
        <input type="text" name="username" /></p>

    <p>Enter email
        <input type="text" name="email" /></p>

    <p>enter password
        <input type="text" name="password" /></p>


    <p>Submit
        <input type="submit" name="submit" value="submit" /></p>
</form>
<!--
<section class="d-flex justify-content-md-center pt-5 vh-100">
    <form action="" name="register" method="post" class="form w-50 h-75 border px-5 pt-3">
        <div class="form-group d-flex gap-4">
            <div class="firstname w-50">
                <label for="firstname" class="form-label">Firstname</label>
                <input type="text" name="firstname" id="firstname" class="form-control" placeholder="firstname" required>
            </div>
            <div class="lastname w-50">
                <label for="lastname" class="form-label">Lastname</label>
                <input type="text" name="lastname" id="lastname" class="form-control" placeholder="lastname" required>
            </div>
        </div>
        <div class="form-group">
            <label for="email" class="form-label">Email</label>
            <input type="email" name="email" id="email" class="form-control" placeholder="Email : example@email.com" required>
        </div>
        <div class="form-group">
            <label for="phone" class="form-label">Phone</label>
            <input type="tel" name="phone" id="phone" class="form-control" placeholder="Phone : 0607189671" required>
        </div>
        <div class="form-group">
            <label for="username" class="form-label">Username</label>
            <input type="text" name="username" id="username" class="form-control" placeholder="Enter your username" required>
        </div>
        <div class="form-group">
            <label for="password" class="form-label">Password</label>
            <input type="password" name="password" id="password" class="form-control" placeholder="Enter your password" required>
        </div>
        <div class="form-group mt-3">
            <input type="submit" value="Sign up" class="form-control bg-primary text-white">
        </div>
    </form>
</section>
-->
</body>
</html>
