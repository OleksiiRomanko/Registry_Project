<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta name="viewport" content="width = device-width, initial-scale = 1">

    <title>Паспорт</title>

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
<form action="/admin/" method="get">
    <button class="btn btn-success pull-left btn-sm" type="submit" data-toggle="modal">
        Повернутися до головного меню
    </button>
</form>
<br>
<br>

<h1></h1>
<h1></h1>
<h1 style="text-align: center">Введіть паспортні дані нового правопорушника:</h1>
<h1></h1>
<h1></h1>
<div class="row" style="text-align: center">

    <form:form method="post" modelAttribute="PassportsEntity" action="/admin/user/${UsersEntity.id}/edit/passport">
    <div class="col-lg-12 col-lg-offset-5" style="text-align: center">
        <div class="input-group">
            <form:input type="text" path="series" class="form-control" placeholder="Серія"/>
        </div>
        <div class="input-group">
            <form:errors path="series" cssClass="error"/>
        </div>
        <br>
        <div class="input-group">
            <form:input type="text" path="number" class="form-control" placeholder="Номер"/>
        </div>
        <div class="input-group">
            <form:errors path="number" cssClass="error"/>
        </div>
        <br>
        <div class="input-group">
            <p>Дата видачі</p>
            <form:input type="date" path="date" class="form-control" placeholder="Дата видачі"/>
        </div>
        <div class="input-group">
            <form:errors path="date" cssClass="error"/>
        </div>
        <br>
        <div class="input-group">
            <form:input type="text" path="author" class="form-control" placeholder="Ким виданий"/>
        </div>
        <div class="input-group">
            <form:errors path="author" cssClass="error"/>
        </div>
        <br>
        <div class="input-group">
            <p>Дата народження</p>
            <form:input type="date" path="birthDate" class="form-control" placeholder="Дата народження"/>
        </div>
        <div class="input-group">
            <form:errors path="birthDate" cssClass="error"/>
        </div>
        <br>
        <div class="input-group">
            <form:input type="text" path="birthPlace" class="form-control" placeholder="Місце народження"/>
        </div>
        <div class="input-group">
            <form:errors path="birthPlace" cssClass="error"/>
        </div>
        <br>
    </div>


</div>


<div style="text-align:center;">
    <div class="btn-group">
        <button class="myButton" type="submit">
            Зберігти
        </button>
    </div>
</div>

</form:form>

<br>
<div style="text-align:center;">
    <form:form action="/admin/user/${UsersEntity.id}/edit/certificate"  method="get">
        <button class="myButton" type="submit">
            Редагувати Сертифікат
        </button>
    </form:form>
</div>
<br>

<div style="text-align:center;">
    <form:form action="/admin/user/${UsersEntity.id}/edit/info" method="get">
        <button class="myButton" type="submit">
            Назад
        </button>
    </form:form>
</div>


</body>
</html>