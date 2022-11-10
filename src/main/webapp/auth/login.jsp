<%--
  Created by IntelliJ IDEA.
  User: Youcode
  Date: 03/11/2022
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>

<%@ include file="../shared/header.jsp"%>

<%
    if (request.getAttribute ( "errorMessage" ) != null){
        out.println ( request.getAttribute ( "errorMessage" ) );
    }
%>



<!--
    <form name="login" method="post">
        <label>username</label>
        <input type="text" name="username" id="username" placeholder="Username">
        <br>
        <label>Password:</label>
        <input type="password" name="password" placeholder="Password">
        <br>
        <input type="submit" value="Sign In">
    </form>
-->


<%@ include file="../shared/footer.jsp"%>