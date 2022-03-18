window.addEventListener('load', function () {
  //Selecciono los nodos
  const valor = document.querySelector("#valor")
  const inicio = document.querySelector("#iniciar")
  const stop = document.querySelector("#stop")
  const acelerar = document.querySelector("#acelerar")
  const pausar = document.querySelector("#pausa")
  
  //inicializo el valor del cronometro
  let n = 0

  function myTimer() {
  valor.innerText = n++
  }
  

  let myInterval;

              // TECLADO
      //setInterval se activa con el evento de teclado
  window.addEventListener("keypress", (event) => {
      // console.log(event)
      if(event.key == "Enter") {
        myInterval = setInterval(myTimer, 1000);
      }
  }  )

  window.addEventListener("keypress", (event) => {
    if(event.keyCode == 32) {
        clearInterval(myInterval);
        n = 0
        valor.innerText = n
    }
  })

  window.addEventListener("keypress", (event) => {
    if(event.key == "a") {
        clearInterval(myInterval);
    }
  })

  window.addEventListener("keypress", (event) => {
    if(event.key == "s") {
        clearInterval(myInterval);
        myInterval = setInterval(myTimer, 500);
    }
  })

  // MOUSE

    inicio.addEventListener("click", () => {
      
      myInterval = setInterval(myTimer, 1000);
  } )

  stop.addEventListener("click", () => {
      
    clearInterval(myInterval);
        n = 0
        valor.innerText = n
} )

  acelerar.addEventListener("click", () => {
      
    clearInterval(myInterval);
    myInterval = setInterval(myTimer, 500);
} )

pausar.addEventListener("click", () => {
      
  clearInterval(myInterval);
} )


  
  // stop.addEventListener("mouseover", () => {
  //     n = 0
  //     valor.innerText = n
  // } )
  
  //Para que resolvamos ClearInterval:
  
  // acelerar.addEventListener("click", () => {
  //     // clearInterval(intervalo)
  //     setInterval(() => {
  //         valor.innerText = n++
  //      }, 500)
  // } )
  
  
  
  
  
  
  });
  