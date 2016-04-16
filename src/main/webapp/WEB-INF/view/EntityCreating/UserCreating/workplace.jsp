<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="Form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta name="viewport" content="width = device-width, initial-scale = 1">

    <title>Робота</title>

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
<br>
<br>

<h1>Введіть дані про місця роботи:</h1>
<h1></h1>


<Form:form modelAttribute="WorkPlaceEntity" method="post" action="/admin/user/add/step/6">

    <div class="row" style="text-align: center">

        <div class="col-lg-12 col-lg-offset-5" style="text-align: center">
            <div class="input-group">
                <form:input type="text" path="worksphere" class="form-control" placeholder="Сфера діяльності"/>
            </div>
            <div class="input-group">
                <form:errors path="worksphere" cssClass="error" />
            </div>
            <br>
            <div class="input-group">
                <form:input type="text" path="adress" class="form-control" placeholder="Назва організації"/>
            </div>
            <div class="input-group">
                <form:errors path="adress" cssClass="error" />
            </div>
            <br>
            <div class="input-group">
                <form:input type="text" path="workplaceName" class="form-control" placeholder="Адреса організації"/>
            </div>
            <div class="input-group">
                <form:errors path="workplaceName" cssClass="error" />
            </div>
            <br>
            <div class="input-group">
                <form:input type="text" path="worktitle.title" class="form-control" placeholder="Посада"/>
            </div>
            <div class="input-group">
                <form:errors path="worktitle.title" cssClass="error" />
            </div>
            <br>
        </div>

    </div>

    <div style="text-align:center;">
        <div class="btn-group">
            <button class="myButton" type="submit">
                Додати правопорушника
            </button>
        </div>
    </div>

</Form:form>
<br>
<div style="text-align:center;">
    <form:form action="/admin/user/add/step/from5to4" method="get">
        <button class="myButton" type="submit">
            Назад
        </button>
    </form:form>
</div>
</body>
</html>