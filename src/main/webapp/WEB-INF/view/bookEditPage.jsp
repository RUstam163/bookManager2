<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Изменить книгу</title>
</head>
<body>
<c:url value="/editBook" var="var"/>
<form action="${var}" method="POST">
    <input type="hidden" name="id" value="${book.id}">
    <label for="bookName">Название</label>
    <input type="text" name="bookName" id="bookName" value="${book.bookName}">
    <label for="bookAuthor">Автор</label>
    <input type="text" name="bookAuthor" id="bookAuthor" value="${book.author}">
    <label for="bookGenre">Жанр</label>
    <input type="text" name="bookGenre" id="bookGenre" value="${book.genre}">
    <label for="publisher">Издательство</label>
    <input type="text" name="publisher" id="publisher" value="${book.publisher}">
    <label for="year">Год издания</label>
    <input type="text" name="year" id="year" value="${book.year}">
    <label for="city">Город</label>
    <input type="text" name="city" id="city" value="${book.city}">

    <input type="submit" value="Edit book">
</form>
</body>
</html>
