
<div>
    <form action="addComment" method="POST">
        <div class="input-group">   
            <input class="form-control" id="add-comment-name" style="text-align: center" type="text" placeholder="Display Name" aria-describedby="basic-addon2">
            <span class="input-group-addon" id="basic-addon2">User Display Name</span>
        </div>
        <div class="input-group">
            <input class="form-control" id="add-comment-email" style="text-align: center" type="number"  placeholder="Email Address" aria-describedby="basic-addon2">
            <span class="input-group-addon" id="basic-addon2">Email Address</span>
        </div>
        <div class="input-group">
            <span class="input-group-addon" id="basic-addon2">Comment</span>
            <textarea id="add-comment-body" class="form-control" placeholder="Comment" aria-describedby="basic-addon2"></textarea>
        </div>
        <button id="commentPostBtn" class="postComment btn btn-success btn-sm">Submit</button>
    </form>
</div>
