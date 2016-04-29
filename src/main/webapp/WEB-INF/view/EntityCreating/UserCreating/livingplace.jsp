<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta name="viewport" content="width = device-width, initial-scale = 1">

    <title>Місце проживання</title>

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
<h1 style="text-align: center">Введіть адресу проживання нового правопорушника:</h1>
<h1></h1>
<h1></h1>


<form:form method="post" modelAttribute="LivingPlaceEntity" action="/admin/user/add/step/5">
    <div class="row" style="text-align: center">

        <div class="col-lg-12 col-lg-offset-5" style="text-align: center">
            <div class="input-group">
                <form:input type="text" path="country" class="form-control" placeholder="Країна"/>
            </div>
            <div class="input-group">
                <form:errors path="country" cssClass="error" />
            </div>
            <br>
            <div class="input-group">
                <form:input type="text" path="region" class="form-control" placeholder="Область"/>
            </div>
            <div class="input-group">
                <form:errors path="region" cssClass="error" />
            </div>
            <br>
            <div class="input-group">
                <form:input type="text" path="city" class="form-control" placeholder="Місто"/>
            </div>
            <div class="input-group">
                <form:errors path="city" cssClass="error" />
            </div>
            <%--<br>--%>
            <%--<div class="input-group">--%>
                <%--<form:input type="text" path="district" class="form-control" placeholder="Район"/>--%>
            <%--</div>--%>
            <%--<br>--%>
            <div class="input-group">
                <form:input type="text" path="district" class="form-control" placeholder="Вулиця"/>
            </div>
            <div class="input-group">
                <form:errors path="district" cssClass="error" />
            </div>
            <br>
            <div class="input-group">
                <form:input type="text" path="house" class="form-control" placeholder="Будинок"/>
            </div>
            <div class="input-group">
                <form:errors path="house" cssClass="error" />
            </div>
            <br>
            <div class="input-group">
                <form:input type="text" path="flat" class="form-control" placeholder="Квартира"/>
            </div>
            <div class="input-group">
                <form:errors path="flat" cssClass="error" />
            </div>
            <br>
        </div>
    </div>


     <div style="text-align:center;">
        <div class="btn-group">
            <button class="myButton" type="submit">
            Далі
            </button>
        </div>
    </div>

</form:form>
<br>
<div style="text-align:center;">
    <form:form action="/admin/user/add/step/3" method="post">
        <button class="myButton" type="submit">
            Назад
        </button>
    </form:form>
</div>


</body>
</html>