import React,{Component} from 'react';

class Myclass extends Component{
  //1.Property
  state = { };
  //2.Constructor
  constructor(props){
      super(props);
      console.log('hello from constructor');
      //The role Constructor is to Initializing the Properties
      this.state = {myName:"Adrián","surname":"Moncada"};

  }
  componentDidMount(){
      console.log('Hello from componentDidMount');
      this.setState({ myName:"Pedro","surname":"Cáceres"});
  }
  componentDidUpdate(){
      console.log('Hello from componentDidUpdate');
  }
  //3.Method
  //Every Method Must have render method
  render(){
      console.log('Hello from render Method');
      //Every render method return HTML
      return(
        <div>
          <h1>
              Hello {this.state.myName} {this.state.surname}
          </h1>
          </div>
      );
  }
}

export default Myclass;