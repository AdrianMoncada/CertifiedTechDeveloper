function startGame(){
  let resultado;
  let playerSelection = prompt("Piedra, Papel o Tijeras?");
  if(playerSelection.includes("Piedra")){
  playerSelection = 3;
    }else if(playerSelection.includes("Papel")){
    playerSelection = 2;
      }else if(playerSelection.includes("Tijeras")){
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
} else if(playerSelection == 3 && computerSelection == 1 || playerSelection == 2 && computerSelection == 3 || playerSelection == 1 && computerSelection == 2){
  resultado = "Ganaste";
} else{
  resultado = "Empataste";
}

alert(resultado)
}

startGame();