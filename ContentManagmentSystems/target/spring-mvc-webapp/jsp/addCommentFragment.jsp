<%-- 
    Document   : addCommentFragment
    Created on : Jun 25, 2015, 9:13:15 AM
    Author     : apprentice
--%>

<div>
    <div class="col-xs-3"></div>
    <div class="col-xs-6">
        <form action="addComment" method="POST">
            <div class="input-group">   
                <input id="add-comment-name" type="text" class="form-control" placeholder="Display Name" aria-describedby="basic-addon2">
                <span class="input-group-addon" id="basic-addon2">User Display Name</span>
            </div>
            <div class="input-group">
                <input id="add-comment-email" type="number" class="form-control" placeholder="Email Address" aria-describedby="basic-addon2">
                <span class="input-group-addon" id="basic-addon2">Email Address</span>
            </div>
            <div class="input-group">
                <span class="input-group-addon" id="basic-addon2">Comment</span>
                <textarea id="add-comment-body" class="form-control" placeholder="Comment" aria-describedby="basic-addon2"></textarea>
            </div>
            <button id="commentPostBtn" class="postComment btn btn-primary">Submit</button>
        </form>
    </div>
    <div class="col-xs-3"></div>
</div>
<div></div>
