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
    <title>Add user</title>
  </head>
  <body>
  Add user:

  <form action="/add" method="post">
    <p><b>First name:</b><br>
      <input type="text" name="first name">
    </p>
    <p><b>Last name:</b>><br>
      <input type="text" name="last name">
    </p>
    <p><b>Phone number</b><br>
      <input type="text" name="phone number">
    </p>
    <input type="submit" value="Submit">
  </form>

  </body>
</html>
