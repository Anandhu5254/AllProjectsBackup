import './App.css';
import FormComponent from './Components/FormComponent';
import DisplayComponent from './Components/DisplayComponent'
import { BrowserRouter, Route, Routes } from 'react-router-dom';

function App() {
  return (
    <div>
      <BrowserRouter>
      <Routes>
      <Route path="/" element={<FormComponent/>} />
      
      <Route path="/formdata" element={<DisplayComponent/>} />
      </Routes>
      </BrowserRouter>
    
    </div>
  );
}

export default App;