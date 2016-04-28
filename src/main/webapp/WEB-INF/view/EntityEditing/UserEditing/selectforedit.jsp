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
    <%--<link href="<c:url value="/resources/css/searchresult.css" />" rel="stylesheet">--%>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css" rel='stylesheet'
          type='text/css'>


</head>

<body>

<script src="<c:url value="/resources/js/jquery.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

<div class="btn-group">
    <form action="/logout">
        <button class="btn btn-success pull-right btn-sm" type="submit" data-toggle="modal">
            Покинути кабінет Адміністратора
        </button>
    </form>

</div>

<br>

<br>
<div style="text-align: center">
    <h1>
        Редагування персональних даних
    </h1>
    <br>
    <br>
    <br>
    <br>
    <br>
</div>

<%--<div class="container">--%>
<%--<div class="row">--%>
<%--<div class="col-md-6 col-md-offset-3">--%>
<%--<h2 style="text-align: center">Будь ласка, виберіть із бази даних людину,--%>
<%--до якої причетний створюваний--%>
<%--кримінальний акт--%>
<%--</h2>--%>
<%--<br>--%>
<%--</div>--%>
<%--<div class="bs-example">--%>
<%--<table class="table table-bordered">--%>
<%--<thead>--%>
<%--<tr>--%>
<%--<th>No</th>--%>
<%--<th>Прізвище</th>--%>
<%--<th>Ім'я</th>--%>
<%--<th>По батькові</th>--%>
<%--<th>Серія</th>--%>
<%--<th>Номер паспорта</th>--%>
<%--<th style="width: 6%"></th>--%>
<%--<th style="width: 6%"></th>--%>
<%--</tr>--%>
<%--</thead>--%>
<%--<tbody>--%>
<%--<tr>--%>
<%--<td>1</td>--%>
<%--<td>Ратошнюк</td>--%>
<%--<td>Максим</td>--%>
<%--<td>Юрійович</td>--%>
<%--<td>ВН</td>--%>
<%--<td>602507</td>--%>
<%--<td>--%>
<%--<button class="btn btn-success pull-right btn-sm" type="submit" data-toggle="modal">--%>
<%--Редагувати--%>
<%--</button>--%>
<%--</td>--%>
<%--<td>--%>
<%--<button class="btn btn-success pull-right btn-sm" type="submit" data-toggle="modal">--%>
<%--Видалити--%>
<%--</button>--%>
<%--</td>--%>
<%--</tr>--%>
<%--<tr>--%>
<%--<td>2</td>--%>
<%--<td>Лисогор</td>--%>
<%--<td>Дмитро</td>--%>
<%--<td>Юрійович</td>--%>
<%--<td>ВК</td>--%>
<%--<td>122054</td>--%>
<%--<td>--%>
<%--<button class="btn btn-success pull-right btn-sm" type="submit" data-toggle="modal">--%>
<%--Редагувати--%>
<%--</button>--%>
<%--</td>--%>
<%--<td>--%>
<%--<button class="btn btn-success pull-right btn-sm" type="submit" data-toggle="modal">--%>
<%--Видалити--%>
<%--</button>--%>
<%--</td>--%>
<%--</tr>--%>
<%--<tr>--%>
<%--<td>3</td>--%>
<%--<td>Чепурний</td>--%>
<%--<td>Олександр</td>--%>
<%--<td>Дмитрович</td>--%>
<%--<td>КП</td>--%>
<%--<td>422016</td>--%>
<%--<td>--%>
<%--<button class="btn btn-success pull-right btn-sm" type="submit" data-toggle="modal">--%>
<%--Редагувати--%>
<%--</button>--%>
<%--</td>--%>
<%--<td>--%>
<%--<button class="btn btn-success pull-right btn-sm" type="submit" data-toggle="modal">--%>
<%--Видалити--%>
<%--</button>--%>
<%--</td>--%>
<%--</tr>--%>
<%--</tbody>--%>
<%--</table>--%>
<%--</div>--%>
<%--</div>--%>
<%--</div>--%>


<div class="container">
    <div class="row">

        <p></p>
        <h1> Результуюча таблиця Вашого запиту</h1>
        <div class="col-md-12 col-md-offset-0">

            <div class="panel panel-default panel-table">
                <div class="panel-heading">
                    <div class="row">
                        <div class="col col-xs-6">
                            <h3 class="panel-title">Panel Heading</h3>
                        </div>
                        <div class="col col-xs-6 text-right">
                            <form:form action="/admin/user/add/step/1" method="get">
                                <button type="submit"
                                        class="btn btn-sm btn-primary btn-create">
                                    Додати нового порушника
                                </button>
                            </form:form>

                        </div>
                    </div>
                </div>
                <div class="panel-body">
                    <table class="table table-striped table-bordered table-list">
                        <thead>
                        <tr>
                            <th><em class="fa fa-cog"></em></th>
                            <th>Прізвище</th>
                            <th>Ім'я</th>
                            <th>По батькові</th>
                            <th>Серія</th>
                            <th>Номер паспорту</th>
                            <th>Редагувати</th>
                            <th>Видалити</th>

                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="user" items="${users}">

                                <tr>
                                    <td>1</td>
                                    <td>${user.name}</td>
                                    <td>${user.surname}</td>
                                    <td>${user.secondName}</td>
                                    <td>${user.passport.series}</td>
                                    <td>${user.passport.number}</td>
                                    <td>
                                    <form:form method="get" action="/admin/user/${user.id}/edit/info">
                                        <button class="btn btn-success pull-right btn-sm" type="submit">
                                            Редагувати
                                        </button>
                                    </form:form>
                                    </td>
                                    <td>
                                        <form:form method="post" action="/admin/user/${user.id}/delete">
                                            <button class="btn btn-success pull-right btn-sm" type="submit">
                                                Видалити
                                            </button>
                                        </form:form>
                                    </td>
                                </tr>


                        </c:forEach>


                        </tbody>
                    </table>

                </div>
                <div class="panel-footer">
                    <div class="row">
                        <div class="col col-xs-4">Page 1 of 5
                        </div>
                        <div class="col col-xs-8">
                            <ul class="pagination hidden-xs pull-right">
                                <li><a href="#">1</a></li>
                                <li><a href="#">2</a></li>
                                <li><a href="#">3</a></li>
                                <li><a href="#">4</a></li>
                                <li><a href="#">5</a></li>
                            </ul>
                            <ul class="pagination visible-xs pull-right">
                                <li><a href="#">«</a></li>
                                <li><a href="#">»</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>

        </div>
    </div>
</div>


</body>
</html>