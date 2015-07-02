<%-- 
    Document   : testCommentPage
    Created on : Jun 24, 2015, 1:41:48 PM
    Author     : apprentice
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="${pageContext.request.contextPath}/css/bootstrap.css" rel="stylesheet">
    </head>
    <body>
        <div class="container">
            <div class="row" id="addCommentRow">
                <button class="addCommentBtn btn btn-success">Add Comment</button>
            </div>
            <div id="addCommentWindow"></div>
            <div class="row"></div>
            <br/>
            <div class="row"></div>
            <div class="row" id="commentRow">


            </div>
        </div>
        <script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/jquery.loadTemplate-1.4.4.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/ContentManagment.js"></script>
        <script src="${pageContext.request.contextPath}/js/commen.js"></script>
    </body>
</html>
