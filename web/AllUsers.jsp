<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="model.User" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: slava
  Date: 10.12.2019
  Time: 17:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Users</title>
</head>
<body>

    <form action="/all" method="get">
<% List<User> list = (ArrayList) request.getAttribute("list"); %>
<table>
    <tr>
        <td>id/td>
        <td>First name</td>
        <td>Second name</td>
        <td>Phone number</td>
    </tr>

    <%--@elvariable id="users" type="java.util.List"--%>
    <c:forEach items="${users}" var="user">
    <tr>
        <td>${user.getId()}</td>
        <td>${user.getFirstName}</td>
        <td>${user.getLastName}</td>
        <td>${user.getPhoneNumber}</td>
    </tr>
    </c:forEach>
        </form>

</body>
</html>
