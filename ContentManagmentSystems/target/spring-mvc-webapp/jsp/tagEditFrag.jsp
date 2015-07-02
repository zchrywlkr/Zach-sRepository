<div class="">
    <form>
        <input type="hidden" value="{{:key}}"/>
        <input class=form-control" type="text" id="tagInput{{:key}}" value="{{:value}}" />
        <a href="#" class="btn btn-primary " onclick="updateTag({{:key}})">submit</a>
        <a href="#" class="btn btn-danger" onclick="deleteTag({{:key}})">delete</a>
    </form>
    <br>
</div>