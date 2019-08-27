<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="<c:url value="/res/style.css"/>" rel="stylesheet" type="text/css"/>
    <title>Изменить жанр</title>
</head>
<body>
<c:url value="/editGenre" var="editGenre"/>
<form class="transparent" method="post" action="${editGenre}">
    <div class="form-inner">
        <h3>Изменить жанр</h3>
        <input type="hidden" name="id" id="id" value="${genre.id}">
        <label for="genreName">Жанр</label>
        <input type="text" name="genreName" id="genreName" value="${genre.genreName}">
        <input type="submit" value="Изменить жанр">
    </div>
</form>
</body>

</html>
