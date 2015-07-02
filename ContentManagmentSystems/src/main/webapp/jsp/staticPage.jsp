<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Index Page</title>
        <!-- Bootstrap core CSS -->
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">

        <!-- SWC Icon -->
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">

    </head>
    <body>
        <div class="container">
            <h1> 
                <div class="navbar" style="background-color: orange">
                    <ul class="nav nav-tabs">
                        <li role="presentation"><a href="${pageContext.request.contextPath}/index.jsp">Home</a></li>
                        <li role="presentation"><a href="${pageContext.request.contextPath}/hello/sayhi">Disclaimer</a></li>
                        <li role="presentation"><a href="${pageContext.request.contextPath}/hello/sayhi">About us</a></li>
                    </ul>    
                </div>
            </h1>
            <hr/>

            <div class="col-md-9">
                <h2>Best Group Ever</h2>
                <h4>100% Awesome all the time</h4>
                <hr> 
            </div>
               
            <div class="col-md-9">
                <h1>Title</h1>
                <p class="content">
                    orem ipsum dolor sit amet, consectetur adipiscing elit. 
                    Quodsi vultum tibi, si incessum fingeres, quo gravior viderere, 
                    non esses tui similis; Etsi ea quidem, quae adhuc dixisti, 
                    quamvis ad aetatem recte isto modo dicerentur. Hos contra 
                    dsad asdfas dasd........more </p>
            </div>
            <div class="col-sm-3">

            </div>


            <div style="background-color: #5bc0de"class="col-sm-12"id="footer">Copyright@2015 Best Group Ever</div>

        </div>
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/ContentManagment.js"></script>

    </body>
</html>