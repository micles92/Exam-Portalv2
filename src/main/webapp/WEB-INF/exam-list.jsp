<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:url value="/exam/take" var="takeExamURL"/>
<c:url value="/logout" var="logoutURL"/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Exam App</title>
    <link rel="stylesheet" type="text/css" href="../css/Main.css">

    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</head>
<body>
<div id="container">

    <div id="logo">
        <H1>Exam list</H1>
    </div>


    <div>
        <ul class="nav nav-tabs">
            <li role="presentation" class="active"><a href="#">Home</a></li>
            <li role="presentation"><a href="#">Exams</a></li>
            <li role="presentation"><a href="#">History</a></li>
            <li role="presentation" class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">
                    Account <span class="caret"></span>
                </a>
                <ul class="dropdown-menu">
                    <li role="presentation"><a href="#">My Account</a></li>
                    <li role="presentation"><a href="${logoutURL}" >Logout</a></li>
                </ul>
            </li>
        </ul>
        </ul>
    </div>
    <div id="content">

        <table class="table table-bordered table-striped table-hover">
            <thead>
            <tr>
                <th>Exam</th>
                <th>Status</th>

            </tr>
            </thead>
            <tbody>
            <c:forEach items="${exams}" var="exam">
            <tr>
            <td><a href="${takeExamURL}/${exam.id}">${exam.name}</a></td>
            <td><p2>Passed</p2></td>
            </tr>
            </c:forEach>
            </tbody>

        </table>

    </div>

    <div id="footer"></div>



</div>







</body>
</html>