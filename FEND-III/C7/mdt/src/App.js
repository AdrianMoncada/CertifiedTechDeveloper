import logo from './logo.svg';
import './App.css';
import {mensajes} from "./modules/Data/Data";
import {MensajesColor} from "./modules/assets/Styles"

function App() {
  console.log(mensajes);
  return (
    <div className="App">
    <div>
        {mensajes.palabras.map((item, index) => (
          <MensajesColor key={item.id}>{item.mensaje}</MensajesColor>
        ))}
      </div>
    </div>
  );
}

export default App;
