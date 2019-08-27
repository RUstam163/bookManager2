<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link href="<c:url value="/res/style.css"/>" rel="stylesheet" type="text/css"/>
    <title>Добавить новую книгу</title>
</head>
<body>
<c:url value="/addBook" var="addBook"/>
<form class="transparent" action="${addBook}" method="POST">
    <div class="form-inner">
        <h3>Добавить новую книгу</h3>
        <label for="bookName">Название</label>
        <input type="text" name="bookName" id="bookName">
        <label for="author.id">Автор</label>
        <select name="author.id" id="author.id">
            <option>Выберите из списка</option>
            <c:forEach var="authors" items="${authorList}">
                <option value="${authors.id}">${authors.toString()}</option>
            </c:forEach>
        </select>
        <label for="genre.id">Жанр</label>
        <select name="genre.id" id="genre.id">
            <option>Выберите из списка</option>
            <c:forEach var="genres" items="${genreList}">
                <option value="${genres.id}">${genres.genreName}</option>
            </c:forEach>
        </select>
        <label for="publisher">Издательство</label>
        <input type="text" name="publisher" id="publisher">
        <label for="year">Год издания</label>
        <input type="text" name="year" id="year">
        <label for="city">Город</label>
        <input type="text" name="city" id="city">
        <input type="submit" value="Добавить новую книгу">
    </div>
</form>
</body>
</html>
