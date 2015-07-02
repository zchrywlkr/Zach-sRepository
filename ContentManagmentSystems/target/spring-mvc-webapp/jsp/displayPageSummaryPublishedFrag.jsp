<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div> 
    <div class="well">
        <div class="row">
            <div> 
                <div> <h3 onclick="getPost({{:postId}})"  id="postTitle" class="postTitle"><a href="#" > {{:title}} </a></h3></div>
                <div>
                    
                    <p>{{:date}}  </p>  
                </div>
                <div id="tagsCategories">
                    Categories: 
                    {{for categors}}
                    <a href="#" onclick="getCategory('{{>#data}}')">{{>#data}}</a>&nbsp;&nbsp;&nbsp;&nbsp;
                    {{/for}}
                    <br>
                    Tags:
                    {{for tags}}
                    <a href="#" onclick="getTag('{{>#data}}')">{{>#data}}</a>&nbsp;&nbsp;&nbsp;&nbsp;
                    {{/for}}
                </div>
                <hr>
                <div id="body" class="summaryPost">{{:body}}<a href="#" onclick="getPost({{:postId}})">.....more</a></div>

            </div>
            <hr/>
            <div class="row">
                <div id="postSumCrud">
                    <div class="theButtons">
                        <div class="col-md-4">
                            <a   class="btn btn-primary edit" href="editPost/{{:postId}}" var="editPost_url" name="postId" value="' + post.postId + '" class="btn btn-info btn-sm col-md-2" role="button">Edit Post</a> 
                        </div>
                        <div class="col-md-4">
                            <a  href="#" onclick="deletePost({{:postId}})" class="deleteclass btn  btn-primary " role="button">Delete Post</a>
                        </div>    
                        {{if approved  === true}}
                        <div id="unpublished{{:postId}}" class="col-md-4">
                            <a  href="#" onclick="Unpublish({{:postId}})" class="deleteclass btn btn-info btn-primary" role="button">Unpublish</a>
                        </div>
                        {{/if}}
                        
                        {{if approved === false}}
                        <div id="published{{:postId}}" class="col-md-4">
                            <a  href="#" onclick="publish({{:postId}})" class="deleteclass btn btn-info btn-primary" role="button">Publish</a>
                        </div>
                        {{/if}}

                    </div>
                </div>
            </div>
        </div>
    </div>

    <div>
        <div class="col-xs-3"></div>
        <div class="col-xs-6">

        </div>
        <div class="col-xs-3"></div>
    </div>
    <div id="comments_{{:postId}}">
        <div id="addCommentWindow"></div>
        <div class="row"></div>
        <br/>
        <div class="row"></div>
        <div class="row" id="commentRow">
        </div>
    </div>
</div>
<script>
   
</script>