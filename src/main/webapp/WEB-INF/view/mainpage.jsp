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



<form action="/admin/">
    <button class="btn btn-success pull-right btn-sm" type="submit">
        Увійти як Адміністратор
    </button>
    </form>

<div style="text-align: center">
    <br>
    <br>
    <br>
    <h1>
        Єдиний державний реєстр України осіб, що вчинили корупційні правопорущення
    </h1>
    <br>
    <br>
    <br>
    <br>
    <br>
</div>

<div class="container">
    <div class="row">
        <div class="col-md-6 col-md-offset-3">
            <h2 style="text-align: center">Введіть анкетні дані потрібної персони</h2>

            <div class="container">
                <div class="row">
                    <div class="col-md-6">
                        <div id="custom-search-input">
                            <div class="input-group col-md-12">
                                <input type="text" class="form-control input-lg"
                                       placeholder="Наприклад: Ратошнюк Максим Юрійович" />
                    <span class="input-group-btn">
                        <form:form action="/mainpage/result" method="get">
                            <button class="btn btn-info btn-lg" type="submit">
                                <i class="glyphicon glyphicon-search"></i>
                            </button>
                        </form:form>

                    </span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

</div>



</body>
</html>