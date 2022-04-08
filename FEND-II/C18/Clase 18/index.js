const url = "https://ctd-todo-api.herokuapp.com/v1/users"

const data = {
  firstName: "Adrián",
  lastName: "Moncada",
  email: "adrian.ignaciomoncada@gmail.com",
  password: 1234
}

//payload
const options = {
  method: "POST",
  body: JSON.stringify(data),
  headers: {
    "Content-type": "application/json",
  }
}

fetch(url, options )
  .then((response) => response.json())
  .then((json) => {
      // Aqui obtenemos la respuesta de la API.
      console.log("Usuario:", json);
    })


// { jwt: "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkcmlhbi5pZ25hY2lvbW9uY2FkYUBnbWFpbC5jb20iLCJpZCI6MjM3NywiaWF0IjoxNjQ5NDQwNDA0fQ.BqUTDsFhI1TMMGYYA5yHcTTQ2TNmPW54O0fQ1W6PV6E" }










