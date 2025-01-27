import { useState } from "react";

function Statecomponent(){
    const [num , setNum]= useState(0);

    const increment=()=>
    {
        console.log("lode");
        setNum(num+1);
    }

    return(<>
    <h3>this is functionality of use state</h3>
    {/* <button onClick={()=>{setNum(num+1)}}>Click me if your rainbow</button> */}
    <button onClick={increment}>Click me</button>
    <h3> NUM is {num}</h3>
    </>)
}

export default Statecomponent;