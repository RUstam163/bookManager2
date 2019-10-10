<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Войти в библиотеку</title>
</head>
<body>
<a href="/registration">Создать новую учетную запись</a>
<c:url value="/login" var="loginUrl"/>
<form action="${loginUrl}" method="post" class="transparent">
    <div class="form-inner">
        <h3>Войти в библиотеку</h3>
        <c:if test="${param.error != null}">
            <p>
                Не правильное Имя пользователя или Пароль.
            </p>
        </c:if>
        <c:if test="${param.logout != null}">
            <p>
                Вы вышли из библиотеки.
            </p>
        </c:if>
        <p>
            <label for="username">Имя пользователя</label>
            <input type="text" id="username" name="username"/>
        </p>
        <p>
            <label for="password">Пароль</label>
            <input type="password" id="password" name="password"/>
        </p>
        <input type="hidden"
               name="${_csrf.parameterName}"
               value="${_csrf.token}"/>
        <button type="submit" class="btn">Войти</button>
    </div>
</form>
</body>
</html>
