<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head style="background-color: orange">
        <title>Home Page</title>
        <link href="${pageContext.request.contextPath}/css/bootstrap.css" rel="stylesheet">
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">
    </head>
    <body >
        <div class="container " >
            <h1> 
                <ul id="topnav" class="nav nav-tabs" style="background-color: orange; border-bottom: 0px" >
                    <li id="home" role="presentation"><a href="${pageContext.request.contextPath}/indexTest.jsp">Home</a></li>
                    
                    
                </ul>    
            </h1>

            <div   class="col-md-9 " id="mainContent" >
                <h2 class="blogTitle">Blog Title</h2>
                <h4 class=blogTagline">Blog tagline</h4>
                <h3 class="pageTitle">Home</h3>
                <br>
                
                   
               

            <div class="col-xs-3" style="background: #5675e6" id="sidenav">
                <ul class="nav nav-tabs nav-stacked" >
                    <li class="login"><a href="${pageContext.request.contextPath}/login">Login</a></li>
                </ul>
                <div class="col-xs-12"><h3>Categories</h3></div>
                <ul class="nav nav-tabs nav-stacked" id = "categoriesByOccurence">
                    <li  class="category getCategory"><a href="${pageContext.request.contextPath}/getCategory">Category 1</a></li>
                    <li class="category getCategory"><a href="${pageContext.request.contextPath}/getCategory">Category 2</a></li>
                    <li class="category getCategory"><a href="${pageContext.request.contextPath}/getCategory">Category 3</a></li>
                    <li class="category getCategory"><a href="${pageContext.request.contextPath}/getCategory">Category 4</a></li>
                    <li class="category getCategory"><a href="${pageContext.request.contextPath}/getCategory">Category 5</a></li>
                    <br/>
                </ul>
                <div class="col-xs-12"><h3>Tags</h3></div>

                <ul class="nav nav-tabs nav-stacked" id="tagsByOccurence">
                    <li class="tag"><a href="${pageContext.request.contextPath}/getTag">Tag 1</a></li>
                    <li class="tag"><a href="${pageContext.request.contextPath}/getTag">Tag 2</a></li>
                    <li class="tag"><a href="${pageContext.request.contextPath}/getTag">Tag 3</a></li>
                    <li class="tag"><a href="${pageContext.request.contextPath}/getTag">Tag 4</a></li>
                    <li class="tag"><a href="${pageContext.request.contextPath}/getTag">Tag 5</a></li>
                </ul>               
            </div>
            <div style="background-color: #5bc0de"class="col-sm-12"id="footer">Copyright@2015 Blog Title</div>
            
            
           

        </div>
        <script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
        
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/ContentManagment.js"></script>
        <script src="${pageContext.request.contextPath}/js/EditTest.js"></script>
        <script src="${pageContext.request.contextPath}/js/jquery.loadTemplate-1.4.4.js"></script>
        <script src="${pageContext.request.contextPath}/js/index.js"></script>
        
        

    </body>
</html>

