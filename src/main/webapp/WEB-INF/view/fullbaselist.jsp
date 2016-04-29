<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta name="viewport" content="width = device-width, initial-scale = 1">

    <title>Таблиця правопорушників</title>
    <script type="text/javascript" src="jquery-1.3.2.min.js"></script>

    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/bootstrap-theme.min.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/search.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/login.css" />" rel="stylesheet">
    <%--<link href="<c:url value="/resources/css/searchresult.css" />" rel="stylesheet">--%>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css" rel='stylesheet'
          type='text/css'>
    <link href="<c:url value="https://cdn.datatables.net/1.10.11/css/dataTables.bootstrap.min.css" />" rel="stylesheet">
    <link href="<c:url value="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />"
          rel="stylesheet">

</head>

<body>

<script src="<c:url value="/resources/js/jquery.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
<script src="<c:url value="/resources/js/helper.js" />"></script>
<script src="<c:url value="/resources/js/dataTables.bootstrap.min.js" />"></script>
<script src="<c:url value="/resources/js/jquery.dataTables.min.js" />"></script>

<div class="btn-group">

    <form:form action="/admin/tomenu" method="get">
        <button class="btn btn-success pull-right btn-sm" type="submit" data-toggle="modal">
            На головну
        </button>
    </form:form>

</div>

<br>

<br>
<div style="text-align: center">
    <h1>
        Результат пошуку особи
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

        <br>

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
                            <th class="hidden-xs">ID</th>
                            <th>Прізвище</th>
                            <th>Ім'я</th>
                            <th>По батькові</th>
                            <th>Серія</th>
                            <th>Номер паспорту</th>
                        </tr>
                        </thead>
                        <tbody>

                            <c:forEach var="userEntity" items="${allusers}">
                                    <tr>
                                        <td class="hidden-xs">${userEntity.id}</td>
                                        <td>${userEntity.name}</td>
                                        <td>${userEntity.surname}</td>
                                        <td>${userEntity.secondName}</td>
                                        <td>${userEntity.passport.series}</td>
                                        <td>${userEntity.passport.number}</td>
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