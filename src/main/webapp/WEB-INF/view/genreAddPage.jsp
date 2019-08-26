<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Добавить новый жанр</title>
</head>
<body>
<div>
    <h2 class="headline">Добавить новый жанр</h2>
</div>
<div>
    <c:url value="/addGenre" var="addGenre"/>
    <form action="${addGenre}" method="POST">
        <label for="genre">Жанр</label>
        <input type="text" name="genre" id="genre">
        <input type="submit" value="Добавить жанр">
    </form>
</div>
</body>
</html>
