<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Добавить новую книгу</title>
</head>
<body>
<c:url value="/addBook" var="addBook"/>
<form action="${addBook}" method="POST">
    <label for="bookName">Название</label>
    <input type="text" name="bookName" id="bookName">
    <label for="bookAuthor">Автор</label>
    <input type="text" name="bookAuthor" id="bookAuthor">
    <label for="bookGenre">Жанр</label>
    <input type="text" name="bookGenre" id="bookGenre">
    <label for="publisher">Издательство</label>
    <input type="text" name="publisher" id="publisher">
    <label for="year">Год издания</label>
    <input type="text" name="year" id="year">
    <label for="city">Город</label>
    <input type="text" name="city" id="city">
    <input type="submit" value="Добавить новую книгу">

</form>
</body>
</html>
