/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function(){
    
    $('#loginButton').click(function(event){
        event.preventDefault();
        
        var email = $('#email').val();
        var password = $('#password').val();
          $.ajax({
              type: 'POST',
              url: 'login/'+email,
              data: JSON.stringify({
                  
                  password : password,
                  email : email
                  
              }),
              headers: {
                  'Accept': 'application/json',
                  'Content-Type': 'application/json'
              },
              'dataType':'json'
          }).success(function(data,status){
              window.location.replace("http://localhost:8080/RedBox/"+data);
          });
    });
// $('#loginButton').click(function(event){
//        event.preventDefault();
//        
//        var email = $('#email').val();
//        var password = $('#password').val();
//          $.ajax({
//              type: 'POST',
//              url: '/login/'+password+'/'+email
//          });
//    });
});

