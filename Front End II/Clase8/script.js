window.addEventListener("load", function () {
  //Selecciono los nodos
  const valor = document.querySelector("#valor");
  const inicio = document.querySelector("#iniciar");
  const stop = document.querySelector("#stop");
  const acelerar = document.querySelector("#acelerar");
  const pausar = document.querySelector("#pausa");

  let time = 1000
  //inicializo el valor del cronometro
  let n = 0;

  function myTimer() {
    valor.innerText = n++;
  }

  let myInterval;

  //INICIAR
  window.addEventListener("keypress", (event) => {
    // console.log(event)
    if (event.key == "Enter") {
      clearInterval(myInterval);
      myInterval = setInterval(myTimer, time);
    }
  });

  inicio.addEventListener("click", () => {
    clearInterval(myInterval);
    myInterval = setInterval(myTimer, time);
  });

  //PARAR Y REINICIAR
  window.addEventListener("keypress", (event) => {
    if (event.keyCode == 32) {
      clearInterval(myInterval);
      n = 0;
      valor.innerText = n;
    }
  });

  stop.addEventListener("click", () => {
    clearInterval(myInterval);
    n = 0;
    valor.innerText = n;
  });

  //PAUSAR

  window.addEventListener("keypress", (event) => {
    if (event.key == "a") {
      clearInterval(myInterval);
    }
  });

  pausar.addEventListener("click", () => {
    clearInterval(myInterval);
  });
});

//ACELERAR

window.addEventListener("keypress", (event) => {
  if (event.key == "s") {
    clearInterval(myInterval);
    myInterval = setInterval(myTimer, time);
  }
});

acelerar.addEventListener("click", () => {
  clearInterval(myInterval);
  myInterval = setInterval(myTimer, time);
});
