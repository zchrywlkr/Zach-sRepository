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
                <div id="body" class="summaryPost">{{:body}}</div>

            </div>
            <hr/>
            <div class="row">
                <div id="postSumCrud">
                    <div>
                        <div class="col-md-4">
                            <a   class="btn btn-primary edit" href="editPost/{{:postId}}" var="editPost_url" name="postId" value="' + post.postId + '" class="btn btn-info btn-sm col-md-2" role="button">Edit Post</a> 
                        </div>
                        <div class="col-md-4">
                            <a  href="#" onclick="deletePost({{:postId}})" class="deleteclass btn  btn-primary " role="button">Delete Post</a>
                        </div>
                        <div class="col-md-4">
                            <a  href="#" onclick="publish({{:postId}})" class="deleteclass btn btn-info btn-primary" role="button">Publish</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    
