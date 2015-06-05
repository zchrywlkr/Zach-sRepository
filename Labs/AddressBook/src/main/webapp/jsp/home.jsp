<<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
            <h1>Address Book</h1>
            <hr>
            <div class="navbar">
                <ul class="nav nav-tabs">
                    <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/home">Home</a></li>
                    <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/ajax">ajax</a></li>
                    
                </ul>    
            </div>

        </div>

        <div class="container">
            <div class="row">
                <div class="col-sm-3"><h2>Addresses</h2></div>
                <div class="col-sm-3"><h2>Search</h2></div>
            </div>


            <br>
            <div class="row">
                <a class="col-sm-3" href="displayAddAddress">Add address</a>


                <form action="${pageContext.request.contextPath}/displaySearchResults"  method="post" >
                    <div class="col-sm-3">
                        <div>
                            <select name ="searchType">
                                <option value="lastName">Last name</option>
                                <option value="city">City</option>
                                <option value="zip">State</option>
                            </select>   

                            <input type="text" name="SearchTerm" value="" size="10px" />

                            <input type="submit" value="Search" name="searchbutton" />
                        </div>
                    </div>
                </form>
            </div>
        </div>
        </hr>
        <br/>
        <c:forEach var="address" items="${addressList}">
            <s:url value="deleteAddress" var ="deleteAddress_url">
                <s:param name="AddressId" value="${address.id}"/>
            </s:url>
            <s:url value="editAddress" var ="editAddress_url">
                <s:param name="AddressId" value="${address.id}"/>
            </s:url>
            Name : ${address.firstName} ${address.lastName} |
            <a href ="${deleteAddress_url}">Delete</a>
            <a href ="${editAddress_url}">Edit</a><br/>
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

