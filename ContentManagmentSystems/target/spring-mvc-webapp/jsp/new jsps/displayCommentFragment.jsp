<div>
    <div class="col-md-10 well">
        <div id="commentTemplate" >
            <div id="{{:commentId}}">
                <div id="commentId_{{:commentId}}"></div>
                <div id="commentText_{{:commentId}}">{{:commentText}}</div>
                <div id="userId_{{:userId}}">{{:userId}}</div>
                <div id="commentDate_{{:commentId}}">{{:commentDate}}</div>
                <input type="hidden" id="commentIdVal" value="{{:commentId}}" />
                <input type="hidden" id="postIdVal" value="{{:postId}}" />
                <form>

                    <div class="row"  style="text-align: center">

                        <div class="col-md-2"></div>

                        <div class="col-md-2">
                            <a class="btn btn-danger btn-sm" href="#" onclick="deleteComment({{:commentId}},{{:postId}})" >Delete</a>
                        </div>

                        <div class="col-md-1"></div>

                        <div class="col-md-2">
                            <a class="btn btn-info btn-sm" href="#" onclick="loadEditComment({{:commentId}},{{:postId}})" >Edit</a>
                        </div>

                        <div class="col-md-1"></div>

                        <div class="col-md-2">
                            <button  id="commentPublishBtn_{{:commentId}}" class="commentDeleteBtn btn btn-success btn-sm">Publish</button>
                        </div>

                    </div>

                </form>
            </div>
        </div>
    </div>
</div>

<script type="text/javascript">
            var commentId = $('#commentIdVal').val();
            collapseComments(commentId);
</script>