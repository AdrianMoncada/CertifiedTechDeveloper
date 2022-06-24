import { data } from "../data";

const { education } = data;
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

export default Education;