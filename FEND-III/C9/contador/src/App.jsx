import React, { Component } from 'react'
import "./App.css";
import Button from './components/Button';
import { MensajesColor } from './components/assets/styles';

export default class App extends Component {
  
  
  state = {
    number: 0
  }

  addition = ()=>{
    this.setState(prevState => {
      return {
        number: prevState.number + 1
      }
    })
  }

  substraction = ()=>{
    if(this.state.number >= 1){
      this.setState(prevState => {
        return {
          number: prevState.number - 1
        }
        }
      )
    }

  }

  render() {
    console.log(this.state.number)
    return (
      <div className="container">
        <Button fn={this.addition} palabra={"suma"} />
        <Button fn={this.substraction} palabra={"resta"}/>
        <MensajesColor>{this.state.number}</MensajesColor>
      </div>

    )
  }
}
