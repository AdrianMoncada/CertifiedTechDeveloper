const nombreUsuario = document.querySelector("#nombre");
const contraseniaUsuario = document.querySelector("#pass");
const telefonoUsuario = document.querySelector("#tel");
const checkboxes = document.querySelectorAll("input[type=checkbox]")
const radio = document.querySelectorAll("input[type=radio]")

function normalizar(nombre) {
  let n = nombre.trim().toLowerCase()
  let dosNombres = n.split(" ", 2)
  console.log(dosNombres)
if(dosNombres.length > 2 && dosNombres.length < 2) {
      if(dosNombres[0].length <= 10 && dosNombres[1].length <= 10) {
          usuario.nombreCompleto = n
      }
      else {
          nombreUsuario.classList.add("error")
          mensajeError.innerText = "Se excedio de los caracteres"
          nombreError.appendChild(mensajeError)
      }
}
else {
      nombreUsuario.classList.add("error")
      mensajeError.innerText = "Por favor, coloque el nombre completo"
      nombreError.appendChild(mensajeError)
  }
  console.log(usuario)
}