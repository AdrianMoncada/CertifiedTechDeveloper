import './App.css';
import Header from './componentes/Header';
import Info from './componentes/Info';
import Avatar from './componentes/Avatar';
import Education from './componentes/Education';
import Experience from './componentes/Experience';
import Bio from './componentes/Bio';
import {data} from './data/data';

function App() {
  return (
    <div className="App" class="main">
      <Header />
      <div class="tarjeta">
        <Avatar avatar = {data.personalData.avatar}/>
        <div class="datos">
          <Info 
            name = {data.personalData.name}
            lastname = {data.personalData.lastname}
            age = {data.personalData.age}
            nationality = {data.personalData.nationality}
          />
          <Education 
            title = "Education:"
            info={data.education}
          />
          <Experience 
            title = "Experience:"
            info={data.experience}
          />
          <Bio
            bio = {data.bio}
          />
        </div>
      </div>
    </div>
  );
}

export default App;
