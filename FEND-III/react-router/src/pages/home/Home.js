import React from 'react'
import GoTo from '../../components/GoTo'

const Home = () => {
  return (
    <div>
      <h1>home</h1>
      <GoTo argumentOne={"Ir a About"} argumentTwo={"/about"}></GoTo>
      </div>
  )
}

export default Home