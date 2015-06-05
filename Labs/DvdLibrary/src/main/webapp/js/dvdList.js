/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {
    loadDvd();

    $('#add-button').click(function (event) {
        event.preventDefault();
        $.ajax({
            type: 'POST',
            url: 'dvd',
            data: JSON.stringify({
                title: $('#add-title').val(),
                releaseDate: $('#add-release').val(),
                mpaaRating: $('#add-rating').val(),
                director: $('#add-director').val(),
                studio: $('#add-studio').val(),
                note: $('#add-note').val()
            }),
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            'dataType': 'json'
        }).success(function (data, status) {
            $('#add-title').val('');
            $('#add-release').val('');
            $('#add-rating').val('');
            $('#add-director').val('');
            $('#add-studio').val('');
            $('#add-note').val('');

            loadDvd();
        });

    });

    $('#edit-button').click(function (event) {
        event.preventDefault();
        $.ajax({
            type: 'PUT',
            url: 'dvd/' + $('#edit-dvd-id').val(),
            data: JSON.stringify({
                title: $('#edit-title').val(),
                releaseDate: $('#edit-release').val(),
                mpaaRating: $('#edit-rating').val(),
                director: $('#edit-director').val(),
                studio: $('#edit-studio').val(),
                note: $('#edit-note').val()

            }),
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            'dataType': 'json'
        }).success(function (data, status) {
            $('#edit-title').val('');
            $('#edit-release').val('');
            $('#edit-rating').val('');
            $('#edit-director').val('');
            $('#edit-studio').val('');
            $('#edit-note').val('');

            loadDvd();
        });
    });
});
function loadDvd() {
    clearDvdTable();
    var cTable = $('#contentRows');

    $.ajax({
        url: 'dvds'
    }).success(function (data, status) {
        $.each(data, function (index, dvd) {
            cTable.append($('<tr>')
                    .append($('<a>')
                            .attr({
                                'data-dvd-id': dvd.id,
                                'data-toggle': 'modal',
                                'data-target': '#details-modal'
                            }).text(dvd.title))
                    .append($('<td>').text(dvd.releaseDate))
                    .append($('<td>')
                            .append($('<a>')
                                    .attr({
                                        'data-dvd-id': dvd.id,
                                        'data-toggle': 'modal',
                                        'data-target': '#editModal'
                                    }).text('edit'))
                            )
                    .append($('<td>')
                            .append($('<a>')
                                    .attr({
                                        'onClick': 'deleteDvd(' + dvd.id + ')'
                                    }).text('delete')))
                    );
        });
    });

    $('#details-modal').on('show.bs.modal', function (event) {
        var element = $(event.relatedTarget);
        var dvdId = element.data('dvd-id');
        var modal = $(this);
        $.ajax({
            url: 'dvd/' + dvdId
        }).success(function (dvd, status) {

            modal.find('#dvd-id').text(dvdId);
            modal.find('#dvd-title').text(dvd.title);
            modal.find('#dvd-release').text(dvd.releaseDate);
            modal.find('#dvd-rating').text(dvd.mpaaRating);
            modal.find('#dvd-director').text(dvd.director);
            modal.find('#dvd-studio').text(dvd.studio);
            modal.find('#dvd-note').text(dvd.note);

        });
    });

    $('#editModal').on('show.bs.modal', function (event) {
        var element = $(event.relatedTarget);
        var dvdId = element.data('dvd-id');

        var modal = $(this);

        $.ajax({
            url: 'dvd/' + dvdId
        }).success(function (dvd, status) {
            modal.find('#edit-id').text(dvdId);
            modal.find('#edit-dvd-id').val(dvdId);
            modal.find('#edit-title').val(dvd.title);
            modal.find('#edit-release').val(dvd.releaseDate);
            modal.find('#edit-rating').val(dvd.mpaaRating);
            modal.find('#edit-director').val(dvd.director);
            modal.find('#edit-studio').val(dvd.studio);
            modal.find('#edit-note').val(dvd.note);
        });
    });
}

function clearDvdTable(){
    $('#contentRows').empty();
}

function deleteDvd(id){
    var answer = confirm('do you realy want to delete dvd');
    if(answer ===true){
        $.ajax({
            type: 'DELETE',
            url: 'dvd/'+id
        }).success(function(){
            loadDvd();
        });
    }
}