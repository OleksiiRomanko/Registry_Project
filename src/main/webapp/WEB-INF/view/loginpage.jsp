<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 14.04.2016
  Time: 17:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/bootstrap-theme.min.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/search.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/login.css" />" rel="stylesheet">


</head>
<body>


<%

    String error = (String) request.getAttribute("error");

%>
<div class="col-lg-12 col-lg-offset-4">
    <div class="modal-body" style="width: 33%;">
        <spring:url value="/login" var="loginUrl"/>
        <form:form role="form" action="${loginUrl}" method="post">

            <h3 style="text-align: center">
                Будь ласка, введіть коректні дані для доступу до бази даних:
            </h3>
            <div class="form-group">
                <div class="input-group">
                    <input type="text" class="form-control" id="j_username" name="j_username" placeholder="Login">
                    <label for="j_username" class="input-group-addon glyphicon glyphicon-user"></label>
                </div>
            </div>
            <!-- /.form-group -->

            <div class="form-group">
                <div class="input-group">
                    <input type="password" class="form-control" id="j_password" name="j_password"
                           placeholder="Password">
                    <label for="j_password" class="input-group-addon glyphicon glyphicon-lock"></label>
                </div> <!-- /.input-group -->
            </div>
            <!-- /.form-group -->

            <div class="checkbox">
                <label>
                    <input type="checkbox" name="_spring_security_remember_me"> Remember me
                </label>
            </div>
            <!-- /.checkbox -->

            <div class="modal-footer">
                <button class="form-control btn btn-primary" type="submit">Ok</button>


            </div>
            <!-- /.modal-footer -->

        </form:form>

    </div> <!-- /.modal-body -->

</div>

<div>

    <%
        if (error != null) {
    %>
        <div class="col-lg-12 col-lg-offset-4" style="width: 33%;">
            <h4 style="background: #f2dede">
                Помилка авторизації! Неправильно введений логін чи пароль.
            </h4>
        </div>



    <%
        }


    %>
</div>

</body>
</html>
