<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="<c:url value="/res/style.css"/>" rel="stylesheet" type="text/css"/>
    <title>Добавить нового автора</title>
</head>
<body>
<ul class="menu-main">
    <li><a href="/" class="current">Главная страница</a></li>
    <li><a href="/genre">Жанры</a></li>
    <li><a href="/author">Авторы</a></li>
    <li><a href="/book">Книги</a></li>
</ul>
<c:url value="/addAuthor" var="addAuthor"/>
<form class="transparent" action="${addAuthor}" method="POST">
    <div class="form-inner">
        <h3>Добавить нового автора</h3>
        <label for="name">Имя</label>
        <input type="text" name="name" id="name" required>
        <label for="lastname">Отчество</label>
        <input type="text" name="lastname" id="lastname" required>
        <label for="fathername">Фамилия</label>
        <input type="text" name="fathername" id="fathername" required>
        <input type="submit" value="Добавить автора" name="sub">
        <input type="hidden"
               name="${_csrf.parameterName}"
               value="${_csrf.token}"/>
    </div>
</form>
</div>
</body>
</html>
