
// SELECTORES
const nombreUsuario = document.querySelector("#nombre");
const telefono = document.querySelector("#tel");
const contrasena = document.querySelector("#pass");
const checkboxes = document.querySelectorAll("input[type=checkbox]")
const formulario = document.querySelector("form")
const radio = document.querySelectorAll("input[type=radio]")

let nombreError = document.querySelector("#valdNombre")
let telError = document.querySelector("#valdTel")
let contraError = document.querySelector("#valdContra")
let checkBoxError = document.querySelector("#checkBoxError")
let radioError = document.querySelector("#radioError")

// OBJETO
let usuario = {
    nombreCompleto: "",
    contrasenia: "",
    tel: "",
    hobbiesSeleccionados: [],
    nacionalidad: ""
}

// VALIDAR NOMBRE
let mensajeError = document.createElement("p")

function errorValidarNombre(mensaje){
    nombreUsuario.classList.add("error");
    let p = document.createElement("p");
    p.innerText = mensaje;
    mensajeError.appendChild(p);
}

nombreError.appendChild(mensajeError);

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

nombreUsuario.addEventListener("blur", () => {
    mensajeError.innerHTML = "";
    validarNombre(nombreUsuario.value);
})

// VALIDAR TELÉFONO
let mensajeError2 = document.createElement("p")

function validarTel(tele) {
    let regex = /([0-9]+( [0-9]+)+)/
    if (regex.test(telefono.value)){
        usuario.tel = telefono.value;
        telefono.classList.remove("error")
        telError.removeChild(mensajeError2)
    } else{
        telefono.classList.add("error")
        let p2 = document.createElement("p");
        p2.innerText = "El teléfono debe tener 9 digitos y un espacio cada 3";
        telError.appendChild(p2)
    }
}

telefono.addEventListener("change", () => {
        
    validarTel(telefono.value)
})

// VALIDAR CONTRASEÑA
function validarContra(contra) {
    let strongRegex = new RegExp("^(?=.*[!@#$%^&*])(?=.{10,15})");
    if (strongRegex.test(contrasena.value)) {
        usuario.contrasenia = contrasena.value
        contrasena.classList.remove("error")
        contraError.removeChild(mensajeError)
    } else{
        contrasena.classList.add("error")
        mensajeError.innerText = "La contraseña debe tener entre 10 a 15 caracteres, y al menos uno de estos caracteres especiales: !@#$%^&*"
        contraError.appendChild(mensajeError)
    }
}

contrasena.addEventListener("blur", () => {
    validarContra(contrasena.value)
})

// VALIDAR HOBBIES
function validarCantidadHobbies (){
    if(usuario.hobbiesSeleccionados.length >= 5){
        let mensajeError2 = document.createElement("p")
        checkBoxError.classList.add("error");
        mensajeError2.innerText = "¡No puedes tener más de 4 hobbies!";
        checkBoxError.appendChild(mensajeError2);
    }
}

function validarHobbies() {

        if (usuario.hobbiesSeleccionados.includes("hobbiesNetflix") && usuario.hobbiesSeleccionados.includes("hobbiesTejer")){
            checkBoxError.classList.add("error");
            mensajeError.innerText = "¡La combinación de Netflix y Tejer no es mágica!";
            checkBoxError.appendChild(mensajeError);
        } 
        else if (usuario.hobbiesSeleccionados.includes("hobbiesGuitarra") && usuario.hobbiesSeleccionados.includes("Lectura")){
            checkBoxError.classList.add("error");
            mensajeError.innerText = "¡La combinación de Guitarra y Lectura no es mágica!";
            checkBoxError.appendChild(mensajeError);
        }
        else if (usuario.hobbiesSeleccionados.includes("hobbiesVideoJuegos") && usuario.hobbiesSeleccionados.includes("hobbiesCocina")){
            checkBoxError.classList.add("error");
            mensajeError.innerText = "¡La combinación de Videojuegos y Cocina no es mágica!";;
            checkBoxError.appendChild(mensajeError);
        } 
}

// VALIDAR PAÍS
function validarPaisArgentina(){
    if(radio[0].checked){
        radioError.classList.add("error");
        mensajeError.innerText = "Lo sentimos, aún no estamos reclutando magos en Argentina, pero pronto llegaremos.";
        radioError.appendChild(mensajeError);
    } else {
        null;
    }
}

function validarSeleccionPais (){
    if(usuario.nacionalidad == ""){
        let mensajeError3 = document.createElement("p")
        radioError.classList.add("error");
        mensajeError3.innerText = "Escoje tu pais de nacimiento para continuar.";
        radioError.appendChild(mensajeError3);
    } 
}

// SUBMIT FORMULARIO
formulario.addEventListener("submit", (e) => {
    e.preventDefault()

    checkboxes.forEach(hobbie => {
        hobbie.checked ? usuario.hobbiesSeleccionados.push(hobbie.id) : null
    })

    radio.forEach(radio => {
        radio.checked ? usuario.nacionalidad = radio.id : null
    })

    validarCantidadHobbies();

    validarHobbies();
    
    validarSeleccionPais();

    validarPaisArgentina();
    
    console.log(usuario);
})




