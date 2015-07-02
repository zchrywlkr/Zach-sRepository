<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div> 
    <div class="well">
        <div class="row">
            <div> 
                <div id="title">{{:title}}</div>
                <div class="userId" id="userId" value="{{:userId}}">{{:userId}}</div>
                <div id="date">{{:date}}</div>
                <div id="tags">{{:tags}}</div>
                <div id="categors">{{:categors}}</div>
                <div id="body" class="summaryPost">{{:body}}</div>
                <div  type="input hidden" id="pagId" value="{{:id}}">{{:id}}</div>
            </div>
            <hr/>
            <sec:authorize access="hasRole('ROLE_ADMIN')">
                <div class="row">
                    <div id="postSumCrud">
                        <div>
                            <div class="col-md-3">
                                <form action="../editStaticPage/{{:id}}" method="GET">
                                    <button  class="btn btn-primary" type="submit">
                                        edit
                                    </button>
                                </form>

                            </div>
                            <div class="col-md-3">
                                <a href="#" onclick="deleteStaticPage({{:id}})" id="deleteStaticPage" class="btn btn-primary">Delete</a>

                            </div>
                            <div class="col-md-3">
                                <a href="#" onclick="publish({{:id}})" id="publish" class="btn btn-primary">publish</a>

                            </div>
                            <div  class="col-md-3">
                                <form>
                                    <a href="#" onclick="changeOrder({{:id}})" id="changeIndex" class="btn btn-primary">Change index</a>
                                    <input id= "HiddenpageId" type="hidden" value="{{:id}}" />
                                    <select class="indexDropdown" id="indexDropdown_{{:id}}" name="indexDropDown" value="{{:index}}">    
                                    </select>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </sec:authorize>

        </div>
    </div>

    <div>
        <div class="col-xs-3"></div>
        <div class="col-xs-6">

        </div>
        <div class="col-xs-3"></div>
    </div>


</div>
