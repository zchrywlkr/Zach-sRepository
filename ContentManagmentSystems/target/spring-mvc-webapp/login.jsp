<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
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
                    <li id="home" role="presentation"><a href="${pageContext.request.contextPath}/indexTest.jsp">Home</a></li>


                </ul>    
            </h1>

            <br>
            <div   class="col-md-9 " id="Login" >
                <div class="well">
                    <c:if test="${param.login_error == 1}">
                        <h3>Wrong id or password!</h3>
                    </c:if>


                    <!-- #2 - Post to Spring security to check our authentication -->
                    <form method="post" class="signin" action="${pageContext.request.contextPath}/j_spring_security_check">
                        <fieldset>
                            <table cellspacing="0">
                                <tr>
                                    <th>
                                        <label for="username">Username
                                        </label>
                                    </th>

                                    <td><input id="username_or_email"
                                               name="j_username" 
                                               type="text" /> 
                                    </td>
                                </tr>
                                <tr>
                                    <th><label for="password">Password</label></th>
                                    <!-- #2b - must be j_password for Spring -->
                                    <td><input id="password"
                                               name="j_password" 
                                               type="password" />
                                    </td>
                                </tr>
                                <tr>
                                    <th></th>
                                    <td><input name="commit" type="submit" value="Sign In" /></td>
                                </tr>
                            </table>
                        </fieldset>
                    </form>
                </div>
                
                    <div class="well">
                        <div>
                            <sec:authorize access="hasRole('ROLE_USER')">
                                <form action ="${pageContext.request.contextPath}/newPostPage"  method="get">
                                    <a href="${pageContext.request.contextPath}/addPost" class="btn btn-info btn-sm" role="button"  id="addPost">Add Post</a>         
                                </form>
                            </sec:authorize>
                            <br>
                            <sec:authorize access="hasRole('ROLE_ADMIN')">
                                <form action ="${pageContext.request.contextPath}/addStaticPagePage"  method="get">
                                    <a href="${pageContext.request.contextPath}/addStaticPagePage" class="btn btn-info btn-sm" role="button"  id="addStaticPagePage">Add Static page</a>         
                                </form>
                            </sec:authorize>
                               
                                    <br>
                                    <sec:authorize access="hasRole('ROLE_ADMIN')">
                                        <form action ="${pageContext.request.contextPath}/addStaticPagePage"  method="get">
                                            <a href="#" onclick="displayDashboard()" class="btn btn-info btn-sm" role="button"  id="addStaticPagePage">DashBoard</a>         
                                        </form>
                                    </sec:authorize>
                          
                                        </div>
                                    </div>
                                    
                                    </div>

                                    <div class="col-xs-3" style="background: #5675e6" id="sidenav">
                                        <ul class="nav nav-tabs nav-stacked" >
                                            <li class="login"><a href="${pageContext.request.contextPath}/login">Login</a></li>
                                        </ul>
                                        <div class="col-xs-12"><h3>Categories</h3></div>
                                        <ul class="nav nav-tabs nav-stacked" id = "categoriesByOccurence">
                                            <li  class="category getCategory"><a href="${pageContext.request.contextPath}/getCategory">Category 1</a></li>
                                            <li class="category getCategory"><a href="${pageContext.request.contextPath}/getCategory">Category 2</a></li>
                                            <li class="category getCategory"><a href="${pageContext.request.contextPath}/getCategory">Category 3</a></li>
                                            <li class="category getCategory"><a href="${pageContext.request.contextPath}/getCategory">Category 4</a></li>
                                            <li class="category getCategory"><a href="${pageContext.request.contextPath}/getCategory">Category 5</a></li>
                                            <br/>
                                        </ul>
                                        <div class="col-xs-12"><h3>Tags</h3></div>

                                        <ul class="nav nav-tabs nav-stacked" id="tagsByOccurence">
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
                                <script src="${pageContext.request.contextPath}/js/EditTest.js"></script>
                                <script src="${pageContext.request.contextPath}/js/jquery.loadTemplate-1.4.4.js"></script>
                                <script src="${pageContext.request.contextPath}/js/index.js"></script>
                                <script src="${pageContext.request.contextPath}/js/jsrender.js"></script>
                                <script src="${pageContext.request.contextPath}/js/comment.js"></script>



                            </body>
                        </html>

