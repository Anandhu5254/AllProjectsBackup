import { useState } from 'react';
import AccountInfo from './AccountInfo'; 

function Homepage() {
  const[action,setAction]=useState(null)

  return(
    <div className='homepage'>
      <h1>Welcome to Srishti Bank</h1>
      <p>Secure And Easy Banking</p>

      <div className='actions'>
        <button onClick={()=>setAction('deposit')}>Deposit</button>
        <button onClick={()=>setAction('withdraw')}>Withdraw</button>
      </div>
      
        {action && <AccountInfo actionType={action}/>}
    </div>
  )
}

export default Homepage;