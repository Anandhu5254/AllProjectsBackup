import React from "react";
import { useNavigate } from "react-router-dom";


const HomePage=()=>{
  const navigate=useNavigate();
  return (
    <div style={{textAlign:'center',padding:20}}>
      <h2>Welcome to SRISHTI Banking</h2>
      <p><b>Secure and easy Banking</b></p>
      <button onClick={()=>navigate('/account')}>Go To Account</button>
    </div>
  )
}

export default HomePage;
