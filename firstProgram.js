const nemo = ["Nemo"];
const fish = ['dory', 'bruce', 'marlin', 'Nemo'];

const everyone = ['dory', 'bruce', 'marlin', 'Nemo', 'gill', 'bloat', 'nigel', 'squirt', 'darla', 'hank'];
const large = new Array(100).fill('Nemo');

function findNemo(array) {
  let t0 = performance.now();
  
  for (let i = 0; i < array.length; i++) {
    if (array[i] === "Nemo") {
      console.log("Founded Nemo !");
    }
  }
  let t1 = performance.now();
  console.log("Call to find Nemo took " + (t1 - t0) + " milliseconds.");
}

findNemo(large);
