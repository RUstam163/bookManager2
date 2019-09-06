<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="<c:url value="/res/style.css"/>" rel="stylesheet" type="text/css"/>
    <title>Изменить автора</title>
</head>
<body>
<ul class="menu-main">
    <li><a href="/" class="current">Главная страница</a></li>
    <li><a href="/genre">Жанры</a></li>
    <li><a href="/author">Авторы</a></li>
    <li><a href="/book">Книги</a></li>
</ul>
<c:url value="/editAuthor" var="editAuthor"/>
<form class="transparent" action="${editAuthor}" method="POST">
    <div class="form-inner">
        <h3>Изменить автора</h3>
        <input type="hidden" name="id" id="id" value="${author.id}">
        <label for="name">Имя</label>
        <input type="text" name="name" id="name" value="${author.name}" required>
        <label for="lastname">Отчество</label>
        <input type="text" name="lastname" id="lastname" value="${author.lastname}" required>
        <label for="fathername">Фамилия</label>
        <input type="text" name="fathername" id="fathername" value="${author.fathername}" required>
        <input type="submit" value="Изменить автора" name="sub">
    </div>
</form>
</body>
</html>
