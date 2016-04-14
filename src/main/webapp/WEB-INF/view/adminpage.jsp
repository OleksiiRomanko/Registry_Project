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
<button class="btn btn-success pull-right btn-sm" type="button" data-toggle="modal" data-target="#myModal">
    Log out
</button>
<h1>You have logged in as an administrator, so you can modify data base</h1>
<h1></h1>
<div style="text-align:center;">
    <button class="myButton" type="button">
        Add user
    </button>
    <h1></h1>
    <button class="myButton" type="button">
        Add act
    </button>
    <h1></h1>
    <button class="myButton" type="button">
        Add law
    </button>
    <h1></h1>
    <button class="myButton" type="button">
        Find user
    </button>
    <h1></h1>
    <button class="myButton" type="button">
        Find act
    </button>
</div>


</body>
</html>