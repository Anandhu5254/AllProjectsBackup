import React,{useState,useEffect} from 'react'
import axios from 'axios';
import Navbar1 from './Navbar1';
import {Link, useNavigate } from 'react-router-dom';

function Products() {
    const[products,setProducts]=useState([])
    const show=()=>{
        axios.get("https://fakestoreapi.com/products")
        .then((a)=>{
            setProducts(a.data);
            console.log(a.data);                
        })
        .catch((err)=>{
          console.log(err)
      });
    };
    useEffect(()=>{
        show()
    },[])
    
    const navigate=useNavigate()
    const display=(id)=>{   
     console.log(id);
      navigate('/backpack/'+id)
      
    }

    return (
      <div>
        <Navbar1/>
        <div>
          <table border="1" cellPadding={5} cellSpacing={5} >
              <tr>
                <th>Id</th>
                <th>Title</th>
                <th>Price</th>
                <th>Description</th>
                <th>Category</th>
                <th>Image</th>
              </tr>
              {
                products.map((a,index) => (
                  <tr key={index}>
                    <td><Link to={`/backpack/${a.id}`}>{a.id}</Link></td>
                    <td>{a.title}</td>
                    <td>{a.price}</td>
                    <td>{a.description}</td>
                    <td>{a.category}</td>
                    <td onClick={()=>display(a.id)}><img src={a.image} alt='a.title' width={100} height={100} ></img></td>
                  </tr>
                ))
              }
          </table>
        </div>
        </div>
      );
    }
    
export default Products

