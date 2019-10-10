<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="<c:url value="/res/style.css"/>" rel="stylesheet" type="text/css"/>
    <title>Изменить жанр</title>
</head>
<body>
<ul class="menu-main">
    <li><a href="/" class="current">Главная страница</a></li>
    <li><a href="/genre">Жанры</a></li>
    <li><a href="/author">Авторы</a></li>
    <li><a href="/book">Книги</a></li>
</ul>
<c:url value="/editGenre" var="editGenre"/>
<form class="transparent" method="post" action="${editGenre}">
    <div class="form-inner">
        <h3>Изменить жанр</h3>
        <input type="hidden" name="id" id="id" value="${genre.id}">
        <label for="genreName">Жанр</label>
        <input type="text" name="genreName" id="genreName" value="${genre.genreName}" required>
        <input type="submit" value="Изменить жанр" name="sub">
        <input type="hidden"
               name="${_csrf.parameterName}"
               value="${_csrf.token}"/>
    </div>
</form>
</body>

</html>
