
<%--
  Created by IntelliJ IDEA.
  User: alx.rogatko
  Date: 19.04.2023
  Time: 21:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Обучающая платформа ${visiblelogin}</title>
</head>
<body>
<form method="post" action="login_page">
    <input type="text" name="login" placeholder="Ваш логин" text>
<br>
    <input type="password" name="password" placeholder="Ваш пароль">
    <br>
    <button type="submit" name="name" >Отправить</button>

    </a>
<br>
</form>
<form method="get" action="/registration_page">
<a href="/registration_page">Регистрация</a>

</form>
</body>
</html>
