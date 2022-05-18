const products = [
  {id:0, name:"Manzana", isStock: true},
  {id:1, name:"Pera", isStock: true},
  {id:2, name:"Naranja", isStock: true},
  {id:3, name:"Banana", isStock: true},
  {id:4, name:"Kiwi", isStock: true},
  {id:5, name:"Durazno", isStock: false},
  {id:6, name:"Cereza", isStock: false},
  {id:7, name:"Ananá", isStock: false},
]

const displayProducts = (argument) =>{
  if(argument === 1){
    return(
      <ul>
      <span>Products in Stock</span>
     {
         products.map(product =>{
          if(product.isStock){
              return (
                  <li key={product.id}>{product.name}</li>
              )
          }
         })
     }
 </ul>
  )
  } else if(argument === 2){
    return(
      <ul>
      <span>Products in Stock</span>
     {
         products.map(product =>{
          if(!product.isStock){
              return (
                  <li key={product.id}>{product.name}</li>
              )
          }
         })
     }
 </ul>
  )
  }

}

const App = (
  <div>
  {displayProducts(1)}
  {displayProducts(2)}
  </div>
)

const hookedElement = document.getElementById("root");
ReactDOM.render(App, hookedElement)