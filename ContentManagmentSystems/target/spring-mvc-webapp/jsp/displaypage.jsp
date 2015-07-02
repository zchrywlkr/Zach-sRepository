
<div> 
    <script src="https://www.google.com/recaptcha/api.js" async defer></script>

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

    <div>
        <div class="col-xs-3"></div>
        <div class="col-xs-6">
            <form action="addComment" method="POST">
                <input id="hidddenUserId" type="hidden" value="{{:userId}}"/>
                <input id="hidddenPostId" type="hidden" value="{{:postId}}"/>
                <div class="input-group">   
                    <span class="input-group-addon" id="basic-addon2">User Display Name</span>
                    <input id="add-comment-name" type="text" class="form-control" placeholder="Display Name" aria-describedby="basic-addon2">
                </div>
                <div class="input-group">
                    <span class="input-group-addon" id="basic-addon2">Email Address</span>
                    <input id="add-comment-email" type="email" class="form-control" placeholder="Email Address" aria-describedby="basic-addon2">
                </div>
                <div class="input-group">
                    <span class="input-group-addon" id="basic-addon2">Comment</span>
                    <textarea id="add-comment-body" class="form-control" placeholder="Comment" aria-describedby="basic-addon2"></textarea>
                </div>
               
                <div class="g-recaptcha" data-sitekey="6LcXgAgTAAAAAIAL2hUDrSRAirEsD-siR7jdD-ox"></div>
                <div id="captchaErrorDiv"></div>
                <button id="commentPostBtn" class="postComment btn btn-primary">Submit</button>
            </form>
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
 <script type="text/javascript" src="${pageContext.request.contextPath}/js/tinymce.min.js"></script>
        
        <script type="text/javascript">
            tinymce.init({
                selector: "textarea#add-comment-body",
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
