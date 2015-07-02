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
          <form method="put" action="saveChangePage">
              <input type="hidden" id="pageId" value="${page.id}"/>
              <input type="hidden" id="indexNumber" value="${page.index}"/>
            <h3>Title</h3>
            <div>
            <input type="text" name="PagetitleInput" id="titleInput" value="${page.title}" />
            </div>
            <br>
            <div class="row">
            
            <div class="col-sm-6">
               
            </div>
                </div>
            <br>
            <div>
                <h3>body</h3>
            <p>   
                <textarea id="elm1" name="area" >${page.body}</textarea>
               
            </p>
            </div>
            
            <br>
            <div>
                <input type="submit" value="Save" id="saveStaticPage"/>
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
<script src="${pageContext.request.contextPath}/js/staticPage.js"></script>


    </body>
</html>

