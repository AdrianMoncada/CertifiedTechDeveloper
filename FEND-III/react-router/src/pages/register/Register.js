import React from 'react'
import { useNavigate } from 'react-router-dom'
const Register = ({ setIsLogged }) => {
  const navigate = useNavigate();
  const handlerSubmit = (e) => {
    e.preventDefault();
    setIsLogged(true);
    navigate("/home")
  }
  return (
    <form onSubmit={handlerSubmit}>
      <input placeholder='name' />
      <input placeholder='email' />
      <input placeholder='password' />
      <button>Enviar</button>
    </form>
  )
}

export default Register