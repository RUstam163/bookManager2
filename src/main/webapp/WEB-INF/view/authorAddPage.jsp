<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Добавить нового автора</title>
</head>
<body>
<div>
    <h2 class="headline">Добавить нового автора</h2>
</div>
<div>
    <c:url value="/addAuthor" var="addAuthor"/>
    <form action="${addAuthor}" method="POST">
        <label for="name">Имя</label>
        <input type="text" name="name" id="name">
        <label for="lastname">Отчество</label>
        <input type="text" name="lastname" id="lastname">
        <label for="fathername">Фамилия</label>
        <input type="text" name="fathername" id="fathername">
        <input type="submit" value="Добавить автора">
    </form>
</div>
</body>
</html>
