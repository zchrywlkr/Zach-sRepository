/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {

    $('#ButtonTest').click(function (event) {
        $('#mainContent').load('jsp/editPost.jsp');

        $("#editContent").loadTemplate('jsp/addPostTemplate.jsp');



    });
});

function testFunction(post) {
    $('#mainContent').load('jsp/editPost.jsp');
    $('#editContent').loadTemplate('jsp/addPostTemplate.jsp');
}


$('#SaveChange').click(function (event) {
    event.preventDefault();

    var cat = [];
    $.each($("input[name='Categories']:checked"), function () {
        cat.push($(this).val());
    });
    var postTags = [];
    postTags.push($('#tagInput').val());

    $.ajax({
        url: 'editPost/SaveChange',
        type: 'PUT',
        data: JSON.stringify({
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
        window.location = "http://localhost:8080/ContentManagmentSystems/";
    });
});
