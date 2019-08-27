<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link href="<c:url value="/res/style.css"/>" rel="stylesheet" type="text/css"/>
    <title>Изменить книгу</title>
</head>
<body>
<c:url value="/editBook" var="editBook"/>
<form class="transparent" action="${editBook}" method="POST">
    <div class="form-inner">
        <h3>Изменить книгу</h3>
        <input type="hidden" name="id" value="${book.id}">
        <label for="bookName">Название</label>
        <input type="text" name="bookName" id="bookName" value="${book.bookName}">
        <label for="author.id">Автор</label>
        <select name="author.id" id="author.id">
            <option>Выберете автора из списка</option>
            <c:forEach var="authors" items="${authorList}">
                <option value="${authors.id}">${authors.toString()}</option>
            </c:forEach>
        </select>
        <label for="genre.id">Жанр</label>
        <select name="genre.id" id="genre.id">
            <option>Выберете жанр из списка</option>
            <c:forEach var="genres" items="${genreList}">
                <option value="${genres.id}">${genres.genreName}</option>
            </c:forEach>
        </select>
        <label for="publisher">Издательство</label>
        <input type="text" name="publisher" id="publisher" value="${book.publisher}">
        <label for="year">Год издания</label>
        <input type="text" name="year" id="year" value="${book.year}">
        <label for="city">Город</label>
        <input type="text" name="city" id="city" value="${book.city}">
        <input type="submit" value="Edit book">
    </div>
</form>
</body>
</html>
