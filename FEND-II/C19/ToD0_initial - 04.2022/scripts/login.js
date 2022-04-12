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
    function realizarLogin(settings) {
       




        
    };


});