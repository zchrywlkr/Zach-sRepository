<<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Dvd Library</title>
        <!-- Bootstrap core CSS -->
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">

        <!-- SWC Icon -->
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">

    </head>
    <body>
        <div class="container">
            <h1>Dvd library</h1>
            <hr>
            <div class="navbar">
                 <ul class="nav nav-tabs">
                 <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/home">Home</a></li>
                </ul>    
            </div>
            <h2>Dvd library</h2>
        </div>
                
                <div class="container">
                    <a href="home">home</a>
                    </hr>
                    <br/>
                  <c:forEach var="address" items="${addressList}">
                        
                        Name : ${address.firstName} ${address.lastName} |
                        street ${address.street}<br/>
                        city ${address.city} <br/>
                        state ${address.state} <br/>
                        zip Code: ${address.zipCode} <br/>
                        
                        <br>
                    </c:forEach>
                </div>
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    </body>
</html>

