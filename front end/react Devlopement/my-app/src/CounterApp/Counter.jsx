import "./counter.css";

import { useState } from "react";


function Counter(){
    const [num, SetNum]=useState(0);

    const Increment=()=>{
        SetNum(num+1);
    }

    const Decrement=()=>{
        if(num>0){
            SetNum(num-1);
        }
    }
    const Recet=()=>{
       SetNum(num=0);
    }

    return(<div className="maind">
        <h2>Counter</h2>
        <div className="output" id="output">{num}</div>
        <button id="plus" onClick={Increment}>+</button>
        <button id="minus" onClick={Decrement}>-</button>
        <button id="minus" onClick={Recet}>Recet</button>
    </div>)
}

export default Counter;