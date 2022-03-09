
function startGame(){
  let resultado;
  let input = prompt("Piedra, Papel o Tijeras?");
  let playerSelection = input.toUpperCase();

  if(playerSelection.includes("PIEDRA")){
  playerSelection = 3;
    }else if(playerSelection.includes("PAPEL")){
    playerSelection = 2;
      }else if(playerSelection.includes("TIJERAS")){
      playerSelection = 1;
      }
let computerSelection = parseInt(Math.random()*3+1);

if(computerSelection == 3){
  alert("La computadora seleccionó Piedra");
} else if(computerSelection == 2){
  alert("La computadora seleccionó Papel");
} else{
  alert("La computadora seleccionó Tijera");
}

if(playerSelection == 3 && computerSelection == 2 || playerSelection == 2 && computerSelection == 1 || playerSelection == 1 && computerSelection == 3  ){
  resultado = "Perdiste";
  return puntajeComputadora++;
} else if(playerSelection == 3 && computerSelection == 1 || playerSelection == 2 && computerSelection == 3 || playerSelection == 1 && computerSelection == 2){
  resultado = "Ganaste";
  return puntajeJugador++;
} else{
  return resultado = "Empataste";
}

alert(resultado)
}

function playUntil(numberOfGames){
  puntajeJugador = 0;
  puntajeComputadora = 0;
  while(puntajeJugador < numberOfGames || puntajeComputadora < numberOfGames){
    startGame();
  }
}

playUntil(3);