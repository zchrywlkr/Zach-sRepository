<div>
    <h2>Edit Comment</h2>
</div>
<div>
    <div id="editComment_{{:commentId}}">
        <form action="editComment" method="POST">
            <input id="hidddenUserId" type="hidden" value="{{:userId}}"/>
            <input id="hidddenPostId" type="hidden" value="{{:postId}}"/>
            <div class="input-group">   
                <span class="input-group-addon" id="basic-addon2">User Display Name</span>
                <input id="edit-comment-name" type="text" class="form-control" value="{{:userId}}" aria-describedby="basic-addon2">
            </div>        
            <div class="input-group">
                <span class="input-group-addon" id="basic-addon2">Comment</span>
                <textarea id="edit-comment-body" class="form-control" aria-describedby="basic-addon2">{{:commentText}}</textarea>
            </div>
            <a class="btn btn-success btn-sm" href="#" onclick="editComment({{:commentId}},{{:postId}})" >Save Changes</a>
        </form>
        <hr/>
        <form>
            <div class="row" style="text-align: center">

                <div class="col-md-2"></div>

                <div class="col-md-2">
                    <a class="btn btn-danger btn-sm" href="#" onclick="deleteComment({{:commentId}},{{:postId}})" >Delete</a>
                </div>

                <div class="col-md-1"></div>

                <div class="col-md-2">
                    <a class="btn btn-info btn-sm" href="#" onclick="editTempComment({{:commentId}},{{:postId}})" >Edit</a>
                </div>

                <div class="col-md-1"></div>

                <div class="col-md-2">
                    <button class="commentDeleteBtn btn btn-success btn-sm" id="commentPublishBtn_{{:commentId}}" >Publish</button>
                </div>

            </div>
        </form>
    </div>
</div>
