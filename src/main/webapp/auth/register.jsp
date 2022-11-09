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
</body>
</html>
