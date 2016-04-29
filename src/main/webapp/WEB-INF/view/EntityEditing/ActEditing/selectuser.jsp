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
                            <th>Обрати</th>

                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="user" items="${users}">

                            <tr>
                                <td>${user.id}</td>
                                <td>${user.name}</td>
                                <td>${user.surname}</td>
                                <td>${user.secondName}</td>
                                <td>${user.passport.series}</td>
                                <td>${user.passport.number}</td>
                                <td>
                                    <form:form method="get" action="/admin/act/${user.id}/changelaw">
                                        <button class="btn btn-success pull-right btn-sm" type="submit">
                                            Акти
                                        </button>
                                    </form:form>
                                </td>
                            </tr>

                        </c:forEach>
                        </tbody>
                    </table>

                </div>
            </div>

        </div>
    </div>
</div>


</body>
</html>