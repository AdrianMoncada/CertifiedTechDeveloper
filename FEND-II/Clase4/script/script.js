var elem = document.getElementById('para');

console.log(elem);

elem.innerHTML = "Hola! Texto modificado";

var allLi = document.querySelectorAll("li");




function colorchange(){
  for (i = 0; i < allLi.length; i++) {
    allLi[i].style.color = "red";
  }
}

function myFunction() {
  var element = document.getElementById("myDIV");
  element.classList.toggle("mystyle");
} 