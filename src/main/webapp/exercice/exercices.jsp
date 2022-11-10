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
<div>
    <%
        List< Exercise > exerciceList = (List< Exercise>) request.getAttribute ( "exerciceList" );

        for( Exercise exercice : exerciceList ) {
            out.println ( "<div>" +
                    "<h2> Year : " + exercice.getYear () + "</h2" +
                            "<p> date de debut: " + exercice.getDateStart () + "</p>"  + "" +
                            "<p> date fin : " + exercice.getEndDate () + "</p>" + "" +
                            "<a href='deleteExercice?id="+exercice.getId () + "'>delete exercice </a>"+
                    "</div>" );
        }
    %>
</div>
</body>
</html>
