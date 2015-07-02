<div>
    <h2>Page Manager</h2>
</div>

<div class="well">

    <div> 
        <div> <h3 onclick="getPage({{:pageId}})"  id="pageTitle" class="pageTitle"><a href="#" > {{:title}} </a></h3></div>
        <div>
            Author: {{:userId}}  &nbsp;&nbsp;&nbsp;&nbsp;
            <a href="${pageContext.request.contextPath}/getDate">{{:date}}  </a>  
        </div>
        <hr>
    </div>
    <hr/>
    <div id="postSumCrud">
        <div class="row" style="text-align:center">
            <div class="col-md-2"></div>

            <div class="col-md-2">
                <a href="editPage/{{:pageId}}" var="editPage_url" name="pageId" value="' + page.pageId + '" class="btn btn-info btn-sm" role="button">Edit Page</a> 
            </div>

            <div class="col-md-1"></div>

            <div class="col-md-2">
                <a  href="#" onclick="deletePage({{:pageId}})" class="deleteclass btn btn-danger btn-sm" role="button">Delete Page</a>
            </div>

            <div class="col-md-1"></div>

            <div class="col-md-2">
                <a  href="#" onclick="publish({{:pageId}})" class="deleteclass btn btn-success btn-sm" role="button">Publish</a>
            </div>
        </div>
    </div>
</div>


