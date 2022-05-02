window.addEventListener('load', function () {
    /* ---------------------- obtenemos variables globales ---------------------- */
    const formulario = document.querySelector('form');
    const inputEmail = document.querySelector("#inputEmail");
    const inputPassword = document.querySelector("#inputPassword");

    const urlBase = 'https://ctd-todo-api.herokuapp.com/v1'
    
    /* -------------------------------------------------------------------------- */
    /*            FUNCIÓN 1: Escuchamos el submit y preparamos el envío           */
    /* -------------------------------------------------------------------------- */
    formulario.addEventListener('submit', function (event) {
        event.preventDefault();

        // preparo la data para logear usuario
        const usuario = {
            email: inputEmail.value,
            password: inputPassword.value
        }
        
        console.log(usuario);

        const settings = {
            method: "POST",
            body: JSON.stringify(usuario),
            headers: {
                'Content-Type': 'application/json'
            }
        }

        realizarLogin(settings)
    });


    /* -------------------------------------------------------------------------- */
    /*                     FUNCIÓN 2: Realizar el login [POST]                    */
    /* -------------------------------------------------------------------------- */
    function realizarLogin(configuraciones) {
    
    // petición
    fetch(`${urlBase}/users/login`, configuraciones)
    .then(respuesta => respuesta.json())
    .then(data => {
        // corroboramos que nos llega un token
        if(data.jwt){
            // guardamos el token en storage
            localStorage.setItem('jwt', JSON.stringify(data.jwt));

            // redireccionamos al usuario a la pantalla de tareas
            location.replace('./mis-tareas.html');
        }
    }).catch( error => {
        console.log("Error escuchando la promesa.");
        console.log(error);
    })

};


});