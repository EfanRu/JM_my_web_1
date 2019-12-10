<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="model.User" %>
<%@ page import="service.UserServiceImpl" %>
<%@ page import="java.util.List" %>
<%@ page import="dao.UserDaoImpl" %>
<%@ page import="servlets.AllUsersServlet" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>--%>
<%--<jsp:useBean id="UserDaoImpl" class="dao.UserDaoImpl" scope="page" />--%>

<html>
  <head>
    <title>Project</title>
  </head>

  <body>
  <p>It's your project! Welcome!<br>
  </body>

  <p>All users in database trying:<br>

<%--    <form action="/all" method="get">--%>
     <%-- <% List<User> list = (ArrayList) request.getAttribute("list"); %>
            <table>
          <tr>
              <td>id/td>
              <td>First name</td>
              <td>Second name</td>
              <td>Phone number</td>
          </tr>

          &lt;%&ndash;@elvariable id="users" type="java.util.List"&ndash;%&gt;
          <c:forEach items="${users}" var="user">
          <tr>
              <td>${user.getId()}</td>
              <td>${user.getFirstName}</td>
              <td>${user.getLastName}</td>
              <td>${user.getPhoneNumber}</td>
          </tr>
          </c:forEach>--%>
<%--    </form>--%>

  <p>All users in database:<br>
<%--

  <%
      List<User> list = new UserServiceImpl().getAllUsers();
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
  </p>
--%>

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
