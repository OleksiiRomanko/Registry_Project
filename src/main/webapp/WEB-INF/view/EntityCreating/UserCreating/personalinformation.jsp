<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta name="viewport" content="width = device-width, initial-scale = 1">

    <title>Персональна інформація</title>

    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/bootstrap-theme.min.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/search.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/login.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/button.css" />" rel="stylesheet">


</head>

<script src="<c:url value="/resources/js/jquery.min.js" />"></script>
<script src="<c:url value="/resources/js/admin.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

<form action="/logout">
    <button class="btn btn-success pull-right btn-sm" type="submit" data-toggle="modal">
        Покинути кабінет Адміністратора
    </button>
</form>

<form action="/admin/user/add/step/tomenu" method="get">
    <button class="btn btn-success pull-left btn-sm" type="submit" data-toggle="modal">
        Повернутися до головного меню
    </button>
</form>

<br>
<br>

<h1>Введіть анкетні дані нового правопорушника:</h1>
<h1></h1>


<form:form method="post" modelAttribute="UsersEntity" action="/admin/user/add/step/2">
    <div class="row" style="text-align: center">

        <div class="col-lg-12 col-lg-offset-5" style="text-align: center">


            <div class="input-group">
                <form:input type="text" path="surname" class="form-control" placeholder="Прівище"/>
            </div>
            <div class="input-group">
                <form:errors path="surname" cssClass="error" />
            </div>

            <br>
            <div class="input-group">
                <form:input type="text" path="name" class="form-control" placeholder="Ім'я"/>
            </div>
            <div class="input-group">
                <form:errors path="name" cssClass="error" />
            </div>
            <br>
            <div class="input-group">
                <form:input type="text" path="secondName" class="form-control" placeholder="По батькові"/>
            </div>
            <div class="input-group">
                <form:errors path="secondName" cssClass="error" />
            </div>
            <br>
        </div>
    </div>

    <div style="text-align:center;">
            <button class="myButton" type="submit">
                Далі
            </button>

    </div>

</form:form>

<br>


</body>
</html>