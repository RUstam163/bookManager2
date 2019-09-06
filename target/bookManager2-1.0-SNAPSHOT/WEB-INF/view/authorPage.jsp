<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link href="<c:url value="/res/style.css"/>" rel="stylesheet" type="text/css"/>
    <title>Авторы</title>
</head>
<body>
<ul class="menu-main">
    <li><a href="/" class="current">Главная страница</a></li>
    <li><a href="/genre">Жанры</a></li>
    <li><a href="/author">Авторы</a></li>
    <li><a href="/book">Книги</a></li>
</ul>
<h2 class="headline">Авторы</h2>
<table>
    <tr>
        <th>ID</th>
        <th>Имя</th>
        <th>Отчество</th>
        <th>Фамилия</th>
    </tr>
    <c:forEach var="authors" items="${authorList}">
        <tr>
            <td>${authors.id}</td>
            <td>${authors.name}</td>
            <td>${authors.lastname}</td>
            <td>${authors.fathername}</td>
            <td>
                <a href="/editAuthor/${authors.id}" class="link">Изменить</a>
                <a href="/deleteAuthor/${authors.id}" class="link">Удалить</a>
            </td>
        </tr>
    </c:forEach>
</table>

<h2 class="headline">Добавить нового автора</h2>
<c:url value="/addAuthor" var="addAuthor"/>
<a href="${addAuthor}" class="link">Добавить</a>
</body>
</html>
