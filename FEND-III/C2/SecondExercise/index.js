
const state = {
    personalData: {
        name: "Maichus",
        lastname: "Slavutzky",
        age: 28,
        nationality: "Argentinian",
        residence: "Argentina",
        occupation: "Psychologist",
        avatar: "https://media-exp1.licdn.com/dms/image/C5603AQErf7lhLAAxTA/profile-displayphoto-shrink_800_800/0/1618280561376?e=1658361600&v=beta&t=vKgqeK4emMzLYhtjXx6Qh9qXIY3q1Qsc5PzSzV3UE1c",

    bio: "Hola, me caracterizo por tener un buen manejo de equipos de trabajo, grupos de niños, adolescentes y adultos tanto en el formato virtual como presencial. Soy una persona proactiva, simpática, extrovertida y me adapto muy fácilmente a cualquier tarea que se me asigne."
    },
    experience: [
        { id: 1, job: "Psicóloga deportiva en Club Atlético Vélez Sarsfield"},
        { id: 2, job: "Mentora de estudiantes Digital House"},
    ],
    education: [
        { id: 1, institute: "University of Buenos Aires."},
    ]
}

const Header =()=>{
    return (
        <header style={{ width: "100%", height: "20vh"}}>
            <nav style={{ width: "100%"}}>
                <ul style={{ display: "flex", justifyContent: "space-evenly", listStyle: "none"}}>
                    <li>Home</li>
                    <li>About</li>
                    <li>Experience</li>
                    <li>Education</li>
                </ul>
            </nav>
        </header>
    )
};

const Info = ({ name, lastName, nationality, age, occupation, avatar, bio})=>{
    return (
        <main>
            <section style={{width: "300px"}}>
            <img style={{ width: "160px", height: "160px"}}
            src={avatar} alt="profile picture"/>
            </section>
            <section>
                <h1>Name: {name}</h1>
                <h1>Last Name: {lastName}</h1>
                <p>Age: {age} years old</p>
                <p>Nationality: {nationality}</p>
                <p>Occupation: {occupation}</p>
                <p>Bio: {bio}</p>
            </section>
            <ul>
        <h1>Education</h1>
            {
                education.map(item =>
                    <Education 
                        key={item.id}
                        institute={item.institute}
                    
                    />
                )
            }
        </ul>
        </main>
    )
};

const Education = ({ institute })=>{
    return(
        <li>{institute}</li>
    )
}

const Experience = ({ job })=>{
    return(
        <li>{job}</li>
    )
}

const { education } = state;
const { experience } = state;
const App = (
    <div>
        <Header/>
        <Info
            name={state.personalData.name}
            lastName={state.personalData.lastname}
            nationality={state.personalData.nationality}
            age={state.personalData.age}
            occupation={state.personalData.occupation}
            avatar={state.personalData.avatar}
            bio={state.personalData.bio}
        />
        

        <ul>
        <h1>Job Experience</h1>
            {
                experience.map(item =>
                    <Experience 
                        key={item.id}
                        job={item.job}
                    
                    />
                )
            }
        </ul>
    </div>
);

const htmlElement = document.getElementById("root");

ReactDOM.render(App, htmlElement);