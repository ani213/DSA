import * as React from "react";

const test=()=>{
    const [state,setState]=React.useState();
    return (
        <>
           <h1>{state}</h1>
            <input 
              type="number"
              onChange={(e)=>setState(e.target.value)}
              value={state}
            />
            <button onClick={()=>{
                setState(state+1);
            }}>Increment</button>
            <button onClick={()=>{
                setState(state-1);
            }}>Decriment</button>
            </>
    )
}