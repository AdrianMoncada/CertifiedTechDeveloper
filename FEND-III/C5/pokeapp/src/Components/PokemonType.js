import Tarjeta from "./Tarjeta";

const PokemonType = ({element, tipo})=>{
  console.log(element)
    return(
      <>
        <Tarjeta
        element={element} 
        tipo = {tipo}
      />
      </>
    )
}

export default PokemonType;