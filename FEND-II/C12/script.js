const nombreUsuario = document.querySelector("#nombre")
const contraseniaUsuario = document.querySelector("#pass")
const emailUsuario = document.querySelector("#email")
const formulario = document.querySelector("form")


let usuario = {
    nombreCompleto: "",
    contra: "",
    email: "",
}


let span = document.createElement("span")
let nameError = document.querySelector("#nameError")
let passError = document.querySelector("#passError")



function normalizarDatos(nombre) {
    let n = nombre.trim().toUpperCase()
    if(n.length <= 50) {
        usuario.nombreCompleto = n
    }
    else {
        nombreUsuario.classList.add("error")
        nameError.appendChild(span)
        span.innerText = "Se excedio de la cantidad permitida de caracteres"

    }
}

function validaremail(email) {
        usuario.email = parseInt(email) 
}

nombreUsuario.addEventListener("blur", () => {
    normalizarDatos(nombreUsuario.value)
})

contraseniaUsuario.addEventListener("change", () => {
    let strongRegex = new RegExp("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#\$%\^&\*])(?=.{8,16})");

    if (strongRegex.test(contraseniaUsuario.value)) {
        usuario.contrasenia = contraseniaUsuario.value
    }
    else {
        passError.appendChild(span)
        span.innerText = "La contraseña debe contener: 1 mayúscula, 1 minúscula y un signo"
    }
    console.log(usuario)
})

formulario.addEventListener("submit", (e) => {
    e.preventDefault()

    validarEmail(emailUsuario.value)

    checkbox.forEach( hobbie => {
    hobbie.checked ? usuario.hobbiesSeleccionados.push(hobbie.id) : null
    })

    radio.forEach( nac => {
    nac.checked ? usuario.nacionalidad = nac.id : null
    })

    console.log(usuario)
})
