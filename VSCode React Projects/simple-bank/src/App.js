import React from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import HomePage from "./Componenets/HomePage";
import AccountInfo from "./Componenets/AccountInfo";

function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<HomePage />} />
        <Route path="/account" element={<AccountInfo/>} />
      </Routes>
    </Router>
  );
}

export default App;
