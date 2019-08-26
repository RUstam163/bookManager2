<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link href="<c:url value="/res/style.css"/>" rel="stylesheet" type="text/css"/>
    <title>Жанры</title>
</head>
<body>

<h2 class="headline">Жанры</h2>
<table>
    <tr>
        <th>id</th>
        <th>Жанр</th>
    </tr>
    <c:forEach var="genres" items="${genreList}">
        <tr>
            <td>${genres.id}</td>
            <td>${genres.genreName}</td>
            <td>
                <a href="/editGenre/${genres.id}" class="link">Изменить</a>
                <a href="/deleteGenre/${genres.id}" class="link">Удалить</a>
            </td>
        </tr>
    </c:forEach>
</table>

<h2 class="headline">Добавить новый жанр</h2>
<c:url value="/addGenre" var="genre"/>
<a href="${genre}" class="link">Добавить</a>
</body>
</html>
