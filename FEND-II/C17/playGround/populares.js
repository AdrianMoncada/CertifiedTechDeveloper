window.onload = function(){
  fetch("https://rickandmortyapi.com/api/character/?page=2")
    .then(function(respuesta){
      return respuesta.json();
    })
    .then(function(informacion){ 
      console.log(informacion)     
      for(let i=0;i < informacion.results.length; i++){
        console.log("funciona")
        let gif = "<p>" + informacion.results[i].name + "</p>";
        gif += "<img src=" + informacion.results[i].image+">"
        document.querySelector("ul").innerHTML += "<li>" + gif + "</li>"
      }
    })

    .catch(function(e) {
      console.log("Error")
}
)
}


// EJEMPLO TRY CATCH Y FINNALLY

// function myFunction() {
//   let message, x;
//   message = document.getElementById("intro");
//   message.innerHTML = "";
//   x = document.getElementById("demo").value;
//   try { //Ejecutamos un try con condicionales arrojando(throw) un mensaje:
//   if(x == "") throw "Contenido vacio";
//   if(isNaN(x)) throw "No es un numero";
//   x = Number(x);
//   if(x > 10) throw "Numero demasiado alto";
//   if(x < 5) throw "Numero demasiado bajo";
//   }
//   catch(err) { //Ejecutamos un catch para manejar el error mostrandolo en
//   el navegador
//   message.innerHTML = "Error: " + err + ".";
//   }
//   finally { //Ejecutamos la accion que termina con la funcion para
//   devolver el valor requerido
//   document.getElementById("demo").value = "";
//   }
//   }