import { useState } from "react";

function AccountInfo() {
    const [name, setName] = useState("");
    const [contact, setContact] = useState("");
    const [balance, setBalance] = useState(0);
    const [amount, setAmount] = useState("");
    const [actionType, setActionType] = useState("deposit"); // Added state for actionType

    const deposit = () => {
        setBalance(balance + Number(amount));
        setAmount("");
    };

    const withdraw = () => {
        if (balance >= Number(amount)) {
            setBalance(balance - Number(amount));
        } else {
            alert("Insufficient Balance");
        }
        setAmount("");
    };

    return (
        <div style={{ padding: "20px", textAlign: "center" }}>
            <h2>Account Information</h2>
            <input
                type="text"
                placeholder="Enter Name"
                value={name}
                onChange={(e) => setName(e.target.value)}
            />
            <br /><br />
            <input
                type="text"
                placeholder="Enter Contact"
                value={contact}
                onChange={(e) => setContact(e.target.value)}
            />
            <br /><br />
            <h3>Current Balance: ${balance}</h3>
            
            <div className="account-info">
            <h2>{actionType === 'deposit' ? 'Deposit Cash' : 'Withdraw Cash'}</h2>

                <input
                    type="number"
                    placeholder="Enter Amount"
                    value={amount}
                    onChange={(e) => setAmount(e.target.value)}
                />
                <br /><br />

                <button onClick={() => { setActionType('deposit'); deposit(); }}>Deposit</button>
                <button onClick={() => { setActionType('withdraw'); withdraw(); }}>Withdraw</button>
            </div>
        </div>
    );
}

export default AccountInfo;
