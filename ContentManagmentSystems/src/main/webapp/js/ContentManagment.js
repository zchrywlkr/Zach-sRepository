var num = 0;
$(document).ready(function () {


//loadPostListByDate();


    loadPostListByDate(5);

    loadNavBar();
    categoriesByOccurence();
    tagsByOccurence();

    $('#getPost').click(function (event) {
        event.preventDefault();
        $.ajax({
            type: 'GET',
            url: 'getPost'

        }).success(function (data, status) {
            var content = $('#mainContent');

            content.empty();

            $('#mainContent').load("jsp/post.jsp");

        });
    });





    $('#home').click(function (event) {
        num = 0;
        event.preventDefault();
        $.ajax({
            type: 'GET',
            url: 'returnHome'


        }).success(function () {
            $('#mainContent').empty();
            $('#mainContent').load("jsp/home.jsp");
            loadNavBar();
            categoriesByOccurence();
            loadPostListByDate(num);
            tagsByOccurence();

        });
    });

    $('#addPost').click(function (event) {
        
        
        
   
        $.ajax({
            type: 'GET',
            url: 'addpost'

        }).success(function (data, status) {
            var content = $('#mainContent');

            content.empty();

            $('#mainContent').load("jsp/addPost.jsp");

            loadCategories();

        });
    });

    $('#addStaticPagePage').click(function (event) {
        event.preventDefault();

        $.ajax({
            type: 'GET',
            url: 'addStaticPagePage'

        }).success(function (data, status) {
            var content = $('#mainContent');

            content.empty();

            $('#mainContent').load("jsp/addStaticPagePage.jsp");

            loadCategories();

        });
    });

    $('#addAPost').click(function (event) {
        event.preventDefault();

        var textBox = tinyMCE.get('elm1').getContent();

        var cat = [];
        $.each($("input[name='Categories']:checked"), function () {
            cat.push($(this).val());
        });

        var postTags = [];
        postTags.push($('#tagInput').val());


        $.ajax({
            type: 'POST',
            url: 'newPost',
            data: JSON.stringify({
                title: $('#titleInput').val(),
                body: textBox,
                categors: cat,
                tags: postTags
            }),
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            'dataType': 'json'
        }).success(function (data, status) {
            location.href = "http://localhost:8080/ContentManagmentSystems/index.jsp";

        });
    });


    $('#addCategory').click(function (event) {
        event.preventDefault();
        if ($('#categoryInput').val() === "") {
            alert("Please enter a category");

        } else {

            $.ajax({
                type: 'POST',
                url: 'addCategory',
                data: (
                        $('#categoryInput').val()
                        ),
                headers: {
                    'Accept': 'application/String',
                    'Content-Type': 'application/String'
                }

            }).success(function (data, status) {
                loadCategories();
                $('#categories').empty();

            });
        }
    });

    function loadPost() {
        $('#mainContent').empty();


    }



});


function deletePost(id) {
    var answer = confirm("Do you really want to delete this post?");

    if (answer === true) {
        $.ajax({
            type: 'DELETE',
            url: 'post/' + id
        }).success(function () {
            loadPostListByDate(5);
        });
    }
}

function loadPostListByDate(num) {
    var postList = $('#postList');
    postList.empty();

    $.ajax({
        type: 'GET',
        url: 'getPostByDate/' + num

    }).success(function (data, status) {


        $.get('jsp/displayPageSummaryFrag.jsp', function (value) {
            displayPageTemplate = $.templates(value);
            var displayPage = displayPageTemplate.render(data);
            $('#mainContent').html(displayPage);


            $('#mainContent').append('<div><a href="#" onclick="morePost(' + num + ')" id="morePost">more post</a></div>');
            $('.theButtons').hide();
        });

    });

}





function editPost(id) {

    $('#mainContent').empty();

    $.ajax({
        type: 'GET',
        url: 'editPost/' + id

    }).success(function (post, status) {



        testFunction(post);
//         $('#mainContent').load('jsp/editPost.jsp');
//         $('#editContent').loadTemplate('jsp/addPostTemplate.jsp',post);
    });
}
function getPost(id) {
    $.ajax({
        type: 'GET',
        url: 'post/' + id
    }).success(function (data, status) {
//        displayPage(data);

        $.get('jsp/displaypage.jsp', function (value) {
            displayPageTemplate = $.templates(value);
            var displayPage = displayPageTemplate.render(data);
            $('#mainContent').html(displayPage);

            loadCommentsById(id);
        });
    });
}

