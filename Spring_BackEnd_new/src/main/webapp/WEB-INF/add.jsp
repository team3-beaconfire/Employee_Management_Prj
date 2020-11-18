<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
            integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
            integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
            crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
            integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
            crossorigin="anonymous"></script>
    <title>Home</title>
</head>

<body>

<form:form method="POST" action="/add" modelAttribute="newBook">
    <div class="form-group">
        <!--<label for="nameInput">Name</label>-->
        <p>Name</p>
        <form:input path="name" cssClass="form-control" id="nameInput"></form:input>
    </div>
    <div class="form-group">
        <!--<label for="messageInput">Author</label> -->
        <p>Author</p>
        <form:input path="author" cssClass="form-control" id="messageInput"></form:input>
    </div>
    <div class="form-group">
        <!--<label for="messageInput">PublishDate</label>-->
        <p>PublishDate</p>
        <form:input path="publishDate" cssClass="form-control" id="messageInput"></form:input>
    </div>

    <button type="submit" class="btn btn-primary">Add</button>
</form:form>

</body>