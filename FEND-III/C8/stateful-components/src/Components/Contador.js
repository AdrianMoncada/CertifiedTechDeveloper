import React, { Component } from 'react';

class Contador extends Component {
  constructor(){
    super(); // Permite utilizar las props que hereda de su padre.
    this.state = {
      valor:1
    };
  }
  incrementar(){
    this.setState({
      valor: this.state.valor + 1
    });
  }
  render() {
    return (
      <button
      onClick={this.incrementar}>
      </button>
    );
  };
}

export default Contador;