function getCommentsForPost(id) {

    $.ajax({
        type: 'GET',
        url: 'commmentByPost/' + id
    }).success(function (data, status) {
        $.get('jsp/commentFragment.jsp', function (value) {
            displayCommentTemplate = $.templates(value);
            var displayComment = displayCommentTemplate.render(data);
            $('#commentRow').html(displayComment);
        });


    });
}

function loadCategories() {
    $('#categories').empty();

    $.ajax({
        type: 'GET',
        url: 'getCategories'
    }).success(function (data, status) {
        var items = "";
        $.each(data, function (key, value) {
            items += "<input id='" + value + "'type='checkbox' name='Categories' value='" + key + "' />";
            items += value;
            items += "&nbsp;&nbsp;&nbsp;&nbsp;";
        });
        $('#categories').append(items);

    });
}


function setCategoriesForEdit() {
    $('#categories').empty();
    $.ajax({
        type: 'GET',
        url: 'post/' + $('#thePostId')
    }).success(function (post, status) {

        $.ajax({
            type: 'GET',
            url: 'getCategories'
        }).success(function (data, status) {
            var items = "";
            $.each(data, function (key, value) {
                items += "<input id='edit" + key + "' type='checkbox' name='Categories' value='" + key + "' />";
                items += value;
                items += "&nbsp;&nbsp;&nbsp;&nbsp;";
                $.each(post.categors, function (cat, status) {
                    if (cat === value) {
                        $('edit' + key).prop('checked', true);
                    }
                });
            });
            $('#categories').append(items);

        });
    });
}

function loadNavBar() {
    $('#topnav').empty();
    $.ajax({
        type: 'GET',
        url: 'getnavbar'
    }).success(function (data, status) {
        var items = '   <li id="home" role="presentation"><a href=" index.jsp">Home</a></li>';
        $.each(data, function (index, page) {
            items += '  <li role="presentation" id="getStaticPage"><a href="getStaticPage/' + page.id + '">' + page.title + '</a></li>';

        });

        $('#topnav').append(items);

    });
}

function categoriesByOccurence() {
    $('#categoriesByOccurence').empty();
    var item = "";
    $.ajax({
        type: 'GET',
        url: 'getCategoriesByOccurence'
    }).success(function (data, status) {


        $.each(data, function (key, value) {
            var str = ("'" + value + "'");
            item += '<li  class="category getCategory"><a onclick="getCategory(' + str + ')" href="#">' + value + '</a></li>   ';
        });
        $('#categoriesByOccurence').append(item);
    });
}
function tagsByOccurence() {
    $('#tagsByOccurence').empty();

    var items = "";
    $.ajax({
        type: 'GET',
        url: 'getTagsByOccurence'
    }).success(function (data, status) {
        $.each(data, function (key, value) {
            var str = ("'" + value + "'");
            items += '<li  class="post getpost"><a onclick="getTag(' + str + ')" href="#">' + value + '</a></li>   ';
        });
        $('#tagsByOccurence').append(items);
    });
}


function morePost(num) {

    num += 5;

    loadPostListByDate(num);
}

function getCategory(category) {
    $.ajax({
        type: 'GET',
        url: 'getByCategory/' + category


    }).success(function (data, status) {

        $.get('jsp/displayPageSummaryFrag.jsp', function (value) {
            displayPageTemplate = $.templates(value);
            var displayPage = displayPageTemplate.render(data);
            $('#mainContent').html(displayPage);

        });
    });
}

function getTag(tag) {
    $.ajax({
        type: 'GET',
        url: 'getByTag/' + tag


    }).success(function (data, status) {

        $.get('jsp/displayPageSummaryFrag.jsp', function (value) {
            displayPageTemplate = $.templates(value);
            var displayPage = displayPageTemplate.render(data);
            $('#mainContent').html(displayPage);




        });
    });

}

function displayDashboard() {
    $('#mainContent').empty();
    $('#mainContent').load('jsp/administrativeDashboard.jsp');


}

