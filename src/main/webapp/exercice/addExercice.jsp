<%--
  Created by IntelliJ IDEA.
  User: Youcode
  Date: 09/11/2022
  Time: 11:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ajouter un exercice</title>
</head>
<body>
<form name="addExercice" method="post">
    <input type="text" name="year" placeholder="year" id="year">
    <br>
    <input type="date" placeholder="date de début" name="dateDebut" id="dateDebut">
    <br>
    <input type="date" placeholder="date de fin" name="dateFin" id="dateFin">
    <br>
    <input type="radio" name="status" value=1 id="statusTrue">True
    <br>
    <input type="radio" name="status" value=0 id="statusFalse"> false
    <br>
    <input type="submit" name="submit" value="add Exercice">
</form>
</body>
</html>
