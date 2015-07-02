<div>
    <h2>Page Order Manager</h2>
</div>
<div>
    <form>
        <a href="#" onclick="changeOrder({{:id}})" id="changeIndex" class="btn btn-info btn-sm">Change index</a>
        <input id= "HiddenpageId" type="hidden" value="{{:id}}" />
        <select class="indexDropdown" id="indexDropdown_{{:id}}" name="indexDropDown" value="{{:index}}">    
        </select>
    </form>
    <div>
        <input type="submit" value="Save" id="saveStaticPage"/>
    </div>
</div>
