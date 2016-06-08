<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lesiulol
  Date: 08.06.16
  Time: 09:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
    <h1>Register form</h1>

    <form:form modelAttribute="user" method="POST" enctype="utf8" action="/register">
        <br>
        <tr><label>First Name</label>
        <td><form:input path="firstName" value=""/></td>
        </tr>

        <tr><label>Last Name</label>
            <td><form:input path="lastName" value=""/></td>
        </tr>


        <tr><label>Email</label>
            <td><form:input path="email" value=""/></td>
        </tr>

        <tr><label>Password</label>
            <td><form:input path="password" value=""/></td>
        </tr>

<button type="submit">Zarejestruj</button>

    </form:form>
<br>
    <a href="<c:url value="/login" />">Log In
    </a>

</body>
</html>
