<div>
    <h2>Post</h2>
</div>
<div> 
    <script src="https://www.google.com/recaptcha/api.js" async defer></script>
    <div class="well">
        <div> 
            <div class="row" style="text-align:center">
                <div class="col-md-4"></div>
                <div class="col-md-2">
                    <form action ="${pageContext.request.contextPath}/newPostPage"  method="get">
                        <a href="${pageContext.request.contextPath}/addPost" class="btn btn-info btn-sm" role="button"  id="addPost">Add Post</a>         
                    </form>
                </div>
                <div class="col-md-4"></div>
            </div>
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
            <div id="body" class="summaryPost">{{:body}}</div>
        </div>
        <hr/>
        <div id="postSumCrud">
            <div class="row"  style="text-align: center">

                <div class="col-md-2"></div>

                <div class="col-md-2">
                    <a href="editPost/{{:postId}}" var="editPost_url" name="postId" value="' + post.postId + '"class="btn btn-info btn-sm"  role="button">Edit Post</a> 
                </div>

                <div class="col-md-1"></div>

                <div class="col-md-2">
                    <a  href="#" onclick="deletePost({{:postId}})" class="deleteclass btn btn-danger btn-sm " role="button">Delete Post</a>
                </div>

                <div class="col-md-1"></div>

                <div class="col-md-2">
                    <a  href="#" onclick="publish({{:postId}})" class="deleteclass btn btn-success btn-sm" role="button">Publish</a>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="row" style="text-align:center">

    <div class="col-md-1"></div>

    <div class="col-md-8">
        <form action="addComment" method="POST">
            <input id="hiddenUserId" type="hidden" value="{{:userId}}"/>
            <input id="hiddenPostId" type="hidden" value="{{:postId}}"/>

            <div class="input-group">   
                <div class="row" style="text-align: left">
                    <div class="col-md-4">
                        <span class="input-group-addon" id="basic-addon2">User Display Name</span>
                    </div>
                    <div class="col-md-4">
                        <input id="add-comment-name" type="text" class="form-control" placeholder="Display Name" aria-describedby="basic-addon2">
                    </div>
                </div>
            </div>
            <div class="input-group">
                <div class="row" style="text-align: left">
                    <div class="col-md-4">
                        <span class="input-group-addon" id="basic-addon2">Email Address</span>
                    </div>
                    <div class="col-md-4">
                        <input id="add-comment-email" type="number" class="form-control" placeholder="Email Address" aria-describedby="basic-addon2">
                    </div>
                </div>
            </div>
            <div class="input-group">
                <div class="row" style="text-align: left">
                    <div class="col-md-4">
                        <span class="input-group-addon" id="basic-addon2">Comment</span>
                    </div>
                    <div class="col-md-4">
                        <textarea id="add-comment-body" class="form-control" placeholder="Comment" aria-describedby="basic-addon2"></textarea>
                    </div>
                </div>
            </div>
            <br>
            <div class="g-recaptcha" data-sitekey="6LcXgAgTAAAAAIAL2hUDrSRAirEsD-siR7jdD-ox"></div>
            <div id="captchaErrorDiv"></div>
            <br>
            <br>
            <button id="commentPostBtn" class="postComment btn btn-success btn-sm col-md-2">Submit</button>
        </form>
        <br>
        <br>
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

