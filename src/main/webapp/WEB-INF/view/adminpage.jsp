<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta name="viewport" content="width = device-width, initial-scale = 1">

    <title>AdminPage</title>

    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/bootstrap-theme.min.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/search.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/login.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/button.css" />" rel="stylesheet">


</head>

<script src="<c:url value="/resources/js/jquery.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

<form action="/logout">
    <button class="btn btn-success pull-right btn-sm" type="submit" data-toggle="modal">
        Покинути кабінет Адміністратора
    </button>
</form>
<br>
<h1>Ви увійшли до кабинету Адміністратора.</h1>
<br>
<br>
<br>
<br>
<h1></h1>
<div style="text-align:center;">

    <form:form action="/admin/user/add/step/1" method="get">
        <button class="myButton" type="submit">
            Додати порушника
        </button>
    </form:form>
    <h1></h1>
    <button class="myButton" type="button">
        Додати акт
    </button>
    <h1></h1>
    <button class="myButton" type="button">
        Додати закон
    </button>
    <h1></h1>
    <button class="myButton" type="button">
        Знайти особу
    </button>
    <h1></h1>
    <button class="myButton" type="button">
        Знайти акт
    </button>
</div>



</body>
</html>