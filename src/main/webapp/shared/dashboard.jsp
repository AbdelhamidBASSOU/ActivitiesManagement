<%@ page import="com.activitiesManagement.entity.Users" %><%--
  Created by IntelliJ IDEA.
  User: Youcode
  Date: 03/11/2022
  Time: 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Welcome <% Users user = (Users) request.getAttribute ( "user" ); user.getFirstName (); %></h1>
</body>
</html>
