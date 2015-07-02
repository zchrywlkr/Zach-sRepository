<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head style="background-color: orange">
        <title>Tag</title>
        <link href="${pageContext.request.contextPath}/css/bootstrap.css" rel="stylesheet">
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">
    </head>
    <body >
        <div class="container " >
            <h1> 
                <ul id="topnav" class="nav nav-tabs" style="background-color: orange; border-bottom: 0px" >
                    <li role="presentation"><a href="${pageContext.request.contextPath}/index.jsp">Home</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/getStaticPage">Disclaimer</a></li>
                </ul>    
            </h1>

            <div   class="col-md-9 " >
                <h2 class="blogTitle">Blog Title</h2>
                <h4 class=blogTagline">Blog tagline</h4>
                <h3 class="pageTitle">Posts By Tag</h3>
                <br>
                <div class="col-md-5"></div>
                <div class="col-md-1">
                    <form action ="${pageContext.request.contextPath}/newPostPage"  method="get">
                        <a href="${pageContext.request.contextPath}/addPost" class="btn btn-info btn-sm" role="button">Add Post</a>         
                    </form>
                </div>
                <div class="col-md-3"></div>
                <br>
                <div id="postList">
                    <div class="post-well">
                        <h3 id="titleId" class="postTitle"><a href="${pageContext.request.contextPath}/getPost">Post Title 1 By Tag</a></h3>
                        <div>
                            <a href="${pageContext.request.contextPath}/getDate">Date</a>  &nbsp;&nbsp;&nbsp;&nbsp;
                            <a href="${pageContext.request.contextPath}/getAuthor">Author </a>  &nbsp;&nbsp;&nbsp;&nbsp;
                        </div>     
                        <br>
                        <div class="row">
                            <div class="postCategory col-md-4">Categories: <a href="${pageContext.request.contextPath}/getCategory">categoryX, categoryY</a></div>                                                                  
                            <div class="col-md-1"></div>
                            <div class="postTag col-md-4">Tags: <a href="${pageContext.request.contextPath}/getTag">tagX, tagY</a></div>
                        </div>
                        <br>
                        <div class="postSummary">
                            Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
                            Quodsi vultum tibi, si incessum fingeres, quo gravior viderere, 
                            non esses tui similis; Etsi ea quidem, quae adhuc dixisti, 
                            quamvis ad aetatem recte isto modo dicerentur. Hos contra 
                            dsad asdfas dasd 
                            <a href="${pageContext.request.contextPath}/getPostSummary"></a>                              
                        </div>                 
                        <br>
                        <div class="row">                            
                            <div class="numPostComments col-md-2"<a href="${pageContext.request.contextPath}/getNumPostComments">3 comments</a> </div>
                            <div class="col-md-5"></div>                                 
                            <div class="postShowMore col-md-2"><a href="${pageContext.request.contextPath}/postShowMore">Show More...</a> </div>
                        </div>
                        <br>
                        <div class="row">
                            <form>
                                <a href="${pageContext.request.contextPath}/editPost" class="btn btn-info btn-sm col-md-2" role="button">Edit Post</a> 
                                <div class="col-md-1"></div>
                                <a href="${pageContext.request.contextPath}/index.jsp" class="btn btn-info btn-sm col-md-2" role="button">Delete Post</a> 
                                <div class="col-md-2"></div>
                                <button class="togglePublishUnpublish btn btn-danger btn-sm col-md-2" type="submit" >Publish</button>
                            </form>
                        </div>
                        <br>                        
                    </div>
                </div>
            </div>

            <div class="col-xs-3" style="background: #5675e6" id="sidenav">
                <ul class="nav nav-tabs nav-stacked" >
                    <li class="login"><a href="${pageContext.request.contextPath}/login">Login</a></li>
                </ul>
                <div class="col-xs-12"><h3>Categories</h3></div>
                <ul class="nav nav-tabs nav-stacked">
                    <li class="category"><a href="${pageContext.request.contextPath}/getCategory">Category 1</a></li>
                    <li class="category"><a href="${pageContext.request.contextPath}/getCategory">Category 2</a></li>
                    <li class="category"><a href="${pageContext.request.contextPath}/getCategory">Category 3</a></li>
                    <li class="category"><a href="${pageContext.request.contextPath}/getCategory">Category 4</a></li>
                    <li class="category"><a href="${pageContext.request.contextPath}/getCategory">Category 5</a></li>
                    <br/>
                </ul>
                <div class="col-xs-12"><h3>Tags</h3></div>

                <ul class="nav nav-tabs nav-stacked">
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

    </body>
</html>
