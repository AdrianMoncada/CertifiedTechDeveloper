// const fs = require('fs');

// REQUIRIENDO EL MODULO JSONHELPER
const jsonHelper = require("./node_modules/JsonHelper");


// UTILIZANDO EL METODO LEER PARA PARSEAR EL ARCHIVO arrayAutos.JSON
arrayPokemon = jsonHelper.leer("./response_ability.json");



const pokemons =  {arrayPokemon,
  buscarPorNombreFind: function(nombre) {
  const encontrado = this.arrayPokemon.results.find(element => element.name === nombre);
  if(encontrado){
    console.log("Se encontró el pokemon que buscabas, este el link: ")
    console.log(encontrado.url)
  } else {
    console.log("No se encontró el pokemon que buscabas :(")
  }
  
}
}

pokemons.buscarPorNombreFind("charizard");
pokemons.buscarPorNombreFind("lapras");




