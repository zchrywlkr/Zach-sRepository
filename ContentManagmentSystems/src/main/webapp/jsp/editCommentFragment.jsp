<div>
    <div id="editComment_{{:commentId}}">
        <form action="editComment" method="POST">
            <input id="hidddenUserId" type="hidden" value="{{:userId}}"/>
            <input id="hidddenPostId" type="hidden" value="{{:postId}}"/>
            <div class="input-group">   
                <span class="input-group-addon" id="basic-addon2">User Display Name</span>
                <input id="edit-comment-name" type="text" class="form-control" value="{{:userName}}" aria-describedby="basic-addon2">
            </div>  
            <div class="input-group">   
                <span class="input-group-addon" id="basic-addon2">User Display Email </span>
                <input id="edit-comment-email" type="text" class="form-control" value="{{:email}}" aria-describedby="basic-addon2">
            </div>  
            
            <div class="input-group">
                <span class="input-group-addon" id="basic-addon2">Comment</span>
                <textarea id="edit-comment-body" class="form-control" aria-describedby="basic-addon2">{{:commentText}}</textarea>
            </div>
            <a class="btn btn-primary" href="#" onclick="editComment({{:commentId}},{{:postId}})" >Save Changes</a>
        </form>
        <hr/>
        <form>
            <div class="col-md-3">
                <a class="btn btn-danger" href="#" onclick="deleteComment({{:commentId}},{{:postId}})" >Delete</a>

            </div>
            <div class="col-md-3">
                <a class="btn btn-danger" href="#" onclick="editTempComment({{:commentId}},{{:postId}})" >Edit</a>
            </div>
            <div class="col-md-3">
                <button  id="commentPublishBtn_{{:commentId}}" class="commentDeleteBtn btn btn-defualt">Publish</button>
            </div>
        </form>
    </div>
</div>

        
       
 <script type="text/javascript">
            tinymce.init({
                selector: "textarea#edit-comment-body",
                theme: "modern",
                height: 100,
                plugins: [
                    "autolink link image lists charmap print preview hr anchor spellchecker",
                    "searchreplace wordcount visualblocks visualchars code fullscreen insertdatetime media ",
                    "save table contextmenu emoticons paste textcolor fullpage"
                ],
                content_css: "/tinymce/skins/lightgray/content.min.css",
                toolbar: false,
                menubar: false,
                style_formats: [
                    {title: 'Bold text', inline: 'b'},
                    {title: 'Red text', inline: 'span', styles: {color: '#ff0000'}},
                    {title: 'Red header', block: 'h1', styles: {color: '#ff0000'}},
                    {title: 'Example 1', inline: 'span', classes: 'example1'},
                    {title: 'Example 2', inline: 'span', classes: 'example2'},
                    {title: 'Table styles'},
                    {title: 'Table row 1', selector: 'tr', classes: 'tablerow1'}
                ]
            });

        </script>