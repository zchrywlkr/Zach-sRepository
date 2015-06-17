var input=-1;
var money =0;
$(document).ready(function () {
    loadProducts();
    
    $('.numberInput').click(function(event) {
        event.preventDefault();
            
            var num = $(this).val();
            $.ajax({
                url:'input/'+num
                
            }).success(function(data,status){
                if(input === -1){
                    input =num;
                }else if(input.length>=2){
                    input = num;
                }else{
                    input += num;
                }
                
                $('#itemNumber').val(input);
            });
        });
    $('.money').click(function(event) {
        event.preventDefault();
            
            var num = $(this).val();
            
            $.ajax({
                url:'money/'+num
                
            }).success(function(data,status){
                    
                $('#moneyinput').val(data);
            });
        });
        
    $('#buy').click(function(event) {
        event.preventDefault();
        
            var id = $('#itemNumber').val();
            $.ajax({
                
                url:'buy/'+id
                
            }).success(function(data,status){
                clearChange();
                $('#change').append(data);
                $('#itemNumber').val('');
                if(data.length>20){
                    
                    $('#moneyinput').val('');
                }
                updateProduct(id);
                 
                
            });
        });

// $('.numberInput').click(function(event) {
//        event.preventDefault();
//         $('#itemNumber').val(input);
//    });
});

function loadProducts() {
    clearItems();
    var listItem = $('#content');
    var item;

    $.ajax({
        url: 'products'
    }).success(function (data, status) {
        $.each(data, function (index, product) {
            item = " <div class=' col-sm-3' id='"+product.id+"' ><br/>";
            item+= "<ul class ='list-group'>";
            item += " <li class='list-group-item ";
            item += product.animate;
            item += "'><center><img  src='";
            item += product.url;
            item += "' alt='out of stock' style='width:128px;height:128px;'></center></li><li class='list-group-item' style='background-color:#585858 '><center>#";
            item += product.id;
            item += " $";
            item += product.price;
            item += "</center></li>";
            item += "</ul></div>";
            
            listItem.append(item);
        });
       
    });
}

function clearChange(){
    $('#change').empty();
}
function clearItems(){
    $('#content').empty();
}
function updateProduct(id){
    $.ajax({
        url: "product/"+id
    }).success(function(product,status){
        id = product.id;
        var update = $('#'+id);
       var item;
            
            item ="<br/>";
            item+= "<ul class ='list-group'>";
            item += " <li class='list-group-item ";
            item += product.animate;
            item += "'><center><img  src='";
            item += product.url;
            item += "' alt='out of stock' style='width:128px;height:128px;'></center></li><li class='list-group-item' style='background-color:#585858 '><center>#";
            item += product.id;
            item += " $";
            item += product.price;
            item += "</center></li>";
            item += "</ul></div>";
            update.empty();
            update.append(item);
                
    });
}

