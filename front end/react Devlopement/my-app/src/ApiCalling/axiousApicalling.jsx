import axios from "axios";
//const axios = require('axios'); // legacy way

function axiosApicalling(){


// // Make a request for a user with a given ID
axios.get('https://dummyjson.com/users')


  .then(function (res) {
    // handle success
   
    console.log(res.data);
  })
  .catch(function (error) {
    // handle error
    console.log(error);
  })
  .finally(function () {
    // always executed
  });

  return(
    <div>
       <h1>Api j</h1>
  
    </div>

  );

}

export default axiosApicalling;