<%--
  Created by IntelliJ IDEA.
  User: slava
  Date: 05.12.2019
  Time: 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Project</title>
  </head>
  <body>
  It's your project! Welcome!<br>
  </body>

  <form action="/all" method="GET">
    <input type="submit" value="Show all user">
  </form>

  <form action="/add" method="GET">
    <input type="submit" value="Add user">
  </form>

  <form action="/edit" method="GET">
    <input type="submit" value="Edit user">
  </form>

  <form action="/delete" method="GET">
    <input type="submit" value="Delete user">
  </form>
</html>
