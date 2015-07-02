<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head style="background-color: orange">
        <title>User Manager</title>
        <link href="${pageContext.request.contextPath}/css/bootstrap.css" rel="stylesheet">
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">
    </head>
    <body>
        <div class="container-fluid">  
            <nav id="topnav" class="nav nav-tabs navbar-fixed-top" style="background-color: orange; border-top-style: solid; border-top-color:blue; border-top-width: 5px">
                <li role="presentation"><a href="${pageContext.request.contextPath}/index.jsp" style="font-size:small">Home</a></li>
                <li role="presentation"><a href="${pageContext.request.contextPath}/getStaticPage" style="font-size:small">Disclaimer</a></li>
                <li role="presentation"><a href="${pageContext.request.contextPath}/administratorDashboard" style="font-size:small">Administrator Dashboard</a></li>
            </nav>
            <div class="row">
                <br>
                <br>
                <div class="col-md-10">           
                    <h2 class="blogTitle">Blog Title</h2>
                    <h4 class=blogTagline">Blog tagline</h4>
                    <h3 class="pageTitle">User Manager</h3>
                    <br>
                    <div id="userManagerBody">

                    </div>
                </div>
                <div class="col-md-2">
                    <nav class="nav nav-pills-justified" align="center" style="background-color: #5675e6; border-left-color: white; border-left-style:double; border-left-width:5px" id="sidenav">
                        <li class="login" style="font-weight: bold;"><a href="${pageContext.request.contextPath}/login">Login</a></li>
                        <hr/>
                        <li><h3 style="color: #a6e1ec">Categories</h3></li>
                        <li class="category"><a href="${pageContext.request.contextPath}/getCategory">Category 1</a></li>
                        <li class="category"><a href="${pageContext.request.contextPath}/getCategory">Category 2</a></li>
                        <li class="category"><a href="${pageContext.request.contextPath}/getCategory">Category 3</a></li>
                        <li class="category"><a href="${pageContext.request.contextPath}/getCategory">Category 4</a></li>
                        <li class="category"><a href="${pageContext.request.contextPath}/getCategory">Category 5</a></li>                    
                        <hr/>
                        <li><h3 style="color: #a6e1ec">Tags</h3></li>                    
                        <li class="tag"><a href="${pageContext.request.contextPath}/getTag">Tag 1</a></li>
                        <li class="tag"><a href="${pageContext.request.contextPath}/getTag">Tag 2</a></li>
                        <li class="tag"><a href="${pageContext.request.contextPath}/getTag">Tag 3</a></li>
                        <li class="tag"><a href="${pageContext.request.contextPath}/getTag">Tag 4</a></li>
                        <li class="tag"><a href="${pageContext.request.contextPath}/getTag">Tag 5</a></li>                     
                    </nav>   
                </div>
            </div>
            <div style="background-color: #5bc0de"class="col-sm-12"id="footer">Copyright@2015 Blog Title</div>
        </div>
        <script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/ContentManagment.js"></script>
    </body>
</html>