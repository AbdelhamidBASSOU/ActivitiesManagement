<%@ page import="com.activitiesManagement.entity.Activity" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Youcode
  Date: 11/2/2022
  Time: 11:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Activity</title>
</head>
<body>
<p>
    <%
        List<Activity> activityList = (List< Activity>) request.getAttribute ( "activityList" );

        for( Activity activity : activityList ) {
            out.println( activity.toString () );
        }
    %>
</p>
</body>
</html>
