<%-- 
    Document   : login
    Created on : Jun 9, 2015, 12:35:14 PM
    Author     : apprentice
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>RedBox</h1></br>
        <h1>login</h1>
        <div class="container">
            <form action="${pageContext.request.contextPath}/login"  method="post" >

                <input  type="text" id="email" name="email" value="" size="10px" />
                <br/><br/>
                <input  type="text" id ="password"name="password" value="" size="10px" />
                <br/>
                <br/>
                <input type="submit" value="enter" name="loginButton" id="loginButton"/>
            </form>
        </div>
        <script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/login.js"></script>
    </body>
</html>
