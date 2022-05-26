const Task = ({ task }) => {
  return (
    <div className="task">
      <h3>{task.pokemonName}</h3>
      <img src={task.avatar} className="circular_image"/>
    </div>
  )
}

export default Task