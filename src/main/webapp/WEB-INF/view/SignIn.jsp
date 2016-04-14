<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta name="viewport" content="width = device-width, initial-scale = 1">

        <title>Example</title>

        <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/bootstrap-theme.min.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/search.css" />" rel="stylesheet">


    </head>

    <body>

        <script src="<c:url value="/resources/js/jquery.min.js" />"></script>
        <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

        <button class="btn btn-success" onclick="$(this).hide();">Log in as administator</button>

        <div class="container">
            <div class="row">
                <div class="col-md-6 col-md-offset-3">
                    <h1>Введіть анкетні дані потрібної персони</h1>
                </div>
            </div>
            <div class="row">
                <div class="col-md-4 col-md-offset-3">
                    <form action="" class="search-form">
                        <div class="form-group has-feedback">
                            <label for="search" class="sr-only">Search</label>
                            <input type="text" class="form-control" name="search" id="search"
                                   placeholder="Наприклад: Ратошнюк Максим Юрійович">
                            <span class="glyphicon glyphicon-search form-control-feedback"></span>
                        </div>
                    </form>
                </div>
            </div>
        </div>

    </body>
</html>
