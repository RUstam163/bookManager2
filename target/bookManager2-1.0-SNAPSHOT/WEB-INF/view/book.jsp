<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>BOOKS</title>
</head>
<body>

<h2>BOOKS</h2>
<table>
    <tr>
        <th>id</th>
        <th>title</th>
        <th>year</th>
        <th>genre</th>
        <th>watched</th>
        <th>action</th>
    </tr>
    <c:forEach var="books" items="${bookList}">
        <tr>
            <td>${books.id}</td>
            <td>${books.title}</td>
            <td>${books.year}</td>
            <td>${books.genre}</td>
            <td>${books.watched}</td>
            <td>
                <a href="/edit/${books.id}">edit</a>
                <a href="/delete/${books.id}">delete</a>
            </td>
        </tr>
    </c:forEach>
</table>

<h2>Add</h2>
<c:url value="/add" var="add"/>
<a href="${add}">Add new film</a>
</body>
</html>
