import { useState } from "react";

function FormValidation(){
    const [username, setName] = useState("");
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const [err,seterr]= useState("");

    const handleusername=(e)=>{
      setName(e.target.username);
    }
      const handleemail=(e)=>{
        setEmail(e.target.email);
      }
      const handlpassward=(e)=>{
         setPassword(e.target.password);
       }

    const handleformdata=(e)=>{
        e.preventDefault();
        let err;
     if(username.trim()==""){
        err="Username should be field";
     }
     else if(email.trim()==""){
        err="Email should be field";
     }
     else if(password.length>8){
        err="Passward shold cantain eight charactar";
     }
     else{
        alert="Form submited sucessfully";
     }
     seterr(err);
    }
    return(
        <div className="container">
            <h2 className="display-6">Form Validation</h2>
            <form onSubmit={handleformdata}>
                <label>Username:</label>
                <input type="text" name="username" value={username} onChange={handleformdata} />
                <br/>
                <label>Email:</label>
                <input type="email" name="email" value={email} onChange={handleformdata}></input>
                <label>Password:</label>
                <input type="password" name="password" value={password} onChange={handleformdata} />
                <br/>
                <input type="submit" value="Submit"/>
                </form>
                <br></br>
                <p style={{color:"red"}}>{err}</p>
                </div>
        
        );
    
}

export default FormValidation;