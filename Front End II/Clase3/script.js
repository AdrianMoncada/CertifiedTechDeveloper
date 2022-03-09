let newArray = [1,2,3,4,5];
let sum = 0;

for(let i = 0; i < newArray.length; i++){
  console.log(newArray[i])
sum = sum + newArray[i];
}

console.log(sum);


console.log("<-------------->")

let sum2 = 0;
const numbers = [65, 44, 12, 4];
numbers.forEach(myFunction);

function myFunction(item) {
  sum2 += item;
}

console.log(sum2);