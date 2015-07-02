
<html>

    <body>

        <div id="administratorDashboardBody">
            <div>
                <h2>Administrator Dashboard</h2>
            </div>
            <br>
            <br>
            <br>

            <div class="row" style="text-align: center">
                <div class="col-md-5"></div>                        

                <div class="col-md-2 btn-warning btn-lg">Post Manager
                    <form action ="${pageContext.request.contextPath}/postManager"  method="get">
                        <a href="#" onClick="postManger()" role="button" id="postManager"></a>         
                    </form>
                </div> 

                <div class="col-md-3"></div>

            </div>

            <br>
            <br>

            <div class="row" style="text-align: center">
                <div class="col-md-5"></div>                        

                <div class="col-md-2 btn-warning btn-lg">Comment Approval
                    <form action ="${pageContext.request.contextPath}/commentApproval"  method="get">
                        <a href="#" onClick="commentManager()" role="button" id="commentApproval"></a>         
                    </form>
                </div> 

                <div class="col-md-3"></div>

            </div>

            <br>
            <br>

            <div class="row" style="text-align: center">
                <div class="col-md-5"></div>                        

                <div class="col-md-2 btn-warning btn-lg">Page Manager
                    <form action ="${pageContext.request.contextPath}/pageManager"  method="get">
                        <a href="#" onClick="pageManger()" role="button" id="pageManager"></a>         
                    </form>
                </div> 

                <div class="col-md-3"></div>

            </div>

            <br>
            <br>

            <div class="row" style="text-align: center">
                <div class="col-md-5"></div>                        

                <div class="col-md-2 btn-warning btn-lg">Page Order Manager
                    <form action ="${pageContext.request.contextPath}/pageOrderManager"  method="get">
                        <a href="#" onClick="pageOrderManger()" role="button" id="pageOrderManager"></a>         
                    </form>
                </div> 

                <div class="col-md-3"></div>

            </div>

            <br>
            <br>

            <div class="row" style="text-align: center">
                <div class="col-md-5"></div>                        

                <div class="col-md-2 btn-warning btn-lg">User Manager
                    <form action ="${pageContext.request.contextPath}/userManager"  method="get">
                        <a href="#" onClick="userManager()" role="button" id="userManager"></a>         
                    </form>
                </div> 

                <div class="col-md-3"></div>

            </div>
            <br>
            <br>
        </div>

    </body>
</html>

