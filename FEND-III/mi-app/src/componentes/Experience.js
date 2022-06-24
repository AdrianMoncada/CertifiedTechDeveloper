import { data } from "../data";


const { experience } = data;

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

  export default Experience;