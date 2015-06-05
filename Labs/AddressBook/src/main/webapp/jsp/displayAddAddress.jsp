<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Address Book</title>
        <!-- Bootstrap core CSS -->
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">

        <!-- SWC Icon -->
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">
    </head>
    <body>
        <div class="container">
            <h1>Add address</h1>
            <hr/>

            <h2>address info</h2>
        </div>
        <div class="container"><a href="${pageContext.request.contextPath}/home">Home</a></div>
        <div class="container">
            <sf:form role="form" class="form-horizontal" action="saveAddress" method="POST" modelAttribute="address">
                <div class="form-group">
                    <label for="add-firstName" class="col-md-4 control-label">First Name:</label>
                    <div class="col-md-8">
                        <sf:input type="text" class="form-control" id="add-firstName" path="firstName" placeholder="firstName"/>
                        <sf:errors path="firstName" cssClass="error"/>
                    </div>
                </div>
                
                <div class="form-group">
                    <label for="add-lastName" class="col-md-4 control-label">Last Name</label>
                    <div class="col-md-8">
                        <sf:input type="text" class="form-control" id="add-lastName" path="lastName" placeholder="lastName"/>
                        <sf:errors path="lastName" cssClass="error"/>
                    </div>
                </div>
                
                
                
                <div class="form-group">
                    <label for="add-street" class="col-md-4 control-label">street</label>
                    <div class="col-md-8">
                        <sf:input type="text" class="form-control" id="add-street" path="street" placeholder="street"/>
                        <sf:errors path="street" cssClass="error"/>
                    </div>
                </div>
                
                <div class="form-group">
                    <label for="add-city" class="col-md-4 control-label">City</label>
                    <div class="col-md-8">
                        <sf:input type="text" class="form-control" id="add-city" path="city" placeholder="city"/>
                         <sf:errors path="city" cssClass="error"/>
                    </div>
                </div>
                
                <div class="form-group">
                    <label for="add-state" class="col-md-4 control-label">State</label>
                    <div class="col-md-8">
                        <sf:input type="text" class="form-control" id="add-state" path="state" placeholder="state"/>
                        <sf:errors path="state" cssClass="error"/>
                        <sf:hidden path="id"/>
                    </div>
                </div>
                
                <div class="form-group">
                    <label for="add-zip" class="col-md-4 control-label">zip</label>
                    <div class="col-md-8">
                        <sf:input type="text" class="form-control" id="zipCode" path="zipCode" placeholder="zipCode"/>
                        <sf:errors path="zipCode" cssClass="error"/>
                    </div>
                </div>
                 
                <div class="form-group">
                    <div class="col-md-offset-4 col-md-8">
                        <button type="submit" id="add-button" class="btn btn-default">Add address</button>
                    </div>
                </div>
            </sf:form>
        </div>
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

    </body>
</html>

