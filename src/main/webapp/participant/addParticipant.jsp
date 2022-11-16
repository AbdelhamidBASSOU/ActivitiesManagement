<%--
  Created by IntelliJ IDEA.
  User: Youcode
  Date: 11/15/2022
  Time: 11:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>add Activity</title>
</head>
<body>
<form action="addParticipant" method="post" name="addParticipant">
  <input type="text" name="firstname" placeholder="firstname">
  <br>
  <input type="text" name="lastname" placeholder="lastname">
  <br>
  <input type="tel" name="phone" placeholder="phone">
  <br>
  <input type="email" name="email" placeholder="email">
  <br>
  <input type="text" name="username" placeholder="username">
  <br>
  <input type="password" name="password" placeholder="password">
  <br>
  <input type="radio" name="status" value="true"> true
  <br>
  <input type="radio" name="status" value="false"> false
  <br>
  <input type="text" name="domaine" placeholder="domaine">
  <br>
  <input type="text" name="structure" placeholder="structure">
  <br>
  <input type="submit" name="submit" value="submit" />
</form>
</body>
</html>
