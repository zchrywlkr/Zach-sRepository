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
                    <li  role="presentation"><a href="${pageContext.request.contextPath}/index.jsp">Home</a></li>
                    <li role="presentation" id="getStaticPage"><a href="${pageContext.request.contextPath}/getStaticPage">Disclaimer</a></li>
                </ul>    
            </h1>

            <div   class="col-md-9 " id="mainContent" >
                

                <title>Index Page</title>
        <!-- Bootstrap core CSS -->
        <link href="${pageContext.request.contextPath}/css/bootstrap.css" rel="stylesheet">

        <!-- SWC Icon -->
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">
    </head>
    <body >
        <h1>Edit a Post</h1>
        <form method="put" action="SaveChange">
            <h3>Title</h3>
            <div>
            <input type="text" name="titleInput" id="titleInput" value="${post.title}" />
            </div>
            <br>
            <div class="row">
            <div class="col-sm-6">
                <h3>Add Category</h3>
                <button id="addCategory" type="submit">Add Category</button>
                 <input type="text" id="categoryInput" name="categoryInput"  />
            </div>
            <div class="col-sm-6">
                <h3>Category</h3>
                <div id="categories">
                    
                </div>
                
                 
            </div>
                </div>
            <br>
            <div>
                <h3>body</h3>
            <p>   
                <textarea id="elm1" name="area" >${post.body}</textarea>
               
            </p>
            </div>
            
            
            <div >
                <h3>tag</h3>
                <input type="text" name="tagInput" id="tagInput" value="" >
                </input>
            </div>
            <br>
            <div>
                <!--<form action="SaveChange" method="GET" role="form"  >-->
                     <input  type="submit" value="Save" id ="SaveChange"/>
                <!--</form>-->
<!--<a method = "GET" href="SaveChange/${post.postId}">saveChange</a>-->
               
            </div>
        </form>

            </div>

            <div class="col-xs-3" style="background: #5675e6" id="sidenav">
                <ul class="nav nav-tabs nav-stacked" >
                    <li class="login"><a href="${pageContext.request.contextPath}/login">Login</a></li>
                </ul>
                <div class="col-xs-12"><h3>Categories</h3></div>
                <ul class="nav nav-tabs nav-stacked">
                    <li  class="category getCategory"><a href="${pageContext.request.contextPath}/getCategory">Category 1</a></li>
                    <li class="category getCategory"><a href="${pageContext.request.contextPath}/getCategory">Category 2</a></li>
                    <li class="category getCategory"><a href="${pageContext.request.contextPath}/getCategory">Category 3</a></li>
                    <li class="category getCategory"><a href="${pageContext.request.contextPath}/getCategory">Category 4</a></li>
                    <li class="category getCategory"><a href="${pageContext.request.contextPath}/getCategory">Category 5</a></li>
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
                <input type="text"  name="thePostId"id="thePostId" value ="${post.postId}"></div>
       <script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

        <script type="text/javascript" src="${pageContext.request.contextPath}/js/tinymce.min.js"></script>
        
        <script type="text/javascript">
            tinymce.init({
                selector: "textarea#elm1",
                theme: "modern",
                height: 300,
                plugins: [
                    "autolink link image lists charmap print preview hr anchor spellchecker",
                    "searchreplace wordcount visualblocks visualchars code fullscreen insertdatetime media ",
                    "save table contextmenu emoticons paste textcolor fullpage"
                ],
                content_css: "/tinymce/skins/lightgray/content.min.css",
                toolbar: "insertfile undo redo | styleselect | bold italic | alignleft aligncenter alignright alignjustify | bul    list numlist outdent indent | l      ink image | print preview media fullpage | forecolor backcolor emoticons",
                style_formats: [
                    {title: 'Bold text', inline: 'b'},
                    {title: 'Red text', inline: 'span', styles: {color: '#ff0000'}},
                    {title: 'Red header', block: 'h1', styles: {color: '#ff0000'}},
                    {title: 'Example 1', inline: 'span', classes: 'example1'},
                    {title: 'Example 2', inline: 'span', classes: 'example2'},
                    {title: 'Table styles'},
                    {title: 'Table row 1', selector: 'tr', classes: 'tablerow1'}
                ]
            });

        </script>
<script src="${pageContext.request.contextPath}/js/ContentManagment.js"></script>
<script src="${pageContext.request.contextPath}/js/editPage.js"></script>
        
        

    </body>
</html>