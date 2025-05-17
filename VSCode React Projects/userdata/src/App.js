import './App.css';
import View from './Components/View';
import Post from './Components/Post';
import Navbar1 from './Components/Navbar1';
import "../node_modules/bootstrap/dist/css/bootstrap.min.css";
import {BrowserRouter,Routes,Route} from "react-router-dom"
import About from './Components/About';
import Contact from './Components/Contact';
import Home from './Components/Home';
function App() {
  return (
   <BrowserRouter>
   <Routes>
     <Route path="/" element={<Post/>}/>
     <Route path="/view" element={<View/>}/>
     <Route path="/navbar" element={<Navbar1/>}/>
     <Route path="/about" element={<About/>}/>
     <Route path="/contact" element={<Contact/>}/>
     <Route path="/home" element={<Home/>}/>




   </Routes>
   </BrowserRouter>
  );
}

export default App;
