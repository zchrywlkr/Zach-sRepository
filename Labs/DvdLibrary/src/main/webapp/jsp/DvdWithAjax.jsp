<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Dvd library</title>
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
                    <li role="presentation" ><a href="${pageContext.request.contextPath}/home">Home</a></li>
                    <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/ajax">Ajax</a></li>
                </ul>    
            </div>
            <div class="row">
                <div class="col-md-6">
                    <h2>My DVDs</h2>
                    <table id="ContactTable accordion" class="table table-hover">
                        <tr>
                            <th width="40%">
                                Dvd Title
                            </th>
                            <th withd="30%">
                                Release date
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
                        Add New DVD
                    </h2>
                    <form class="form-horizontal" role="form">
                        <div class="form-group">
                            <label for="add-title" class="col-md-4 control-label">
                                Dvd Title
                            </label>
                            <div class="col-md-8">
                                <input type="text" class="form-control" id="add-title" placeholder="title"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="add-release" class="col-md-4 control-label">
                                release date
                            </label>
                            <div class="col-md-8">
                                <input type="text" class="form-control" id="add-release" placeholder="release date"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="add-rating" class="col-md-4 control-label">
                                mpaa rating
                            </label>
                            <div class="col-md-8">
                                <input type="text" class="form-control" id="add-rating" placeholder="rating"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="add-director" class="col-md-4 control-label">
                                Director:
                            </label>
                            <div class="col-md-8">
                                <input type="text" class="form-control" id="add-director" placeholder="Director"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="add-studio" class="col-md-4 control-label">
                                Studio
                            </label>
                            <div class="col-md-8">
                                <input type="text" class="form-control" id="add-studio" placeholder="studio"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="add-note" class="col-md-4 control-label">
                                Notes:
                            </label>
                            <div class="col-md-8">
                                <input type="text" class="form-control" id="add-note" placeholder="notes"/>
                            </div>
                        </div>
                         <div class="form-group">
                            <div class="col-md-offset-4 col-md-8">
                                <button type="submit" 
                                        id="add-button" 
                                        class="btn btn-default">
                                    Create Dvd
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
                        <h4 class="modal-title" id="detailsModalLabel">Dvd Details</h4>

                    </div>
                    <div class="modal-body">
                        <h3 id="dvd-id"></h3>
                        <table class="table table-bordered">
                            <tr>
                                <th>Title</th>
                                <td id="dvd-title"></td>
                            </tr>
                            <tr>
                                <th>Release date</th>
                                <td id="dvd-release"></td>
                            </tr>
                            <tr>
                                <th>mpaa rating</th>
                                <td id="dvd-rating"></td>
                            </tr>
                            <tr>
                                <th>Director</th>
                                <td id="dvd-director"></td>
                            </tr>
                            <tr>
                                <th>Studio</th>
                                <td id="dvd-studio"></td>
                            </tr>
                            <tr>
                                <th>Notes</th>
                                <td id="dvd-note"></td>
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
                        <h4 class="modal-title" id="editModalLabel">edit Dvd</h4>                        
                    </div>
                    <div class="modal-body">
                        <h3 id="edit-id"></h3>
                        <form class="form-horizontal" role="form">
                            <div class="form-group"> 
                                <label for="edit-title" class="col-md-4 control-label">title</label>

                                <div class="col-md-8">
                                    <input type="text" class="form-control" id="edit-title" placeholder="title"/>
                                </div>
                            </div>
                            <div class="form-group"> 
                                <label for="edit-release" class="col-md-4 control-label">Release:</label>

                                <div class="col-md-8">
                                    <input type="text" class="form-control" id="edit-release" placeholder="release date"/>
                                </div>
                            </div>
                            <div class="form-group"> 
                                <label for="edit-rating" class="col-md-4 control-label">rating</label>

                                <div class="col-md-8">
                                    <input type="text" class="form-control" id="edit-rating" placeholder="rating"/>
                                </div>
                            </div>
                            <div class="form-group"> 
                                <label for="edit-director" class="col-md-4 control-label">director</label>

                                <div class="col-md-8">
                                    <input type="text" class="form-control" id="edit-director" placeholder="director"/>
                                </div>
                            </div>
                            <div class="form-group"> 
                                <label for="edit-studio" class="col-md-4 control-label">studio</label>

                                <div class="col-md-8">
                                    <input type="text" class="form-control" id="edit-studio" placeholder="studio"/>
                                </div>
                            </div>
                            <div class="form-group"> 
                                <label for="edit-note" class="col-md-4 control-label">Notes:</label>

                                <div class="col-md-8">
                                    <input type="text" class="form-control" id="edit-note" placeholder="notes"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-offset-4 col-md-8">
                                    <button type="submit" id="edit-button" class="btn btn-default" data-dismiss="modal">
                                        Edit dvd
                                    </button>
                                    <button type="button" id="cancel-button" class="btn btn-default" data-dismiss="modal">
                                        Cancel
                                    </button>

                                    <input type="hidden" id="edit-dvd-id">
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
        <script src="${pageContext.request.contextPath}/js/dvdList.js"></script>
    </body>
</html>

