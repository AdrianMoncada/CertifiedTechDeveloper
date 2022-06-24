import './App.css';
import Header from './componentes/Header';
import Info from './componentes/Info';
import Avatar from './componentes/Avatar';
import Education from './componentes/Education';
import Experience from './componentes/Experience';
import Bio from './componentes/Bio';
import { data } from './data';


function App() {
    return(
        <div>
        <Header />
        <section className="main">
          <article>
          <Avatar
             avatar={data.personalData.avatar} 
           />
           </article>
          <article className="info">
          <Info
              name={data.personalData.name}
              lastname={data.personalData.name}
              nationality={data.personalData.nationality}
              residence={data.personalData.residence}
              age={data.personalData.age}
              occupation={data.personalData.occupation}
              avatar={data.personalData.avatar}
              bio={data.bio}
          />
          <Education/>
          <Experience/>
          <Bio
              bio={data.bio}
          />
          </article>
          </section>
      </div>
        ) 
}
    

  export default App;
