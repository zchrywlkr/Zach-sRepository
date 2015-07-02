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

                
                    <div class="well  postItem">
                        <h3  id="thePostTitle" class="postTitle"><a href="${pageContext.request.contextPath}/getPost"></a></h3>
                        <div>
                            <a href="${pageContext.request.contextPath}/getDate">Date</a>  &nbsp;&nbsp;&nbsp;&nbsp;
                            <a href="${pageContext.request.contextPath}/getAuthor">Author </a>  &nbsp;&nbsp;&nbsp;&nbsp;
                        </div>     
                        <br>
                        <div class="row">
                            <div class="postCategory col-md-4">Categories: <a href="${pageContext.request.contextPath}/getCategory"></a></div>                                                                  
                            <div class="col-md-1"></div>
                            <div class="postTag col-md-4">Tags: <a href="${pageContext.request.contextPath}/getTag"></a></div>
                        </div>
                        <br>
                        <div class="postSummary">
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
                                <a class="edit" href="${pageContext.request.contextPath}/editPost" class="btn btn-info btn-sm col-md-2" role="button">Edit Post</a> 
                                <div class="col-md-1"></div>
                                <a href="${pageContext.request.contextPath}/index.jsp" class="btn btn-info btn-sm col-md-2" role="button">Delete Post</a> 
                                <div class="col-md-2"></div>
                                <button class="togglePublishUnpublish btn btn-danger btn-sm col-md-2" type="submit" >Publish</button>
                            </form>
                        </div>
                        <br>                        
                    </div>
               
            
        
            
           

        
        <script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/ContentManagment.js"></script>

    </body>
</html>
