
<div> 
    <div>
        <h2>Post</h2>
    </div>
    <div class="row" style="text-align:center">
        <div class="col-md-4"></div>
        <div class="col-md-2">
            <form action ="${pageContext.request.contextPath}/newPostPage"  method="get">
                <a href="${pageContext.request.contextPath}/addPost" class="btn btn-info btn-sm" role="button"  id="addPost">Add Post</a>         
            </form>
        </div>
        <div class="col-md-4"></div>
    </div>
    <div class="well">
        <div class="row">
            <div> 
                <div> <h3 onclick="getPost({{:postId}})"  id="postTitle" class="postTitle"><a href="#" > {{:title}} </a></h3></div>
                <div>
                    Author: {{:userId}}  &nbsp;&nbsp;&nbsp;&nbsp;
                    <a href="${pageContext.request.contextPath}/getDate">{{:date}}  </a>  
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
        </div>
        <div id="postSumCrud">
            <div class="theButtons">

                <div class="row" style="text-align: center">

                    <div class="col-md-2"></div>

                    <div class="col-md-2">
                        <a   class="btn btn-info btn-sm edit" href="editPost/{{:postId}}" var="editPost_url" name="postId" value="' + post.postId + '" class="btn btn-info btn-sm col-md-2" role="button">Edit Post</a> 
                    </div>

                    <div class="col-md-1"></div>

                    <div class="col-md-2">
                        <a  href="#" onclick="deletePost({{:postId}})" class="deleteclass btn btn-danger btn-sm" role="button">Delete Post</a>
                    </div>

                    <div class="col-md-1"></div>

                    <div class="col-md-2">
                        <a  href="#" onclick="publish({{:postId}})" class="deleteclass btn btn-success btn-sm" role="button">Publish</a>
                    </div>

                </div>
            </div>
        </div>
    </div>

    <div>
        <div class="col-md-1"></div>
        <div class="col-md-8">

        </div>
        <div class="col-md-1"></div>
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
