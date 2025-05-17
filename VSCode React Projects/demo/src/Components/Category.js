import React,{useState,useEffect} from 'react'
import axios from 'axios';
import Navbar1 from './Navbar1';
import {Link, useNavigate } from 'react-router-dom';

function Category() {
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
          
        }

    return (
      <div>
        <Navbar1/>
        <div>
        {category.map((a,index)=>(
         <h1 key={index} onClick={()=>display(a)}>{a}</h1>
        ))}
        </div>
        </div>
      );
    }
    
export default Category

