<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div>
    <div class="col-md-12 well">
        <div id="commentTemplate" >
            <div id="{{:commentId}}">
                <div id="commentId_{{:commentId}}"></div>
                <div class="row">
                    <div class="col-md-8">
                        <div id="userId_{{:commentId}}"><address>
                                <a href="mailto:{{:email}}"><h3>{{:userName}}</h3></a>
                            </address> commented on:</div>  
                        <div id="commentDate_{{:commentId}}"><strong>{{:commentDate}}</strong></div> </div>
                    <div class="col-md-4"></div></div>
                <hr/>
                <div id="commentText_{{:commentId}}">{{:commentText}}</div>
                <input type="hidden" id="commentIdVal" value="{{:commentId}}" />
                <input type="hidden" id="postIdVal" value="{{:postId}}" />
                <form>
                    <sec:authorize access="hasRole('ROLE_ADMIN')">
                        <div class="col-md-3">
                            <a class="btn btn-danger" href="#" onclick="deleteComment({{:commentId}},{{:postId}})" >Delete</a>

                        </div>
                        <div class="col-md-3">
                            <a class="btn btn-danger" href="#" onclick="loadEditComment({{:commentId}},{{:postId}})" >Edit</a>
                        </div>
                    </sec:authorize>

                    {{if commentPublish  === true}}
                    <div id="unpublishComment{{:commentId}}" class="col-md-4">
                        <a  href="#" onclick="UnpublishComment({{:commentId}})" class="deleteclass btn btn-info btn-primary" role="button">Unpublish</a>
                    </div>
                    {{/if}}

                    {{if commentPublish === false}}
                    <div id="publishComment{{:commentId}}" class="col-md-4">
                        <a  href="#" onclick="publishComment({{:commentId}})" class="deleteclass btn btn-info btn-primary" role="button">Publish</a>
                    </div>
                    {{/if}}


                </form>
            </div>
        </div>
    </div>
</div>


<script type="text/javascript">

            var commentId = + $('#commentIdVal').val();
            $(readMore(commentId));
</script>