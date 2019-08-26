<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link href="<c:url value="/res/startPage.css"/>" rel="stylesheet" type="text/css"/>
    <title>Библиотека</title>
</head>
<body>
<div class="headlogo">
    <h1 class="">Библиотека</h1>
</div>
<div class="startline">
    <h3>Список книг</h3>
    <a href="/book" class="">Перейти к списку книг</a>
</div>
<div class="startline">
    <h3>Список авторов</h3>
    <a href="/author" class="">Перейти к списку авторов</a>
</div>
<div class="startline">
    <h3 class="">Список жанров</h3>
    <a href="/genre" class="">Перейти к списку жанров</a>
</div>
</body>
</html>
