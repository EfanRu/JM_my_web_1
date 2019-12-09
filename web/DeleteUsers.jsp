<%--
  Created by IntelliJ IDEA.
  User: slava
  Date: 09.12.2019
  Time: 13:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete user menu</title>
</head>
<body>

<form action="/delete" method="post">
    <p><b>Write id of user for delete:</b><br>
        <input type="text" name="id">
    </p>
    <input type="submit" value="Submit">
</form>


</body>
</html>
