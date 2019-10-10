<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Войти в библиотеку</title>
</head>
<body>
<c:url value="/registration" var="registrationURL"/>
<form action="${registrationURL}" method="post" class="transparent">
    <div class="form-inner">
        <h3>Создать новую учетную запись</h3>
        <p>
            <label for="login">Имя пользователя</label>
            <input type="text" id="login" name="login"/>
        </p>
        <p>
            <label for="password">Пароль</label>
            <input type="password" id="password" name="password"/>
        </p>
        <input type="hidden"
               name="${_csrf.parameterName}"
               value="${_csrf.token}"/>
        <button type="submit" class="btn">Зарегестрироваться</button>
    </div>
</form>
</body>
</html>
