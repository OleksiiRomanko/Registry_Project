<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<script src="<c:url value="/resources/js/admin.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

<form action="/logout">
    <button class="btn btn-success pull-right btn-sm" type="submit" data-toggle="modal">
        Покинути кабінет Адміністратора
    </button>
</form>

<br>
<br>
<h1>Введіть дані із свідоцтва про народження нового правопорушника:</h1>
<h1></h1>
<h1></h1>

<div class="row" style="text-align: center">

    <div class="col-lg-12 col-lg-offset-5" style="text-align: center">

        <div class="input-group">
            <input type="text" class="form-control" placeholder="Дата народження"/>
        </div>
        <br>
        <div class="input-group">
            <input type="text" class="form-control" placeholder="Місце народження"/>
        </div>
        <br>
    </div>
</div>

</div>

<div style="text-align:center;">
    <button class="myButton" type="button">
        NEXT
    </button>

</div>


</body>
</html>