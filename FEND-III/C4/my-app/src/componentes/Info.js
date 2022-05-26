const Info = ({name, lastname, age, nationality}) =>{
    return(
        <article>
            <h3>Personal Information</h3>
            <ul>
                <p>Name: {name}</p>                       
                <p>Lastname: {lastname}</p>                       
                <p>Age: {age}</p>                       
                <p>Nationality: {nationality}</p>                      
            </ul>
        <br/>
        </article>
    )
}

export default Info;