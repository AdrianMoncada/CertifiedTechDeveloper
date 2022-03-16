window.onload = function(){
//   let btn = document.createElement("button");
// btn.innerHTML = "Click Me";
// document.body.appendChild(btn);

// btn.onclick = function(){
//   btn.style.color= "blue"
// }

let newTitle = document.createElement("H1");
newTitle.innerHTML = "Press F to pay respect";

document.body.appendChild(newTitle);

window.addEventListener("keypress", function(e) {
  if(e.key == "f"){
    alert("You pay respect")
  }
})

}

