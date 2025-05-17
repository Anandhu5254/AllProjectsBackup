import "../node_modules/bootstrap/dist/css/bootstrap.min.css";
import About from "./Components/About";
import Navbar1 from "./Components/Navbar1";
import Welcome from "./Components/Welcome";
import Projects from "./Components/Projects";
import Contact from "./Components/Contact";
import {BrowserRouter,Routes,Route} from "react-router-dom";
import Landingpage from "./Components/Landingpage";
import Resume from "./Components/Resume";

function App() {
    return(
  <div >
    <BrowserRouter>
    <Routes>
    <Route path="/welcome" element={<Welcome/>}/>
    <Route path="/about" element={<About/>}/>
    <Route path="/projects" element={<Projects/>}/>
    <Route path="/contact" element={<Contact/>}/>
    <Route path="/" element={<Landingpage/>}/>
    <Route path="/resume" element={<Resume/>}/>

    </Routes>
    </BrowserRouter>
  </div>
    )
}

export default App;
