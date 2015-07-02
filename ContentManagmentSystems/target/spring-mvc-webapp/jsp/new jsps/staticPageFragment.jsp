
<div> 
    <div class="well">
        <div class="row">
            <div> 
                <div id="title">{{:title}}</div>
                <div class="userId" id="userId" value="{{:userId}}">{{:userId}}</div>
                <div id="date">{{:date}}</div>
                <div id="tags">{{:tags}}</div>
                <div id="categors">{{:categors}}</div>
                <div id="body" class="summaryPost">{{:body}}</div>
                <div  type="input hidden" id="pagId" value="{{:id}}">{{:id}}</div>
            </div>
            <hr/>
            <div class="row">
                <div id="postSumCrud">
                    <div>

                        <div class="row">

                            <div class="col-md-3">
                                <form action="../editStaticPage/{{:id}}" method="GET">
                                    <button  class="btn btn-info btn-sm edit" type="submit">
                                        edit
                                    </button>
                                </form>
                            </div>

                            <div class="col-md-3">
                                <a href="#" onclick="deleteStaticPage({{:id}})" id="deleteStaticPage" class="btn btn-danger btn-sm">Delete</a>
                            </div>

                            <div class="col-md-3">
                                <a href="#" onclick="publish({{:id}})" id="publish" class="btn btn-success btn-sm">publish</a>
                            </div>

                            <div  class="col-md-3">
                                <form>
                                    <a href="#" onclick="changeOrder({{:id}})" id="changeIndex" class="btn btn-info btn-sm">Change index</a>
                                    <input id= "HiddenpageId" type="hidden" value="{{:id}}" />
                                    <select class="indexDropdown" id="indexDropdown_{{:id}}" name="indexDropDown" value="{{:index}}">    
                                    </select>
                                </form>
                            </div>

                        </div>

                    </div>
                </div>
            </div>
        </div>
    </div>

    <div>
        <div class="col-xs-3"></div>
        <div class="col-xs-6">

        </div>
        <div class="col-xs-3"></div>
    </div>

</div>
