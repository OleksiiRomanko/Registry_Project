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

<form:form method="post" modelAttribute="LawWrapper" action="/admin/act/add/${user.id}/act">
    <div class="container">
        <div class="row">
            <div class="col-md-6 col-md-offset-3">
                <h2 style="text-align: center">Будь ласка, виберіть із бази даних статтю із закону,
                    до якої відноситься створюваний
                    кримінальний акт
                </h2>
                <br>
            </div>
            <div class="bs-example">
                <table class="table table-bordered">
                    <thead>
                    <tr>
                        <th>No</th>
                        <th>Номер статті</th>
                        <th>Опис</th>
                        <th style="width: 6%"></th>
                    </tr>
                    </thead>
                    <tbody>

                    <c:forEach var="lawEntity" items="${laws}">
                    <tr>
                        <td>${lawEntity.id}</td>
                        <td>${lawEntity.name}</td>
                        <td>${lawEntity.type}</td>
                        <td><form:checkbox path="lawsId" value = "${lawEntity.id}"/></td>
                    </tr>
                    </c:forEach>
                    </tbody>
                </table>

            </div>
            <button class="btn btn-success  btn-sm" type="submit" data-toggle="modal">
                Обрати
            </button>
        </div>
    </div>

</form:form>


<div style="text-align:center;">
    <form:form action="/admin/act/add/step/from3to2" method="get">
        <button class="myButton" type="submit">
            Назад
        </button>
    </form:form>
</div>


</body>
</html>