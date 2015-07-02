<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <body>
        <div class="row">
            <div id="administratorDashboardBody">
                <div class="col-md-4">
                    <form action ="${pageContext.request.contextPath}/postManager"  method="get">
                        <a href="#" onClick="postManger()" class="btn btn-info btn-sm" role="button"  id="postManager">Post Manager</a>         
                    </form>
                </div> 
                <sec:authorize access="hasRole('ROLE_ADMIN')">
                    <div class="col-md-4">
                        <form action ="${pageContext.request.contextPath}/commentApproval"  method="get">
                            <a href="#" onClick="commentManager()" class="btn btn-info btn-sm" role="button"  id="commentApproval">Comment Approval</a>         
                        </form>
                    </div> 
                    <div class="col-md-4">
                        <form action ="${pageContext.request.contextPath}/pageManager"  method="get">
                            <a href="#" onclick="pageManager()"class="btn btn-info btn-sm" role="button"  id="pageManager">Page Manager</a>         
                        </form>
                    </div> 
                </div>
                <br>
                <div class="row">
                    <br>
                    <div class="col-md-4">
                        <form action ="${pageContext.request.contextPath}/userManager"  method="get">
                            <a href="${pageContext.request.contextPath}/userManager" class="btn btn-info btn-sm" role="button"  id="userManager">User Manager</a>         
                        </form>
                    </div> 

                    <div class="col-md-4">
                        <form action ="${pageContext.request.contextPath}/userManager"  method="get">
                            <a href="#" onclick="editCategories(), editTags()" class="btn btn-info btn-sm" role="button"  id="userManager">Edit tags and Post</a>         
                        </form>
                    </div> 
                    <div>
                        <form action ="${pageContext.request.contextPath}/addStaticPagePage"  method="get">
                            <a href="${pageContext.request.contextPath}/addStaticPagePage" class="btn btn-info btn-sm" role="button"  id="addStaticPagePage">Add Static page</a>         
                        </form>
                    </div>    
                </div>
            </sec:authorize>
        </div>


    </div>



</body>
</html>

