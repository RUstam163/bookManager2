<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link href="<c:url value="/res/style.css"/>" rel="stylesheet" type="text/css"/>
    <title>Книги</title>
</head>
<body>
<h2 class="headline">Книги</h2>
<table>
    <tr>
        <th>id</th>
        <th>Название</th>
        <th>Автор</th>
        <th>Жанр</th>
        <th>Издательство</th>
        <th>Год издания</th>
        <th>Город</th>
    </tr>
    <c:forEach var="books" items="${bookList}">
        <tr>
            <td>${books.id}</td>
            <td>${books.bookName}</td>
            <td>${books.author}</td>
            <td>${books.genre}</td>
            <td>${books.publisher}</td>
            <td>${books.year}</td>
            <td>${books.city}</td>
            <td>
                <a href="/editBook/${books.id}" class="link">Изменить</a>
                <a href="/deleteBook/${books.id}" class="link">Удалить</a>
            </td>
        </tr>
    </c:forEach>
</table>

<h2 class="headline">Добавить новую книгу</h2>
<c:url value="/addBook" var="addBook"/>
<a href="${addBook}" class="link">Добавить</a>
</body>
</html>
