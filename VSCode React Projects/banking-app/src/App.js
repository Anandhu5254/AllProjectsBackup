import Home from "./Components/Home";
import AccountInfo from "./Components/AccountInfo";
import { BrowserRouter, Route, Routes } from "react-router-dom";

function App() {
  return (
    <div className="App">
      <BrowserRouter>
      <Routes>
          <Route path="/" element={<Home/>}/>
          <Route path="/account" element={<AccountInfo/>}/>
      </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
