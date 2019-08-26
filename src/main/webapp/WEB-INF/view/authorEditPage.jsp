<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Изменить автора</title>
</head>
<body>
<div>
    <h2 class="headline">Изменить автора</h2>
</div>
<div>
    <c:url value="/editAuthor" var="editAuthor"/>
    <form action="${editAuthor}" method="POST">
        <input type="hidden" name="id" id="id" value="${author.id}">
        <label for="name">Имя</label>
        <input type="text" name="name" id="name" value="${author.name}">
        <label for="lastname">Отчество</label>
        <input type="text" name="lastname" id="lastname" value="${author.lastname}">
        <label for="fathername">Фамилия</label>
        <input type="text" name="fathername" id="fathername" value="${author.fathername}">
        <input type="submit" value="Изменить автора">
    </form>
</div>
</body>
</html>
