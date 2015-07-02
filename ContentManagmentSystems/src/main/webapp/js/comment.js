/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {
//    loadComments();
//    loadCommentsById($('#hidddenPostId').val());
//    $("#clientTemplate").tmpl(testcommentList).appendTo('#commentRow');
    $("#addCommentRow").click('.addCommentBtn', function (event) {
        $('#addCommentWindow').loadTemplate('jsp/addCommentFragment.jsp');
        $(".addCommentBtn").hide();
    });
    $(document).on("click", '#commentPostBtn', function (event) {
//    $().click(function (event) {
        event.preventDefault();
        var response = grecaptcha.getResponse();

        $('#captchaErrorDiv').empty();
        var postId = $('#hidddenPostId').val();
        if (response.length === 0) {


            $('#captchaErrorDiv').addClass('bg-danger').append("There is error in your captcha try again!");

        }
        else {
            $('#captchaErrorDiv').empty().removeClass('bg-danger').addClass('bg-success').append("Success!");
            $.ajax({
                type: 'POST',
                url: 'comment',
                data: JSON.stringify({
                    postId: $('#hidddenPostId').val(),
                    userName: $('#add-comment-name').val(),
                    email: $('#add-comment-email').val(),
                    commentText: tinyMCE.get('add-comment-body').getContent(),
                    commentDate: null

                }),
                headers: {
                    'Accept': 'application/json',
                    'Content-Type': 'application/json'
                },
                'dataType': 'json'
            }).success(function (data, status) {
                $('#add-comment-name').val("");
                $('#add-comment-email').val("");
                tinyMCE.get('add-comment-body').setContent('');
//            loadComments();
                loadCommentsById(postId);

            });
        }
    });




//    $(document).click("button", ".commentDeleteBtn", function (event) {
//        event.preventDefault();
//        var commentId = event.target.id;
//        var answer = confirm("Do you really want to delete this contact?");
//
//        if (answer === true) {
//            $.ajax({
//                type: "DELETE",
//                url: "comment/" + commentId
//            }).success(function () {
//                loadComments();
//            });
//        }
//    }
//    );
});

function deleteComment(id, postId) {
    var response = confirm("do you want to delete?");
    if (response===true) {
        $.ajax({
            'type': 'DELETE',
            'url': 'comment/' + id
        }).success(function (data, status) {

            loadCommentsById(postId);
        });
    }

}

function editComment(commentId, postId) {

    $.ajax({
        'type': 'PUT',
        'url': 'comment/' + commentId,
        'data': JSON.stringify({
            commentId: commentId,
            userName: $('#edit-comment-name').val(),
            email: $('#edit-comment-email').val(),
            postId: postId,
            commentText: tinyMCE.get('edit-comment-body').getContent(),
            commentDate: null
        }),
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        'dataType': 'json'
    }).success(function (data, status) {
//            loadComments();
        tinyMCE.get('edit-comment-body').setContent('');
        loadCommentsById(postId);

    });
}

function fillCommentTable(commentList, status) {
    $.get('jsp/displayCommentFragment.jsp', function (value) {
        var displayComFragTemp = $.templates(value);
        var displayComment = displayComFragTemp.render(commentList);
        $('#commentRow').html(displayComment);
//    $.each(commentList, function(index, contact){
//    $('#commentRow').loadTemplate('jsp/commentFragment.jsp', commentList);
    });

}

function loadEditComment(commentId, postId) {
    $.ajax({
        type: 'GET',
        url: 'comment/' + commentId
    }).success(function (data, status) {

        $.get('jsp/editCommentFragment.jsp', function (value) {
            var editComFragTemp = $.templates(value);
            var displayEditComment = editComFragTemp.render(data);
            $('#' + commentId).html(displayEditComment);

        });
    });
}


function loadComments() {
    $.ajax({
        type: "GET",
        url: "comments"
    }).success(function (data, status) {
        fillCommentTable(data, status);
    });
}
function loadCommentsById(id) {
    $.ajax({
        type: "GET",
        url: "commmentByPost/" + id
    }).success(function (data, status) {

        fillCommentTable(data, status);
    });
}
function clearCommentRow() {
    $('#commentRow').empty();
}

function readMore(commentId) {

    $("commentText_" + commentId).readmore({
        speed: 75,
        moreLink: '<a href="#"><strong>&hellip;More</strong></a>',
        lessLink: '<a href="#"><strong>Less</strong></a>',
        embedCSS: true

    });
}

function login() {

}
var testcommentList = [{
        body: 'text stuff',
        userName: 'jon',
        date: '12/12/1999',
        id: '1'
    }, {
        body: 'text stuff 2',
        userName: 'zach',
        date: '12/12/2000',
        id: '2'}];

function publishComment(id) {
    $.ajax({
        type: 'PUT',
        url: 'publishComment/' + id
    }).success(function (data, status) {
        getPost($("#hidddenPostId").val());
    });
}

function UnpublishComment(id) {
    $.ajax({
        type: 'PUT',
        url: 'unpublishComment/' + id
    }).success(function (data, status) {
        getPost($("#hidddenPostId").val());
    });
}

function commentManager() {
    $("#mainContent").empty();

    $.ajax({
        type: 'GET',
        url: 'comments'
    }).success(function (data, status) {
        $("#mainContent").append('<div class="row" id="commentRow"></div>');
        fillCommentTable(data, status);
    });

}