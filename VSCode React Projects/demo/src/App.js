// import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import {BrowserRouter,Routes,Route} from "react-router-dom";
import Page from './Components/Page';
import Login from './Components/Login';
import Navbar1 from './Components/Navbar1';
import Home from './Components/Home';
import Products from './Components/Products';
import About from './Components/About';
import Backpack from './Components/Backpack';
import Category from './Components/Category';
import CategoryItem from './Components/CategoryItem';

function App() {
  return (
    <BrowserRouter>
    <Routes>
      <Route path="/" element={<Page/>}/>
      <Route path="/login" element={<Login/>}/>
      <Route path="/navbar" element={<Navbar1/>}/>
      <Route path="/home" element={<Home/>}/>
      <Route path="/about" element={<About/>}/>
      <Route path="/Products" element={<Products/>}/>
      <Route path="/backpack/:id" element={<Backpack/>}/>
      <Route path="category" element={<Category/>}/>
      <Route path="/categoryitems/:category" element={<CategoryItem/>}/>


    </Routes>
    </BrowserRouter>
  );
}

export default App;
