import { objBg } from "../assets/backgroundColor";
const Tarjeta = ({ element, tipo}) => {
  return (
    <div className="mainCard">
      
        {
            tipo.map(item =>
            <div key={item.id} className="task" style = {{color: objBg[element]}}>
                <h3>{item.pokemonName}</h3>
                <img className="circular_image" src={item.avatar} alt={item.pokemonName}/>
            </div>
            )
        }
    </div>
  )
}

export default Tarjeta;