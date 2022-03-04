let input = prompt("Ingrese su elección: Piedra, Papel o Tijera");
let jugador = input.toUpperCase();

let computadora = Math.floor(Math.random() * 3 + 1);

switch (computadora) {
  case 3:
    computadora = "PIEDRA";
    break;
  case 2:
    computadora = "PAPEL";
    break;
  case 1:
    computadora = "TIJERA";
    break;
  default:
    break;
}

switch (jugador) {
  case "PIEDRA":
    if (computadora == "PAPEL") {
      alert("Has perdido! Computadora eligio " + computadora);
    } else if (computadora == "TIJERA") {
      alert("Has ganado! Computadora eligio " + computadora);
    } else if (computadora == jugador) {
      alert("Empate!");
    }
    break;
  case "PAPEL":
    if (computadora == "TIJERA") {
      alert("Has perdido! Computadora eligio " + computadora);
    } else if (computadora == "PIEDRA") {
      alert("Has ganado! Computadora eligio " + computadora);
    } else if (computadora == jugador) {
      alert("Empate!");
    }
    break;
  case "TIJERA":
    if (computadora == "PIEDRA") {
      alert("Has perdido! Computadora eligio " + computadora);
    } else if (computadora == "PAPEL") {
      alert("Has ganado! Computadora eligio " + computadora);
    } else if (computadora == jugador) {
      alert("Empate!");
    }
    break;

  default:
    break;
}