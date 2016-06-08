<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:url value="/user-answer/save" var="userAnswerSaveURL"/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Questions</title>

    <link rel="stylesheet" type="text/css" href="../css/Main.css">

    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
</head>
<body>
<div id="container">
    <div>
        <div id="logo">
            <h1>Exam</h1>
        </div>

        <div id="content" >

            <table class="table table-bordered table-striped table-hover">
                <thead>
                <th><p>${question.text}</p></th>
                </thead>
                <tbody>
                <td>
                    <form id="answ-form" action="${userAnswerSaveURL}" method="POST">
                        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                    <c:forEach var="answer" items="${question.answers}">
                    <div class="checkbox">
                        <label><input name="answers" type="checkbox" value="${answer.id}">${answer.text}</label>
                    </div>
                    </c:forEach>
                    </form>
                </td>
                </tbody>
            </table>
        </div>

        <div id="buttons" align="center">
            <a id="prev-question"  class="btn btn-default">Preview</a>
            <a id="next-question" class="btn btn-default">Next</a>
        </div>
        <div id="footer"></div>

    </div>
   </div>
<script type="text/javascript">

    // A $( document ).ready() block.
    //dodawanie eventu do guzika
    $( document ).ready(function() {
       // console.log( "ready!" );
        $('#next-question').on('click', function(){
            $('#answ-form').submit();
        });
    });

</script>
</body>
</html>