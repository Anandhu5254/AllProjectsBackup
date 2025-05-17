import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import NavDropdown from 'react-bootstrap/NavDropdown';
import './Navbar1.css';
import {Link,useNavigate} from 'react-router-dom';
import { useEffect, useState } from 'react';
import axios from 'axios';


function Navbar1() {
  const[category,setCategory]=useState([])
      const showcategory=()=>{
          axios.get("https://fakestoreapi.com/products/categories")
          .then((a)=>{
              setCategory(a.data);
              console.log(a.data);                
          })
          .catch((err)=>{
            console.log(err)
        });
      };
      useEffect(()=>{
          showcategory()
      },[])
  
       const navigate=useNavigate()
          const display=(category)=>{   
           console.log(category);
            navigate('/categoryitems/'+category)
            window.location.reload();
          }
  
  return (
    <>
      <Navbar bg="dark" data-bs-theme="dark">
        <Container>
          <Navbar.Brand href="#home">V-Cart</Navbar.Brand>
          <Nav className="nav-custom">
            <Link to="/">Home</Link>
            {/* <Link to="/navbar" >Navbar1</Link> */}
            <Link to="/about" >About</Link>
            <Link to="/products" >Products</Link>
            <Link to="/category" >Category</Link>

            {/* <NavDropdown title="Product List" id="basic-nav-dropdown">
              <NavDropdown.Item href="#action/3.1"><Link to="/backpack" >Backpack</Link>
              </NavDropdown.Item>
              <NavDropdown.Item href="#action/3.2">
                Another action
              </NavDropdown.Item>
              <NavDropdown.Item href="#action/3.3">Something</NavDropdown.Item>
              <NavDropdown.Divider />
              <NavDropdown.Item href="#action/3.4">
                Separated link
              </NavDropdown.Item>
            </NavDropdown> */}
            <NavDropdown title="Category List" id="basic-nav-dropdown">

              {/* <NavDropdown.Item >Electronics</NavDropdown.Item>
              <NavDropdown.Item >
                Jewelery
              </NavDropdown.Item>
              <NavDropdown.Item >Men's Clothing</NavDropdown.Item>
              <NavDropdown.Item >Women's Clothing</NavDropdown.Item>
              <NavDropdown.Divider />              */}
             <ul className="category-list">
    {category.map((a, index) => (
      <li key={index} className="category-item" onClick={() => display(a)}>
        {a}
      </li>
    ))}
  </ul>
</NavDropdown>
            <Link to="/login" >Login</Link>
          </Nav>
        </Container>
      </Navbar>
    </>
  );
}

export default Navbar1;