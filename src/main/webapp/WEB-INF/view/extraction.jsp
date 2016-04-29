<%@ page import="com.kp_42.Model.Entity.ExtractionEntity" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
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
        <div class="col-md-12 col-md-offset-0">
            <h2 style="text-align: center">Введіть анкетні дані потрібної персони</h2>

            <div class="container">
                <div class="row">

                    <table class="table table-striped table-bordered table-list">
                        <thead>
                        <tr>
                            <th>Ім'я</th>
                            <th>Прізвище</th>
                            <th>По батькові</th>
                            <th>Місце роботи</th>
                            <th>Посада</th>
                            <th>Склад правопорушення</th>
                            <th>Тип правопорушення</th>
                            <th>Санкції</th>
                            <th>Дата набуття чинності</th>
                        </tr>
                        </thead>
                        <tbody>

                        <tr>
                            <td>${extract.user.name}</td>
                            <td>${extract.user.surname}</td>
                            <td>${extract.user.secondName}</td>
                            <td>${extract.user.workplace.workplaceName}</td>
                            <td>${extract.user.workplace.worktitle}</td>
                            <td>${extract.user.criminalAct.criminalDescription}</td>
                            <td>${extract.user.criminalAct.criminalType}</td>
                            <td>${extract.user.criminalAct.penaltyType}</td>
                            <td><%=new SimpleDateFormat("yyyy-MM-dd").format((new Date(((ExtractionEntity) request.getAttribute("extract")).getUser().getCriminalAct().getActivationDate())))%></td>
                        </tr>

                        </tbody>
                    </table>




                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>

