const formulario = document.forms[0];
const inputComentario = document.querySelector("#comentario");
const contenedorComentarios = document.querySelector(".comentarios");

const comentariosEnMemoria = obtenerComentarios();

function guardarComentario(comentario) {
  comentariosEnMemoria.push(comentario);
  localStorage.setItem("comentarios", JSON.stringify(comentariosEnMemoria));
}

function obtenerComentarios() {
  let comentariosAlmacenado = JSON.parse(localStorage.getItem("comentarios"));
  if (!comentariosAlmacenado) {
    comentariosAlmacenado = [];
  }
  comentariosAlmacenado.forEach((element) => {
    contenedorComentarios.innerHTML += `
  <p>${element}</p>
  `;
  });

  return comentariosAlmacenado;
}

formulario.addEventListener("submit", function (event) {
  event.preventDefault();
  contenedorComentarios.innerHTML = "";
  guardarComentario(inputComentario.value);
  obtenerComentarios();
});
