/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {
    loadNavBar();
   
     
  
    
    $('#orderStaticPages').click(function(event){
       
          
        event.preventDefault();
        listStaticPages();
       
    });
});

function loadNavBar(){
     $('#topnav').empty();
     $.ajax({
         type:'GET',
         url: '../getnavbar'
     }).success(function (data,status){
         var items=' <li id="" role="presentation"><a href="../index.jsp">Home</a></li>';
             $.each(data,function(index,page){
             items+= '  <li role="presentation" id="getStaticPage"><a href="../getStaticPage/'+ page.id+'">'+page.title+'</a></li>';
             
             });
             
             $('#topnav').append(items);
             
     });
     
 }
 
 
 $('#saveStaticPage').click(function (event) {
    event.preventDefault();

    

    $.ajax({
        url: '../saveChangePage',
        type: 'PUT',
        data: JSON.stringify({
            id :$('#pageId').val(),
            title: $('#titleInput').val(),
            body: tinyMCE.get('elm1').getContent(),
            index: $('#indexNumber').val()
         

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




function getStaticPage(data) {
   

    $.get('../jsp/staticPageFragment.jsp',function(value){
       displayPageTemplate = $.templates(value);
       var displayPage="";
       var options;
       
          $.each(data,function(index,page){
              options+= '<option>'+ page.index +'</option>' ;
            });
      
       
       

                displayPage += displayPageTemplate.render(data);

             $('#mainContent').html(displayPage);
             $('.indexDropdown').append(options);
             
             
              $.each(data,function(index,page){
                  $('#indexDropdown_'+page.id).val(page.index);
            });
    });

}

function listStaticPages(){
     $('#mainContent').empty(); 
        $.ajax({
            type:'GET',
            url: '../orderStaticPage'
        }).success(function(data,status){
//             
           getStaticPage(data);
//            
        });
}


  function changeOrder(id){
        
      
        $.ajax({
            type:'put',
            url:'../changeOrder',
            data: JSON.stringify({
            id :id,
           
            index: $('#indexDropdown_'+id).val()
         

        }),
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        'dataType': 'json'
        }).success(function(data,status){
         
            loadNavBar();
              listStaticPages();
        });
  }
  
  function deleteStaticPage(id){
      $.ajax({
          type:'delete',
          url:'../deleteStaticPage/'+id
      }).success(function(data,status){
          listStaticPages();
          loadNavBar();
      });
  }
  
  
  