<%--
  Created by IntelliJ IDEA.
  User: Youcode
  Date: 03/11/2022
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<p style="color: red">
<%
    if (request.getAttribute ( "errorMessage" ) != null){
        out.println ( request.getAttribute ( "errorMessage" ) );
    }
%>
</p>
    <form name="login" method="post">
        <label>username</label>
        <input type="text" name="username" id="username" placeholder="Username">
        <br>
        <label>Password:</label>
        <input type="password" name="password" placeholder="Password">
        <br>
        <input type="submit" value="Sign In">
    </form>
</body>
</html>
