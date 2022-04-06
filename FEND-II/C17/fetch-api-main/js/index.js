function callApi() {
    fetch('https://randomuser.me/api/')
    .then(response => {
        return response.json()
    })
    .then(data => {
        renderizarDatosUsuario(data)
    });
}


function renderizarDatosUsuario(data) {
    let tarjeta = document.querySelector(".tarjeta");
    return tarjeta.innerHTML = 
    ` 
    <div>
    <img src="${data.results[0].picture.large}">
    <h2>${data.results[0].name.first} ${data.results[0].name.last}</h2>
    <h2>${data.results[0].email}</h2>
    </div>
    `   
    
}

let button = document.querySelector("#random")
button.addEventListener("click", function(){
    callApi();
})
