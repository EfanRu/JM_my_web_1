<%@ page import="model.User" %>
<%@ page import="Service.UserService" %>
<%@ page import="java.util.List" %><%--
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
  <p>It's your project! Welcome!<br>
  </body>

  <body>
  <p>All users in database:<br>
  <%
      List<User> list = new UserService().getAllUsers();
      if (list == null) {
          response.setStatus(403);
  %>
  In data base no one user.
  <%
  } else {
      response.setStatus(200);
  %>
  All users is:<br>
  <%
      for (User u : list) {
  %>
  User id = <%=u.getId()%>, first name = <%=u.getFirstName()%>, last name = <%=u.getLastName()%>, phone number = <%=u.getPhoneNumber()%> <br>
  <%
          }
      }
  %>
  </body>

  <body>
  <p>Add user:<br>
      <form action="/add" method="post">
          <p>First name:<br>
              <input type="text" name="first name">
          </p>
          <p>Last name:<br>
              <input type="text" name="last name">
          </p>
          <p>Phone number<br>
              <input type="text" name="phone number">
          </p>
          <input type="submit" value="Submit">
      </form>
  </body>

  <body>
  <p>Edit and delete user:
      <form action="/edit" method="GET">
          <input type="submit" value="Edit or delete user">
      </form>
  </body>
</html>