function postManger() {
    $('mainContent').empty();
    $.ajax({
        type: 'GET',
        url: 'getPost/' + 1000

    }).success(function (data, status) {
            $('#mainContent').empty();
            $('#mainContent').append(' <center><form action ="${pageContext.request.contextPath}/newPostPage"  method="get"><a   style="text-align:center" onClick="addPost()" href="#" class="btn btn-info btn-sm" role="button"  id="addPost">Add Post</a></form></center><hr>');
            $('#mainContent').append('<div id="postFragments"></div>');
            $.get('jsp/displayPageSummaryPublishedFrag.jsp', function (value) {
                displayPageTemplate = $.templates(value);
                var displayPage = displayPageTemplate.render(data);
                $('#postFragments').html(displayPage);


                $('.theButtons').show();

            });
        
          $.each(data,function(index,post){
             
              if(post.approved===true){
                  $('#published'+post.postId).hide();
              }else{
                  $('#unpublished'+post.postId).hide();
              } 
          });


//            $.get('jsp/displayPageSummaryFrag.jsp', function (value) {
//                displayPageTemplate = $.templates(value);
//                var displayPage = displayPageTemplate.render(data);
//                $('#mainContent').html(displayPage);
//
//
//                $('.theButtons').show();
//
//            });

        
    });

}

function editCategories() {
    $('#mainContent').empty();
    $('#mainContent').append('<div  class = "col-md-6"><h3>Categories</h3></div>');
    $('#mainContent').append('<div  class = "col-md-6"><h3>Tags</h3></div>');
    $('#mainContent').append('<div id="editCategories" class = "col-md-6"></div>');
    $('#mainContent').append('<div id="editTags" class = "col-md-6"></div>');

    $.ajax({
        type: 'GET',
        url: 'getCategories'
    }).success(function (data, status) {
        var pair = $.map(data, function (value, key) {
            return {value: value, key: key}
        });

        $.get('jsp/categoriesEditFrag.jsp', function (value) {
            displayPageTemplate = $.templates(value);
            var displayPage = displayPageTemplate.render(pair);
            $('#editCategories').html(displayPage);
        });
    });
}

function editTags() {
    $.ajax({
        type: 'GET',
        url: 'tags'
    }).success(function (data, status) {
        var pair = $.map(data, function (value, key) {
            return {value: value, key: key}
        });

        $.get('jsp/tagEditFrag.jsp', function (value) {
            displayPageTemplate = $.templates(value);
            var displayPage = displayPageTemplate.render(pair);
            $('#editTags').html(displayPage);
        });


    });
}


function updateCategory(id) {

    var value = $('#categoryInput' + id).val();
    var key = id.toString();
    var pair = {key: id, value: value};

    $.ajax({
        type: 'PUT',
        url: 'updateCategory',
        data: JSON.stringify(pair),
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        }
    }).success(function (data, status) {
        editCategories();
        editTags();
    });
}


function updateTag(id) {

    var value = $('#tagInput' + id).val();
    var key = id.toString();
    var pair = {key: id, value: value};

    $.ajax({
        type: 'PUT',
        url: 'updateTag',
        data: JSON.stringify(pair),
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        }
    }).success(function (data, status) {
        editCategories();
        editTags();
    });
}

function deleteCategory(id) {
    $.ajax({
        type: 'DELETE',
        url: 'category/' + id
    }).success(function (data, status) {


        editCategories();
        editTags();
    });
}

function deleteTag(id) {
    $.ajax({
        type: 'DELETE',
        url: 'tag/' + id
    }).success(function (data, status) {


        editCategories();
        editTags();
    });
}


function pageManager() {
    location.href = "http://localhost:8080/ContentManagmentSystems/jsp/StaticPage.jsp";
    listStaticPages();
}

function publish(id) {
    $.ajax({
        type: 'PUT',
        url: 'publish/' + id
    }).success(function (data, status) {
        postManger();
    });
}

function Unpublish(id) {
    $.ajax({
        type: 'PUT',
        url: 'unpublish/' + id
    }).success(function (data, status) {
        postManger();
    });
}

function addPost(){
    $.ajax({
            type: 'GET',
            url: 'addpost'

        }).success(function (data, status) {
            var content = $('#mainContent');

            content.empty();

            $('#mainContent').load("jsp/addPost.jsp");

            loadCategories();

        });
}