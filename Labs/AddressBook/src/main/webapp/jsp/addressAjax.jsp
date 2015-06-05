<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Address book</title>
        <!-- Bootstrap core CSS -->
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">

        <!-- SWC Icon -->
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">

    </head>
    <body>
        <div class="container">
            <h1>Home</h1>
            <hr>
            <div class="navbar">
                <ul class="nav nav-tabs">
                    <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/home">Home</a></li>
                   
                </ul>    
            </div>
            <div class="row">
                <div class="col-md-6">
                    <h2>Addresses</h2>
                    <table id="ContactTable" class="table table-hover">
                        <tr>
                            <th width="40%">
                                Contact name
                            </th>
                            <th withd="30%">
                                State
                            </th>
                            <th width="15%">

                            </th>
                            <th width="15%">

                            </th>
                        </tr>
                        <tbody id="contentRows">

                        </tbody>
                    </table>
                </div>
                <div class="col-md-6">
                    <h2>
                        Add New Address
                    </h2>
                    <form class="form-horizontal" role="form" action="/address" method="post">
                        <div class="form-group">
                            <label for="add-first-name" class="col-md-4 control-label">
                                First name:
                            </label>
                            <div class="col-md-8">
                                <input type="text" class="form-control" id="add-first-name" placeholder="first name"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="add-last-name" class="col-md-4 control-label">
                                Last Name:
                            </label>
                            <div class="col-md-8">
                                <input type="text" class="form-control" id="add-last-name" placeholder="last name"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="add-street" class="col-md-4 control-label">
                                Street:
                            </label>
                            <div class="col-md-8">
                                <input type="text" class="form-control" id="add-street" placeholder="street"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="add-city" class="col-md-4 control-label">
                                City:
                            </label>
                            <div class="col-md-8">
                                <input type="text" class="form-control" id="add-city" placeholder="City"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="add-state" class="col-md-4 control-label">
                                State:
                            </label>
                            <div class="col-md-8">
                                <input type="text" class="form-control" id="add-state" placeholder="state"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="add-zip" class="col-md-4 control-label">
                                Zipcode:
                            </label>
                            <div class="col-md-8">
                                <input type="text" class="form-control" id="add-zip" placeholder="Zipcode"/>
                            </div>
                        </div>
                         <div class="form-group">
                            <div class="col-md-offset-4 col-md-8">
                                <button type="submit" 
                                        id="add-button" 
                                        class="btn btn-default">
                                    Create Address
                                 </button>
                            </div>
                        </div>
                    </form>
                </div>
            </div> 
        </div>

        <div class="modal fade" id="details-modal" tabindex="-1" role="dialog">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">
                            <span>&times;</span>
                            <span>close</span>
                        </button> 
                        <h4 class="modal-title" id="detailsModalLabel">Address Details</h4>

                    </div>
                    <div class="modal-body">
                        <h3 id="address-id"></h3>
                        <table class="table table-bordered">
                            <tr>
                                <th>First name</th>
                                <td id="firstName"></td>
                            </tr>
                            <tr>
                                <th>Last name</th>
                                <td id="lastName"></td>
                            </tr>
                            <tr>
                                <th>Street</th>
                                <td id="street"></td>
                            </tr>
                            <tr>
                                <th>City</th>
                                <td id="city"></td>
                            </tr>
                            <tr>
                                <th>state</th>
                                <td id="state"></td>
                            </tr>
                            <tr>
                                <th>Zipcode</th>
                                <td id="zip"></td>
                            </tr>
                        </table>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">
                            close
                        </button>
                    </div>
                </div>
            </div>
        </div>  
        <!-- Edit Modal -->
        <div class="modal fade" id="editModal" tabindex="-1" role="dialog">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">
                            <span>&times;</span>
                            <span class="sr-only">close</span>
                        </button>
                        <h4 class="modal-title" id="editModalLabel">edit Contact</h4>                        
                    </div>
                    <div class="modal-body">
                        <h3 id="address-id"></h3>
                        <form class="form-horizontal" role="form">
                            <div class="form-group"> 
                                <label for="edit-first-name" class="col-md-4 control-label">first name</label>

                                <div class="col-md-8">
                                    <input type="text" class="form-control" id="edit-first-name" placeholder="first name"/>
                                </div>
                            </div>
                            <div class="form-group"> 
                                <label for="edit-last-name" class="col-md-4 control-label">last name</label>

                                <div class="col-md-8">
                                    <input type="text" class="form-control" id="edit-last-name" placeholder="last name"/>
                                </div>
                            </div>
                            <div class="form-group"> 
                                <label for="edit-street" class="col-md-4 control-label">street</label>

                                <div class="col-md-8">
                                    <input type="text" class="form-control" id="edit-street" placeholder="street"/>
                                </div>
                            </div>
                            <div class="form-group"> 
                                <label for="edit-city" class="col-md-4 control-label">city</label>

                                <div class="col-md-8">
                                    <input type="text" class="form-control" id="edit-city" placeholder="city"/>
                                </div>
                            </div>
                            <div class="form-group"> 
                                <label for="edit-state" class="col-md-4 control-label">state</label>

                                <div class="col-md-8">
                                    <input type="text" class="form-control" id="edit-state" placeholder="state"/>
                                </div>
                            </div>
                            <div class="form-group"> 
                                <label for="edit-zip" class="col-md-4 control-label">Zipcode</label>

                                <div class="col-md-8">
                                    <input type="text" class="form-control" id="edit-zip" placeholder="zipcode"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-offset-4 col-md-8">
                                    <button type="submit" id="edit-button" class="btn btn-default" data-dismiss="modal">
                                        Edit Address
                                    </button>
                                    <button type="button" id="cancel-button" class="btn btn-default" data-dismiss="modal">
                                        Cancel
                                    </button>

                                    <input type="hidden" id="edit-address-id">
                                </div>
                            </div>
                        </form>
                    </div>
                    <div class="modal-footer">

                    </div>
                </div>
            </div>
        </div>
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/addressList.js"></script>
    </body>
</html>

