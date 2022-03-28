// const fs = require('fs');

// REQUIRIENDO EL MODULO JSONHELPER
const jsonHelper = require("./node_modules/JsonHelper");


// UTILIZANDO EL METODO LEER PARA PARSEAR EL ARCHIVO arrayAutos.JSON
arrayPokemon = jsonHelper.leer("./response_ability.json");



const pokemons =  {arrayPokemon,
//   buscarPorNombre: function (nombre) {
//     for (let i = 0; i < this.arrayPokemon.results.length; i++) {
//         if (nombre === this.arrayPokemon.results[i].name) {
//             console.log("Se encontró la habilidad que buscabas, este el link: ")
//             console.log(this.arrayPokemon.results[i].url);
//         }
// }
// },
  buscarPorNombreFind: function(nombre) {
  const encontrado = this.arrayPokemon.results.find(element => element.name === nombre);
  if(encontrado){
    console.log("Se encontró la habilidad que buscabas, este el link: ")
    console.log(encontrado.url)
  } else {
    console.log("No se encontró la habilidad que buscabas :(")
  }
  
}
}


// pokemons.buscarPorNombre("own-tempo");
pokemons.buscarPorNombreFind("shield-dus")




