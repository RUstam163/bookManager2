<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="<c:url value="/res/style.css"/>" rel="stylesheet" type="text/css"/>
    <title>Добавить новый жанр</title>
</head>
<body>
<c:url value="/addGenre" var="addGenre"/>
<form class="transparent" action="${addGenre}" method="POST">
    <div class="form-inner">
        <h3>Добавить новый жанр</h3>
        <label for="genreName">Жанр</label>
        <input type="text" name="genreName" id="genreName">
        <input type="submit" value="Добавить жанр">
    </div>
</form>
</body>
</html>
