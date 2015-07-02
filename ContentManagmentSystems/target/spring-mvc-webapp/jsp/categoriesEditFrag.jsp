<div class="">
    <form>
        <input type="hidden" value="{{:key}}"/>
        <input class=form-control" type="text" id="categoryInput{{:key}}" value="{{:value}}" />
        <a href="#" class="btn btn-primary " onclick="updateCategory({{:key}})">submit</a>
        <a href="#" class="btn btn-danger" onclick="deleteCategory({{:key}})">delete</a>
    </form>
    <br>
</div>