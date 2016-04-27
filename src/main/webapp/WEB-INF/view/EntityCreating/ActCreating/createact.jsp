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
    <link href="<c:url value="/resources/css/button.css" />" rel="stylesheet">



</head>

<body>

<script src="<c:url value="/resources/js/jquery.min.js" />"></script>
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
<div style="text-align: center">
    <h1>
        Додати новий кримінальний акт
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
            <h2 style="text-align: center">Будь ласка, інші необхідні відомості про даний кримінальний акт
            </h2>
            <br>
        </div>
    </div>
</div>


<form:form method="post" modelAttribute="CriminalActEntity" action="/admin/act/add/${user.id}/act/add">

    <div class="row" style="text-align: center">

        <div class="col-lg-12 col-lg-offset-5" style="text-align: center">

            <div class="input-group">
                <form:input path="criminalDescription" type="text" class="form-control" placeholder="Опис правопорушення"/>
            </div>
            <br>
            <div class="input-group">
                <form:input path="criminalType" type="text" class="form-control" placeholder="Тип правопорушення"/>
            </div>
            <br>
            <div class="input-group">
                <p>Дата судового рішення</p>
                <form:input path="tribunalDate" type="date" class="form-control" placeholder="Дата судового рішення"/>
            </div>
            <br>
            <div class="input-group">
                <p>Дата набрання законності</p>
                <form:input path="activationDate" type="date" class="form-control" placeholder="Дата набрання законності"/>
            </div>
            <br>
            <div class="input-group">
                <form:input path="penaltyType" type="text" class="form-control" placeholder="Вид покарання"/>
            </div>
            <br>
            <div class="input-group">
                <p>Дата погашення судимості</p>
                <form:input path="dateRepaymentConvitions" type="date" class="form-control" placeholder="Дата погашення судимості"/>
            </div>
            <br>
            <div class="input-group">
                <form:input path="RepaymentConvictions" type="text" class="form-control" placeholder="Підстава для погашення"/>
            </div>
            <br>
            <div class="input-group">
                <form:input  path="requisitesOfPaymentPenalty" type="text" class="form-control" placeholder="Реквізити наказу про накладання судимості"/>
            </div>
            <br>
            <div class="input-group">
                <form:input  path="processOfCriminal" type="text" class="form-control" placeholder="Вид дисциплінарного стягнення"/>
            </div>
            <br>
            <div class="input-group">
                <form:input path="groundOfPenalty" type="text" class="form-control" placeholder="Спосіб вчинення стягнення"/>
            </div>
            <br>
            <div class="input-group">
                <p>Дата дисциплінарного стягнення</p>
                <form:input path="dateoffPenalty" type="date" class="form-control" placeholder="Дата дисциплінарного стягнення"/>
            </div>
            <br>
        </div>
    </div>

    <div style="text-align:center;">
        <button class="myButton" type="submit">
            Додати до бази
        </button>

    </div>
</form:form>

<br>

<div style="text-align:center;">
    <form:form action="/admin/act/add/step/from4to3" method="get">
        <button class="myButton" type="submit">
            Назад
        </button>
    </form:form>
</div>

</body>
</html>