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
                    <a class="col-sm-2" href="displayAddDvd">Add dvd</a>
                    <form action="${pageContext.request.contextPath}/displaySearchResults"  method="post" >
                     <select name ="searchType">
                    <option value="Title">Title</option>
                    <option value="rating">Rating</option>
                    <option value="Studio">Studio</option>
                    <input type="text" name="SearchTerm" value="" size="10px" />
                    </select>
                      <input type="submit" value="Search" name="searchbutton" />
                    </form>
                    </hr>
                    <br/>
                    <c:forEach var="dvd" items="${dvdList}">
                        <s:url value="deleteDvd" var ="deleteDvd_url">
                            <s:param name="dvdId" value="${dvd.id}"/>
                        </s:url>
                        <s:url value="editDvd" var ="editDvd_url">
                            <s:param name="dvdId" value="${dvd.id}"/>
                        </s:url>
                        Title : ${dvd.title} ${contact.lastName} |
                        <a href ="${deleteDvd_url}">Delete</a>
                        <a href ="${editDvd_url}">Edit</a><br/>
                        releaseDate ${dvd.releaseDate}<br/>
                        mpaaRating :${dvd.mpaaRating} <br/>
                        director ${dvd.director} <br/>
                        studio ${dvd.studio} <br/>
                        note ${dvd.note} <br/>
                        <br>
                    </c:forEach>
                </div>
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    </body>
</html>

