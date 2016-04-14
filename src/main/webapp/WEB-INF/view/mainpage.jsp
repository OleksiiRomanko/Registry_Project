<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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


</head>

<body>

<script src="<c:url value="/resources/js/jquery.min.js" />"></script>
<script src="<c:url value="/resources/js/admin.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

<button class="btn btn-success pull-right btn-sm" type="button" data-toggle="modal" data-target="#myModal">
    Log in as admin
</button>


<div class="container">
    <div class="row">
        <div class="col-md-6 col-md-offset-3">
            <h1>Введіть анкетні дані потрібної персони</h1>
        </div>
    </div>
    <div class="row">
        <div class="col-md-4 col-md-offset-3">
            <form action="" class="search-form">
                <div class="form-group has-feedback">
                    <label for="search" class="sr-only">Search</label>
                    <input type="text" class="form-control" name="search" id="search"
                           placeholder="Наприклад: Ратошнюк Максим Юрійович">
                    <span class="glyphicon glyphicon-search form-control-feedback"></span>
                </div>
            </form>
        </div>
    </div>
</div>


<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">

            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h4 class="modal-title" id="myModalLabel">Log in</h4>
            </div> <!-- /.modal-header -->

            <div class="modal-body">
                <form role="form">
                    <div class="form-group">
                        <div class="input-group">
                            <input type="text" class="form-control" id="uLogin" placeholder="Login">
                            <label for="uLogin" class="input-group-addon glyphicon glyphicon-user"></label>
                        </div>
                    </div> <!-- /.form-group -->

                    <div class="form-group">
                        <div class="input-group">
                            <input type="password" class="form-control" id="uPassword" placeholder="Password">
                            <label for="uPassword" class="input-group-addon glyphicon glyphicon-lock"></label>
                        </div> <!-- /.input-group -->
                    </div> <!-- /.form-group -->

                    <div class="checkbox">
                        <label>
                            <input type="checkbox"> Remember me
                        </label>
                    </div> <!-- /.checkbox -->
                </form>

            </div> <!-- /.modal-body -->

            <div class="modal-footer">
                <button class="form-control btn btn-primary">Ok</button>

                <div class="progress">
                    <div class="progress-bar progress-bar-primary" role="progressbar" aria-valuenow="1" aria-valuemin="1" aria-valuemax="100" style="width: 0%;">
                        <span class="sr-only">progress</span>
                    </div>
                </div>
            </div> <!-- /.modal-footer -->

        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->

</body>
</html>