const state = {
  personalData: {
        name: "Maichus",
        lastname: "Slavutzky",
        age: 28,
        nationality: "Argentinian",
        residence: "Argentina",
        occupation: "psychologist",
        avatar:
        "https://media-exp1.licdn.com/dms/image/C5603AQErf7lhLAAxTA/profile-displayphoto-shrink_800_800/0/1618280561376?e=1658361600&v=beta&t=vKgqeK4emMzLYhtjXx6Qh9qXIY3q1Qsc5PzSzV3UE1c",
  },
  experience: [
        { id: 1, major: "Psicóloga deportiva en Club Atlético Vélez Sarsfield. Self-employed"},
        { id: 2, major: "Mentora de estudiantes Digital House"},
  ],
  education: [
    {
      id: 1, institute: "University of Buenos Aires"
    }
  ],
  bio: "Hola, me caracterizo por tener un buen manejo de equipos de trabajo, grupos de niños, adolescentes y adultos tanto en el formato virtual como presencial. Soy una persona proactiva, simpática, extrovertida y me adapto muy fácilmente a cualquier tarea que se me asigne.",
};

const Header = () => {
  return (
    <header>
      <nav >
        <ul >
          <li> Home </li> 
          <li> About </li> 
          <li> Experience </li>
          <li> Major </li>
        </ul>
      </nav>
    </header>
  )
};

const Avatar =({avatar}) =>{
  return(
    <img src={avatar}></img>
  )
};

const Info = ({ name, lastname, age, nationality, residence, occupation }) => {
    return (
        <main>
            <section className="personalData">
                <h1> Personal information </h1> 
                    <p>Name:{name}</p>
                    <p> Lastname: {lastname} </p> 
                    <p> Age: {age} years old </p>
                    <p> Nationality: {nationality} </p> 
                    <p> Residence: {residence} </p>
                    <p> Occupation: {occupation} </p>
            </section>
        </main>
    );
};


const Education = ()=>{
    return(
        <section>
            <h3>Education: </h3>

                {education.map( item =>
                    <li key ={item.id}>
                        {item.institute}                 
                    </li>
                ) }
  
        <br/>
        </section>
    )
}

const Experience = () => {
    return (
      <section>
      <h3>Experience: </h3>
    
          {experience.map( item =>
              <li key ={item.id}>
                 {item.major}                 
              </li>
          ) }
      
  </section>
    )
  };
  
const { education } = state;
const { experience } = state;


const Bio =({bio})=>{
  return(
    <section className="bio">
      <h3>Bio:</h3>
      <p>{bio}</p>
    </section>
  )
}


const App = (
  <div>
    <Header />
    <section className="main">
      <article>
      <Avatar
         avatar={state.personalData.avatar} 
       />
       </article>
      <article className="info">
      <Info
          name={state.personalData.name}
          lastname={state.personalData.name}
          nationality={state.personalData.nationality}
          residence={state.personalData.residence}
          age={state.personalData.age}
          occupation={state.personalData.occupation}
          avatar={state.personalData.avatar}
          bio={state.bio}
      />
      <Education/>
      <Experience/>
      <Bio
          bio={state.bio}
      />
      </article>
      </section>
  </div>
);

const htmlElement = document.getElementById("root");

ReactDOM.render(App, htmlElement);
