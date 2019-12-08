<%@ page import="model.User" %>
<%@ page import="java.util.List" %>
<%@ page import="Service.UserService" %><%--
  Created by IntelliJ IDEA.
  User: slava
  Date: 05.12.2019
  Time: 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>All users</title>
  </head>
  <body>
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
</html>
