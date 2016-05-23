<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
                    <div class="checkbox">
                        <label><input type="checkbox" value="">Answer 1</label>
                    </div>



                    <div class="checkbox">
                        <label><input type="checkbox" value="">Answer 2</label>
                    </div>

                    <div class="checkbox">
                        <label><input type="checkbox" value="">Answer 3</label>
                    </div>
                    <div class="checkbox">
                        <label><input type="checkbox" value="">Answer 4</label>
                    </div>
                </td>
                </tbody>
            </table>
        </div>

        <div id="buttons" align="center">
            <button type="button" class="btn btn-default">Preview</button>
            <button type="button" class="btn btn-default">Next</button>
        </div>
        <div id="footer"></div>

    </div>
</body>
</html>