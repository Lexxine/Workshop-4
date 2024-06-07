<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Dodaj nową książkę</h2>
<form action="books/" method="post" >
    <label for="title">Tytuł</label>
    <input type="text" name="title" id="title">
    <label for="author">Autor</label>
    <input type="text" name="author" id="author">
    <label for="publisher">Wydawca</label>
    <input type="text" name="publisher" id="publisher">
    <label for="type">Gatunek</label>
    <input type="text" name="type" id="type">
    <input type="submit"Send>
</form>
</body>
</html>
