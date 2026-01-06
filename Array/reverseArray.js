//Create a function that reverse a String
//'Hi My name is Nitish' should be:
//'hsitiN si eman iH'

function reverse(str) {
  
  //check input
  if(!str || str.length < 2 || typeof str !== 'string'){
    return 'Hmm that is not good.'
  }
  
  let newStr = '';
  for (let i = str.length-1; i >= 0; i--){
   
    newStr = newStr + str[i];
  }
  return newStr;
}


function reverse2(str){
  return str.split('').reverse().join('');
}

const reverse3 = str => str.split('').reverse().join('');

const reverse4 = str => [...str].reverse().join('');

const ans = reverse4('Hi My name is Nitish')
console.log(ans)