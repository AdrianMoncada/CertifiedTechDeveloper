import {useState} from "react"
import { pokemonData } from "./Data/data";

import Header from './Components/Header';
import PokemonType from'./Components/PokemonType'
function App() {
  const arrOfKey = Object.keys(pokemonData);
  const [state, setState] = useState(<PokemonType 
    tipo = {pokemonData.fire}
  />);

  const handleTarjeta =(valor)=>{
    if(valor === 1){
        setState(<PokemonType
          element={arrOfKey[valor]} 
          tipo = {pokemonData.rock}
        />)
    }else if (valor === 2) {
        setState(<PokemonType 
          tipo = {pokemonData.water}
        />)
    } else if (valor === 3) {
      setState(<PokemonType 
        tipo = {pokemonData.fire}
      />)
    } else if (valor === 4) {
      setState(<PokemonType 
        tipo = {pokemonData.electric}
      />)
    } 
  }

  return (
    <div className="App">
      <div className="container">
      <Header 
        ChangeState={handleTarjeta}
      />
      {
        state
      }      
    </div>
    </div>
  );
}

export default App;
