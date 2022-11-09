<%@ page import="java.util.List" %>
<%@ page import="com.activitiesManagement.entity.Exercise" %><%--
  Created by IntelliJ IDEA.
  User: Youcode
  Date: 09/11/2022
  Time: 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Exercices List</title>
</head>
<body>
<p>
    <%
        List< Exercise > exerciceList = (List< Exercise>) request.getAttribute ( "exerciceList" );

        for( Exercise exercice : exerciceList ) {
            out.println( exercice.toString () );
        }
    %>
</p>
</body>
</html>
