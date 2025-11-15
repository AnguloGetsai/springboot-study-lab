// Call the dataTables jQuery plugin
$(document).ready(function() {
     cargarDatos();
  $('#usuarios').DataTable();
});


async function cargarDatos(){

        const request = await fetch('usuarios', {
            method: 'GET',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },

        });
        const usuarios = await request.json();
        let listadoHTML = '';
        for (let users of usuarios){

            let usersHTML ='<tr><td>'+users.id+'</td><td>'+users.nombre+' '+users.apellido+'</td><td>'+users.email+'</td><td>'+users.telefono+'</td><td><a href="#" class="btn btn-danger btn-circle"><i class="fas fa-trash"></i></a></td></tr>';
            listadoHTML += usersHTML;
        }

    document.querySelector('#usuarios tbody').outerHTML = listadoHTML;
    console.log(usuarios);


}



