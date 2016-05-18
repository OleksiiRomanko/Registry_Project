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
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,600' rel='stylesheet' type='text/css'>
    <link href="" type="text/css" rel="stylesheet">
    <link href="<c:url value="/resources/css/vendor/bootstrap.min.css" />" type="text/css" rel="stylesheet">
    <link href="<c:url value="/resources/css/vendor/font-awesome.min.css" />" type="text/css" rel="stylesheet">
    <link href="<c:url value="/resources/css/style.css" />" type="text/css" rel="stylesheet">
    <link href="<c:url value="/resources/css/bootstrap-theme.min.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/search.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/login.css" />" rel="stylesheet">

</head>

<body>

<script src="<c:url value="/resources/js/jquery.min.js" /> " type="text/javascript"></script>
<script src="<c:url value="/resources/js/bootstrap-datatable.js" />"></script>
<script src="<c:url value="/resources/js/vendor/bootstrap.min.js" />" type="text/javascript"></script>
<script src="<c:url value="/resources/js/vendor/jquery.sortelements.js" />" type="text/javascript"></script>
<script src="<c:url value="/resources/js/jquery.bdt.js" />" type="text/javascript"></script>

<div class="btn-group">

    <form:form action="/admin/tomenu" method="get">
        <button class="btn btn-success pull-right btn-sm" type="submit" data-toggle="modal">
            На головну
        </button>
    </form:form>

</div>

<div style="text-align: center">
    <h1>
        Список корупціонерів
    </h1>
    <br>
    <br>
    <br>
</div>

<p></p>

<div class="container">
    <div class="row">
        <div class="box clearfix">

            <form:form action="" modelAttribute="Criteria" method="post">
                <form:input type="text" path="name" placeholder="Name"/>
                <form:input type="text" path="surname" placeholder="Surname"/>
                <form:input type="text" path="series" placeholder="Series"/>
                <form:input type="number" path="number" placeholder="Number"/>
                <button class="btn-success pull-center " type="submit">Filter</button>
            </form:form>
            <h3>Результуюча таблиця</h3>

            <table class="table table-hover" >
                <thead>
                <tr>
                    <th class="hidden-xs">ID</th>
                    <th>Ім'я</th>
                    <th>Прізвище</th>
                    <th>По батькові</th>
                    <th>Серія</th>
                    <th>Номер паспорту</th>
                    <th>Delete</th>
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
                        <td>
                        <form:form method="post" action="/admin/user/${userEntity.id}/delete">
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
    </div>
</div>
</div>


<%--<script>--%>
    <%--$(document).ready( function () {--%>
        <%--$('#bootstrap-table').bdt();--%>
    <%--});--%>
<%--</script>--%>

</body>
</html>