$(document).ready(function () {
    loadAddress();

    $('#add-button').click(function (event) {
        event.preventDefault();
        $.ajax({
            type: 'POST',
            url: 'address',
            data: JSON.stringify({
                firstName: $('#add-first-name').val(),
                lastName: $('#add-last-name').val(),
                city: $('#add-city').val(),
                street: $('#add-street').val(),
                zipCode: $('#add-zip').val(),
                state: $('#add-state').val()
            }),
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            'dataType': 'json'
        }).success(function (data, status) {
            $('#add-first-name').val('');
            $('#add-last-name').val('');
            $('#add-city').val('');
            $('#add-street').val('');
            $('#add-zip').val('');
            $('#add-state').val('');

            loadAddress();
        });
    });

    $('#edit-button').click(function (event) {
        event.preventDefault();
        $.ajax({
            type: 'PUT',
            url: 'address/' + $('#edit-address-id').val(),
            data: JSON.stringify({
                firstName: $('#edit-first-name').val(),
                lastName: $('#edit-last-name').val(),
                city: $('#edit-city').val(),
                street: $('#edit-street').val(),
                zipCode: $('#edit-zip').val(),
                state: $('#edit-state').val()
            }),
            headers: {
                'Accept': ' application/json',
                'Content-Type': 'application/json'
            },
            'dataType': 'json'
        }).success(function (data, status) {
            $('#edit-first-name').val('');
            $('#edit-last-name').val('');
            $('#edit-city').val('');
            $('#edit-street').val('');
            $('#edit-zip').val('');
            $('#edit-state').val('');

            loadAddress();
        });
    });
});


function loadAddress() {
    clearContactTable();

    var cTable = $('#contentRows');

    $.ajax({
        url: 'addresses'
    }).success(function (data, status) {
        $.each(data, function (index, address) {
            cTable.append($('<tr>')
                    .append($('<td>')
                            .append($('<a>')
                                    .attr({
                                        'data-address-id': address.id,
                                        'data-toggle': 'modal',
                                        'data-target': '#details-modal'
                                    }).text(address.firstName + ' ' + address.lastName)))
                    .append($('<td>').text(address.State))
                    .append($('<td>')
                            .append($('<a>')
                                    .attr({
                                        'data-address-id': address.id,
                                        'data-toggle': 'modal',
                                        'data-target': '#editModal'
                                    }).text('edit')))
                    .append($('<td>')
                            .append($('<a>')
                                    .attr({
                                        'onClick': 'deleteAddress(' + address.id + ')'
                                    }).text('delete')))
                    );
        });
    });

    $('#details-modal').on('show.bs.modal', function (event) {

        var element = $(event.relatedTarget);
        var addressId = element.data('address-id');
        var modal = $(this);
        $.ajax({
            url: 'address/' + addressId
        }).success(function (address, status) {
            modal.find('#address-id').text(addressId);
            modal.find('#firstName').text(address.firstName);
            modal.find('#lastName').text(address.lastName);
            modal.find('#city').text(address.city);
            modal.find('#street').text(address.street);
            modal.find('#zip').text(address.zipCode);
            modal.find('#state').text(address.state);

        });
    });

    $('#editModal').on('show.bs.modal', function (event) {

        var element = $(event.relatedTarget);
        var addressId = element.data('address-id');
        var modal = $(this);
        $.ajax({
            url: 'address/' + addressId
        }).success(function (address, status) {
            
            modal.find('#address-id').text(addressId);
            modal.find('#edit-address-id').val(addressId);
            modal.find('#edit-first-name').val(address.firstName);
            modal.find('#edit-last-name').val(address.lastName);
            modal.find('#edit-city').val(address.city);
            modal.find('#edit-street').val(address.street);
            modal.find('#edit-zip').val(address.zipCode);
            modal.find('#edit-state').val(address.state);

        });
    });
}

function clearContactTable() {
    $('#contentRows').empty();
}

function deleteAddress(id){
    var answer  = confirm('do you wants to delete dvd');
    if(answer === true){
        $.ajax({
            type: 'DELETE',
            url: 'address/'+id
        }).success(function(){
            loadAddress();
        })
    }
}
var testContactData = [
    {
        id: 1,
        firstName: 'Suasan',
        lastName: 'Williams',
        City: 'ibm',
        Street: 'swilliams@ibm.com',
        zipCode: '555-1212',
        State: 'md'
    }];