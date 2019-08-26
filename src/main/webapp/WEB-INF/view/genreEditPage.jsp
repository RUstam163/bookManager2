<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Изменить жанр</title>
</head>
<body>
<div>
    <h2 class="headline">Изменить жанр</h2>
</div>
<div>
    <c:url value="/editGenre" var="editGenre"/>
    <form method="post" action="${editGenre}" >
        <input type="hidden" name="id" id="id" value="${genre.id}">
        <label for="genreName">Жанр</label>
        <input type="text" name="genreName" id="genreName" value="${genre.genreName}">
        <input type="submit" value="Изменить жанр">
    </form>
</div>
</body>
</html>
