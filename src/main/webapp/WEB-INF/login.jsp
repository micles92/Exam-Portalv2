<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns:th="http://www.thymeleaf.org" xmlns:tiles="http://www.thymeleaf.org">
<head>
    <title tiles:fragment="title">Login</title>
    <link rel="stylesheet" type="text/css" href="../css/Main.css">

    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

</head>
<body>

<c:if test="${not empty registerSuccess}">
<div class="alert alert-success">
    <strong>Success!</strong> You may now login.
</div>
</c:if>

<c:if test="${not empty logoutSuccess}">
    <div class="alert alert-success">
        <strong>Success!</strong> Udalo sie
    </div>
</c:if>


<div id="login" class="span3 well well-large offset4">
    <form  name="f" th:action="@{/login}" method="post">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

            <legend>Account Panel</legend>
            <div th:if="${param.error}" class="alert alert-error">
            </div>
            <div th:if="${param.logout}" class="alert alert-success">
            </div>
            <label for="username">Username</label>
            <input type="text" id="username" name="username" placeholder="Login"/>
            <label for="password">Password</label>
            <input type="password" id="password" name="password" placeholde r="Password"/>
            <label class="checkbox" for="rememberme">
            <input type="checkbox" /> Remember me
            </label> <br />
            <div class="form-actions">
                <button type="submit" value="Login" class="btn btn-success">Log in</button> or <a class="btn" href="/register">Create Account</a>
            </div>

    </form>
</div>

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>
</html>