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
<form:form method="post" modelAttribute="LivingPlaceEntity" action="/admin/act/add/step/3">
    <div class="container">
        <div class="row">
            <div class="col-md-6 col-md-offset-3">
                <h2 style="text-align: center">Будь ласка, виберіть із бази даних людину,
                    до якої причетний створюваний
                    кримінальний акт
                </h2>
                <br>
            </div>
            <div class="bs-example">
                <table class="table table-bordered">
                    <thead>
                    <tr>
                        <th>No</th>
                        <th>Прізвище</th>
                        <th>Ім'я</th>
                        <th>По батькові</th>
                        <th>Серія</th>
                        <th>Номер паспорта</th>
                        <th style="width: 6%"></th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>1</td>
                        <td>Ратошнюк</td>
                        <td>Максим</td>
                        <td>Юрійович</td>
                        <td>ВН</td>
                        <td>602507</td>
                        <td>
                            <button class="btn btn-success pull-right btn-sm" type="submit" data-toggle="modal">
                                Обрати
                            </button>
                        </td>
                    </tr>
                    <tr>
                        <td>2</td>
                        <td>Лисогор</td>
                        <td>Дмитро</td>
                        <td>Юрійович</td>
                        <td>ВК</td>
                        <td>122054</td>
                        <td>
                            <button class="btn btn-success pull-right btn-sm" type="submit" data-toggle="modal">
                                Обрати
                            </button>
                        </td>
                    </tr>
                    <tr>
                        <td>3</td>
                        <td>Чепурний</td>
                        <td>Олександр</td>
                        <td>Дмитрович</td>
                        <td>КП</td>
                        <td>422016</td>
                        <td>
                            <button class="btn btn-success pull-right btn-sm" type="submit" data-toggle="modal">
                                Обрати
                            </button>
                        </td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</form:form>


<br>
<div style="text-align:center;">
    <form:form action="/admin/act/add/step/from2to1" method="get">
        <button class="myButton" type="submit">
            Назад
        </button>
    </form:form>
</div>


</body>
</html>