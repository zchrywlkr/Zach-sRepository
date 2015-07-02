

   
   
   
        <h1>Add a Post</h1>
        <form method="post" action="post">
            <h3>Title</h3>
            <div>
                <input type="text" name="titleInput" id="titleInput" value=""  data-value="title"></input>
            </div>
            <br>
            <div class="row">
            <div class="col-sm-6">
                <h3>Add Category</h3>
                <button id="addCategory" type="submit">Add Category</button>
                 <input type="text" id="categoryInput" name="categoryInput"  />
            </div>
            <div class="col-sm-6">
                <h3>Category</h3>
                <div id="categories">
                    
                </div>            
            </div>
                </div>
            <br>
            <div>
                <h3>body</h3>
            <p>   
                <textarea id="elm1" name="area" data-value="body" ></textarea>               
            </p>
            </div>                        
            <div>
                <h3>tag</h3>
                 <input type="text" name="tagInput" id="tagInput" />
            </div>
            <br>
            <div>
                <input type="submit" value="Save" id ="addAPost"/>
            </div>
        </form>

      <script src="${pageContext.request.contextPath}/js/jquery.loadTemplate-1.4.4.js"></script>
      