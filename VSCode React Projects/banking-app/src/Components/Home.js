import React from 'react'
import { useNavigate } from 'react-router-dom'
import "./home.css"

function Home() {

    const navigate=useNavigate();
  return (
    <div  className="home"style={{textAlign:"center",padding:20}}>
      <h1>Welcome To SRISHTI Bank</h1>
      <p><b>Secure And Easy Banking</b></p>
      <button onClick={()=>navigate("/account")} style={{backgroundColor:"cyan",borderRadius:"5px"}}>Go To Account</button>
    </div>
  )
}

export default Home
