<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="<c:url value="/res/style.css"/>" rel="stylesheet" type="text/css"/>
    <title>Добавить нового автора</title>
</head>
<body>
<c:url value="/addAuthor" var="addAuthor"/>
<form class="transparent" action="${addAuthor}" method="POST">
    <div class="form-inner">
        <h3>Добавить нового автора</h3>
        <label for="name">Имя</label>
        <input type="text" name="name" id="name">
        <label for="lastname">Отчество</label>
        <input type="text" name="lastname" id="lastname">
        <label for="fathername">Фамилия</label>
        <input type="text" name="fathername" id="fathername">
        <input type="submit" value="Добавить автора">
    </div>
</form>
</div>
</body>
</html>
