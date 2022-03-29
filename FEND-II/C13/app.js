const nombreUsuario = document.querySelector("#nombre");
const formulario = document.querySelector("form")
const checkboxes = document.querySelectorAll("input[type=checkbox]")
const radio = document.querySelectorAll("input[type=radio]")

let usuario = {
    nombreCompleto: "",
    contrasenia: "",
    tel: "",
    hobbiesSeleccionados: [],
    nacionalidad: ""
}

let mensajeError = document.createElement("p")
let nombreError = document.querySelector("#valdNombre")
let telError = document.querySelector("#valdTel")
let contraError = document.querySelector("#valdContra")

nombreError.appendChild(mensajeError);

function errorValidarNombre(mensaje){
    nombreUsuario.classList.add("error");
    let p = document.createElement("p");
    p.innerText = mensaje;
    mensajeError.appendChild(p);
}

function validarNombre(nombre){
    let nCompleto = nombre.trim().split(" ", 4);
    let contadorCondiciones = 0;

    !/\d/.test(nombre) ? contadorCondiciones++ : errorValidarNombre("* No debe contener números");
    nombre.length <= 150 ? contadorCondiciones++ : errorValidarNombre("* Debe contener menos de 151 carácteres");
    nCompleto.length > 1 ? contadorCondiciones++ : errorValidarNombre("* Debe contener más de una palabra");
    nCompleto[0].length > 1 ? contadorCondiciones++ : errorValidarNombre("* Nombre debe de contener más de 1 carácter");
    nCompleto[1].length > 1 ? contadorCondiciones++ : errorValidarNombre("* Apellido deben de contener más de 1 carácter");

    if(contadorCondiciones == 5){
        nombreUsuario.classList.remove("error");
        usuario.nombreCompleto = nCompleto;
    }
}

function validarTel(tele) {
    if (tele.length === 10) {
        usuario.tel = parseInt(tele)
    }
    else {
        telefonoUsuario.classList.add("error")
        mensajeError.innerText = "Este telefono no es valido."
        telError.appendChild(mensajeError)
    }
}

function validarContra() {
    let strongRegex = new RegExp("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#\$%\^&\*])(?=.{8,16})");

    if (strongRegex.test(contraUsuario.value)) {
        usuario.contrasenia = contraUsuario.value
    }
    else {
        contraUsuario.classList.add("error")
        mensajeError.innerText = "La contraseña no cumple con lo requerido."
        contraError.appendChild(mensajeError)
    }
    console.log(usuario)
}

nombreUsuario.addEventListener("blur", () => {
    mensajeError.innerHTML = "";
    validarNombre(nombreUsuario.value);
})


