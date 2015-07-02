<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head style="background-color: orange">
        <title>Index Page</title>
        <!-- Bootstrap core CSS -->
        <link href="${pageContext.request.contextPath}/css/bootstrap.css" rel="stylesheet">

        <!-- SWC Icon -->
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">
    </head>
    <body >
        <h1>Add a Post</h1>
        <form method="post" action="post">
            <h3>Title</h3>
            <div>
            <input type="text" name="titleInput" id="titleInput" value="" />
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
                <textarea id="elm1" name="area" ></textarea>
               
            </p>
            </div>
            
            
            <div >
                <h3>tag</h3>
                 <input type="text" name="tagInput" id="tagInput" />
            </div>
            <br>
            <div>
                <input type="submit" value="Save" id ="addAPost"/>
            </div>
        </form>


        <!-- OF COURSE YOU NEED TO ADAPT NEXT LINE TO YOUR tiny_mce.js PATH -->
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
                toolbar: "insertfile undo redo | styleselect | bold italic | alignleft aligncenter alignright alignjustify | bullist numlist outdent indent | l      ink image | print preview media fullpage | forecolor backcolor emoticons",
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

    </body>
</html>