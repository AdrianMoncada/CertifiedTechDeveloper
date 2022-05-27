const Tarjeta = ({ element, tipo}) => {
  const objBg = {
    rock: "red",
    water: "blue",
    fire: "black",
    electric: "orange"
    }
  return (
    <div className="mainCard">
      
        {
            tipo.map(item =>
            <div key={item.id} className="task" style = {{backgroundColor: objBg[element]}}>
                <h3>{item.pokemonName}</h3>
                <img className="circular_image" src={item.avatar} alt={item.pokemonName}/>
            </div>
            )
        }
    </div>
  )
}

export default Tarjeta;