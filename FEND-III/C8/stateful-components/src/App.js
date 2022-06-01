import logo from './logo.svg';
import './App.css';
import Contador from './Components/Contador';
import {peliculasData} from './data/peliculas'
import Oklabs from './Components/Oklabs';
import MyClass from './Components/MyClass';
import Pelicula from './Components/Pelicula';

function App() {
  console.log(peliculasData);
  return (
    <div className="App">
      <Contador/>
      <Oklabs/>
      <MyClass/>
    </div>
  );
}

export default App;
