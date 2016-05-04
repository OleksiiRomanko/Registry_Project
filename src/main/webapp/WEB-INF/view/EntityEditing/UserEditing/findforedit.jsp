<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta name="viewport" content="width = device-width, initial-scale = 1">

    <title>Example</title>

    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/bootstrap-theme.min.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/search.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/login.css" />" rel="stylesheet">



</head>

<body>

<script src="<c:url value="/resources/js/jquery.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

<form action="/logout">
    <button class="btn btn-success pull-right btn-sm" type="submit" data-toggle="modal">
        Покинути кабінет Адміністратора
    </button>
</form>
<br>
<br>
<div style="text-align: center">
    <h1>
        Редагування персональних даних
    </h1>
    <br>
    <br>
    <br>
    <br>
    <br>
</div>

<form:form action="/admin/user/search" method="get">
<div class="container">
    <div class="row">
        <div class="col-md-6 col-md-offset-3">
            <h2 style="text-align: center">Будь ласка, виберіть із бази даних людину,
                з даними якої ви хочете взаємодіяти
            </h2>
            <br>

            <div class="container">
                <div class="row">
                    <div class="col-md-6">
                        <div id="custom-search-input">
                            <div class="input-group col-md-12">
                                <input name="Credentials" type="text" class="form-control input-lg"
                                       placeholder="Наприклад: Ратошнюк Максим Юрійович" />
                    <span class="input-group-btn">
                        <button type="submit" class="btn btn-primary btn-sm">Search</button>
                    </span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>


        </div>
    </div>
</form:form>

</div>



</body>
</html>