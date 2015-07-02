/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function () {
    loadCategories();
    loadTagsandCategories();
    
});


function loadTagsandCategories(){
    var item ="";
    
    $.ajax({
        type: 'GET',
        url: 'getTags/'+$('#thePostId').val()
    }).success(function(data,status){
                $.each(data.tags,function(index,tag){
                    item+=tag;
                    item+=",";
                });
              $('#tagInput').val(item);
                $.each(data.categors,function(index,cat){
                   $('#'+cat).prop('checked', true);
                });
              
    });
    


}

//$('#SaveChange').click(function(event){
//    event.preventDefault();
//    
//    $.ajax({
//        type: 'PUT'
//    });
//});
$('#SaveChange').click(function (event) {
    event.preventDefault();

    var cat = [];
    $.each($("input[name='Categories']:checked"), function () {
        cat.push($(this).val());
    });
    var postTags = [];
    postTags.push($('#tagInput').val());

    $.ajax({
        url: 'SaveChange',
        type: 'PUT',
        data: JSON.stringify({
            postId :$('#thePostId').val(),
            title: $('#titleInput').val(),
            body: tinyMCE.get('elm1').getContent(),
            categors: cat,
            tags: postTags

        }),
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        'dataType': 'json'

    }).success(function(data,status){
        location.href = "http://localhost:8080/ContentManagmentSystems/index.jsp";
//        window.location = "http://localhost:8080/ContentManagmentSystems/index";
    });
});
