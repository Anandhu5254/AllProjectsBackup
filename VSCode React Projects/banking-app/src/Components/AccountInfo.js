import React, { useState } from 'react'

function AccountInfo() {

    const[name,setName]=useState("");
    const[contact,setContact]=useState("");
    const[balance,setBalance]=useState(0);
    const[amount,setAmount]=useState("");
    const[actionType,setActionType]=useState("deposit");

    const deposit=()=>{
        setBalance(balance+Number(amount))
        setAmount("");
    } 
    const withdraw=()=>{
        if(balance>=Number(amount)){
            setBalance(balance-Number(amount))
        }else{
            alert("Insufficient Balance")
        }
        setAmount("");
    }
  return (
    <div>
      <h1 style={{textAlign:"center"}}>Account Information</h1>
      <div style={{textAlign:"center"}}>
      <input style={{marginBlock:"5px"}}
          type='text'
          placeholder='Enter Name'
          value={name}
          onChange={(e)=>setName(e.target.value)}
      /><br></br>
      <input style={{marginBlock:"5px"}}
          type='number'
          placeholder='Enter Contact'
          value={contact}
          onChange={(e)=>setContact(e.target.value)}
      />
      <h3>Current Balance:${balance}</h3>
      <div>
        <h2>{actionType==="deposit"?"Deposit Cash":"Withdraw Cash"}</h2>
      </div>
      <input style={{marginBlock:"5px"}}
          type='number'
          placeholder='Enter Amount'
          value={amount}
          onChange={(e)=>setAmount(e.target.value)}
      /><br></br><br></br>
      <div>
      <button onClick={()=>{setActionType('deposit');deposit();}}>Deposit</button>&nbsp;&nbsp;
      <button onClick={()=>{setActionType('withdraw');withdraw();}}>Withdraw</button>
      </div>
      </div>
    </div>
  )
}

export default AccountInfo
