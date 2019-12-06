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
  It's your project! Welcome!
  </body>

  <form action="/all" method="GET">
    <input type="submit" value="Show all user">
  </form>

  <form action="/add" method="GET">
    <input type="submit" value="Add user">
  </form>

  <button onclick="location.href='/all'">All users</button>
  <button onclick="location.href='/add'">Add user</button>

</html>
