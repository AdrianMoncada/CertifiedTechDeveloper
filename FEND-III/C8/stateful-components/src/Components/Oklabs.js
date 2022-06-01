import React, { Component } from 'react';

class Oklabs extends Component{
  //1.Property

  //2.Constructor
  constructor(){
      super();
      this.state = { name : 'Adrián'};
  }

  //3.Method
  //Every Class Component Must have render method
  render(){
      return(
          <div>
              <h1>Hola { this.state.name }</h1>
          </div>
      );
  }
  //This method calls after the view is rendered
  componentDidMount(){
     setTimeout(() => {
      this.setState({name: '--Nombre modificado--'})
     },5000);
  }
}

export default Oklabs;