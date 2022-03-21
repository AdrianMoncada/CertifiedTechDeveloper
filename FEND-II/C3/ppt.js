function empezar(){
  var input = prompt("Escriba su elección: Piedra - Papel - Tijera");

  eleccionJugador = input.toUpperCase();

  if(eleccionJugador.includes("PIEDRA")){
    eleccionJugador = 3;
      }else if(eleccionJugador.includes("PAPEL")){
        eleccionJugador = 2;
        }else if(eleccionJugador.includes("TIJERAS")){
          eleccionJugador = 1;
        }

  eleccionComputadora = Math.floor(Math.random()*3+1);

  console.log(eleccionComputadora)
  
  function jugar(eleccionJugador, eleccionComputadora){
      if(eleccionJugador != eleccionComputadora){
          if(eleccionJugador === 1 && eleccionComputadora === 3){
            alert("el usuario GANO")
          }else if(eleccionJugador === 2 && eleccionComputadora === 1){
              alert( "el usuario GANO con ")
          }else if(eleccionJugador === 3 && eleccionComputadora === 2){
              alert("el usuario GANO con ")
          }else{
              alert("La CPU Gano!!")
          }
      }else if(eleccionJugador === eleccionComputadora){
          alert("Empate")
      }
  };

  jugar();
  
}


empezar();