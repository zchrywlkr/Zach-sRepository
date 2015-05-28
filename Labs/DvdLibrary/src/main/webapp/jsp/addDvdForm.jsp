<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Company Contacts</title>
        <!-- Bootstrap core CSS -->
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">

        <!-- SWC Icon -->
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">
    </head>
    <body>
        <div class="container">
            <h1>Add dvd</h1>
            <hr/>

            <h2>Dvd info</h2>
        </div>
        <div class="container"><a href="${pageContext.request.contextPath}/home">Home</a></div>
        <div class="container">
            <sf:form role="form" class="form-horizontal" action="saveDvd" method="POST" modelAttribute="dvd">
                <div class="form-group">
                    <label for="add-title" class="col-md-4 control-label">Title</label>
                    <div class="col-md-8">
                        <sf:input type="text" class="form-control" id="add-title" path="title" placeholder="title"/>
                        <sf:errors path="title" cssClass="error"/>
                    </div>
                </div>
                
                <div class="form-group">
                    <label for="add-mpaaRating" class="col-md-4 control-label">mpaaRating</label>
                    <div class="col-md-8">
                        <sf:input type="text" class="form-control" id="add-mpaaRating" path="mpaaRating" placeholder="mpaaRating"/>
                        <sf:errors path="mpaaRating" cssClass="error"/>
                    </div>
                </div>
                
                
                
                <div class="form-group">
                    <label for="add-director" class="col-md-4 control-label">director</label>
                    <div class="col-md-8">
                        <sf:input type="text" class="form-control" id="add-director" path="director" placeholder="director"/>
                        <sf:errors path="director" cssClass="error"/>
                    </div>
                </div>
                
                <div class="form-group">
                    <label for="add-studio" class="col-md-4 control-label">studio</label>
                    <div class="col-md-8">
                        <sf:input type="text" class="form-control" id="add-studio" path="studio" placeholder="studio"/>
                         <sf:errors path="studio" cssClass="error"/>
                    </div>
                </div>
                
                <div class="form-group">
                    <label for="add-note" class="col-md-4 control-label">note</label>
                    <div class="col-md-8">
                        <sf:input type="text" class="form-control" id="add-note" path="note" placeholder="note"/>
                        <sf:hidden path="id"/>
                    </div>
                </div>
                
                <div class="form-group">
                    <label for="add-releaseDate" class="col-md-4 control-label">releaseDate</label>
                    <div class="col-md-8">
                        <sf:input type="text" class="form-control" id="releaseDate" path="releaseDate" placeholder="releaseDate"/>
                        <sf:errors path="releaseDate" cssClass="error"/>
                    </div>
                </div>
                 
                <div class="form-group">
                    <div class="col-md-offset-4 col-md-8">
                        <button type="submit" id="add-button" class="btn btn-default">Add Dvd</button>
                    </div>
                </div>
            </sf:form>
        </div>
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

    </body>
</html>

