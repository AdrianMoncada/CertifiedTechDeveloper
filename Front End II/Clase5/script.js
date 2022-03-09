let tarjetas = document.getElementsByClassName("item");
let body = document.body;
let boton = document.querySelector("button");


function modoOscuro(){
  if (boton.innerHTML === "Oscuro") {
    boton.innerHTML = "Claro";
  } else {
    boton.innerHTML = "Oscuro";
  }
    body.classList.toggle("darkMode");
}