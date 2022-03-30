/*
REQUERIMIENTOS
- utilizar el formulario para captar el texto ingresado

- implmentar el evento "submit", utilizarlo para guardar el comentario en un array

- cada vez que se agrega un nuevo comentario renderizarlo en una etiqueta "p"(sacar del html los hardcodeados y hacerlo dinamico)

- constantemente guardar la informacion en localStorage, si se recarga la pagina deberian mantenerse los comentarios
*/
const comentario = document.querySelector("#comentario");
const formulario = document.forms[0];
const comentarios= document.querySelector(".comentarios")

let array = [];

function comentariosArray() {
  let valorComentario = comentario.value;

  array.push(valorComentario);

  console.log(array);
}

console.log(array);

function renderizarComentarios() {

    comentarios.innerHTML="";
    
array.forEach((element) => {
     comentarios.innerHTML += `
    <p>${element}</p>
    `;
  });
}

formulario.addEventListener("submit", (e) => {
  e.preventDefault();

  comentariosArray();
  renderizarComentarios();
});

