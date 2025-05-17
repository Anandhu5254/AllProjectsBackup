import { useState } from "react";

import React from 'react'

const AccountInfo=()=> {
  const[name,setName]=useState("");
  const[contact,setContact]=useState("")
  const[balance,setBalance]=useState(0)
  const[amount,setAmount]=useState("")
  const[actionType,setActionType]=useState("deposit")

  const deposit=()=>{
    setBalance(balance+Number(amount))
    setAmount("");
  }

  const withdraw=()=>{
    if(balance>=Number(amount)){
      setBalance(balance-Number(amount))
    }
    else{
      alert("Insufficient Balance")
    }
    setAmount("");
  }

  return (
    <div style={{textAlign:'center',padding:20}}>
      <h2>Account Information</h2>
      <input
          type="text"
          placeholder="Enter Name"
          value={name}
          onChange={(e)=>setName(e.target.value)}
      /><br></br><br></br>
      <input
          type="number"
          placeholder="Enter Contact"
          value={contact}
          onChange={(e)=>setContact(e.target.value)}
      /><br></br>
      <h4>Current Balance: ${balance}</h4>
      <div className="account-info">
        <h2>{actionType==='deposit'?"Deposit Cash":"Withdraw Cash"}</h2>

      </div>
      <input
          type="number"
          placeholder="Enter Amount"
          value={amount}
          onChange={(e)=>setAmount(e.target.value)}
      /><br></br><br></br>
      <button onClick={()=>{setActionType('deposit');deposit();}}>Deposit</button>&nbsp;&nbsp;
      <button onClick={()=>{setActionType('withdraw');withdraw();}}>Withdraw</button>

    </div>
  )
}

export default AccountInfo
