import React from "react";

class Pelicula extends React.Component {
constructor(props) {
super(props);

this.state = {
imagen: "",
titulo: "",
año: 0,
director: "",
actores: [],
genero: "",
puntaje: 0,
imdb_URL: ""
};

this.seleccionarPelicula = this.seleccionarPelicula.bind(this);

this.verEnIMDB = this.verEnIMDB.bind(this);

}

seleccionarPelicula() {}
verEnIMDB() {}
componentDidMount() { }
componentDidUpdate() { }

render() {
return (
  <li onClick={this.seleccionarPelicula}>
<img src={this.state.image}
alt={this.state.titulo + " image"}
width="auto" height="200"
/>
<div onClick={this.verEnIMDB}>
<p> <b>Título:</b> {this.state.titulo} </p>
<p> <b>Año:</b> {this.state.año} </p>
<p> <b>Director:</b> {this.state.director} </p>
<p> <b>Actores:</b> {this.state.actores.join(', ')} </p>
<p> <b>Género:</b> {this.state.genero} </p>
<p> <b>Puntaje:</b> {this.state.puntaje} </p>
</div>
</li>
);
}
}

export default Pelicula;