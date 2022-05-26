const Experience = ({info, title})=>{
    return(
        <article>
            <h3>{title}</h3>
            <ul>
                {info.map( item =>
                    <li key ={item.id}>
                       {item.movie}                 
                    </li>
                ) }
            </ul>
        <br/>
        </article>
    )
}

export default Experience;