import {useState} from "react"
import { pokemonData } from "./Data/data";

import Header from './Components/Header';
import PokemonRock from './Components/PokemonRock';
import PokemonWater from'./Components/PokemonWater'
import PokemonFire from './Components/PokemonFire';
import PokemonElectric from './Components/PokemonElectric';

function App() {

  const [state, setState] = useState(<PokemonFire 
    tipo = {pokemonData.fire}
  />);

  const handleTarjeta =(valor)=>{
    if(valor === 1){
        setState(<PokemonRock 
          tipo = {pokemonData.rock}
        />)
    }else if (valor === 2) {
        setState(<PokemonWater 
          tipo = {pokemonData.water}
        />)
    } else if (valor === 3) {
      setState(<PokemonFire 
        tipo = {pokemonData.fire}
      />)
    } else if (valor === 4) {
      setState(<PokemonElectric 
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
