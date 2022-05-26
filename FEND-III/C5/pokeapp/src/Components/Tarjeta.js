const Tarjeta = ({tipo}) => {
  return (
    <div className="mainCard">
        {
            tipo.map(item =>
            <div key={item.id} className="task">
                <h3>{item.pokemonName}</h3>
                <img className="circular_image" src={item.avatar} alt={item.pokemonName}/>
            </div>
            )
        }
    </div>
  )
}

export default Tarjeta;