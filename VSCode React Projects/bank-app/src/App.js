import './App.css';
import { useState } from 'react';

function App() {
  return (
    <div className="App">
      <Homepage />
    </div>
  );
}

function Homepage() {
  const [action, setAction] = useState(null); // 'deposit' or 'withdraw'

  return (
    <div className="homepage">
      <h1>Welcome to SRISHITI Bank</h1>
      <p>Secure and easy banking.</p>

      <div className="actions">
        <button onClick={() => setAction('deposit')}>Deposit</button>
        <button onClick={() => setAction('withdraw')}>Withdraw</button>
      </div>

      {/* Show AccountInfo if action is selected */}
      {action && <AccountInfo actionType={action} />}
    </div>
  );
}

function AccountInfo({ actionType }) {
  const [balance, setBalance] = useState(0);
  const [amount, setAmount] = useState('');
  const [userDetails, setUserDetails] = useState({
    name: '',
    contact: '',
  });

  const handleSubmit = (e) => {
    e.preventDefault();
    const numAmount = parseFloat(amount);
    if (actionType === 'deposit') {
      setBalance(balance + numAmount);
    } else if (actionType === 'withdraw' && balance >= numAmount) {
      setBalance(balance - numAmount);
    } else {
      alert('Insufficient balance!');
    }
    setAmount('');
  };

  return (
    <div className="account-info">
      <h2>{actionType === 'deposit' ? 'Deposit Cash' : 'Withdraw Cash'}</h2>

      <form onSubmit={handleSubmit}>
        <div>
          <label>Name:</label>
          <input
            type="text"
            value={userDetails.name}
            onChange={(e) => setUserDetails({ ...userDetails, name: e.target.value })}
            required
          />
        </div>
        <div>
          <label>Contact:</label>
          <input
            type="text"
            value={userDetails.contact}
            onChange={(e) => setUserDetails({ ...userDetails, contact: e.target.value })}
            required
          />
        </div>
        <div>
          <label>Amount:</label>
          <input
            type="number"
            value={amount}
            onChange={(e) => setAmount(e.target.value)}
            required
          />
        </div>
        <button type="submit">Submit</button>
      </form>

      <div className="balance">
        <h3>Current Balance: ${balance.toFixed(2)}</h3>
      </div>
    </div>
  );
}

export default App;
