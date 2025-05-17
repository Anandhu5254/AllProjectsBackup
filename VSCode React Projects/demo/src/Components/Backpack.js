import React,{useState,useEffect} from 'react'
import axios from 'axios';
import Navbar1 from './Navbar1';
import Button from 'react-bootstrap/Button';
import Card from 'react-bootstrap/Card';
import { useParams } from 'react-router-dom';

function Backpack() {
    const[newproduct,setNewproduct]=useState({
      
    });
    const{id}=useParams()
    console.log(id)
    
    const show=()=>{
        axios.get("https://fakestoreapi.com/products/"+id)
        .then((a)=>{
            setNewproduct(a.data);
            console.log(a);                
        })
        .catch((err)=>{
          console.log(err)
      });
    };
    useEffect(()=>{
        show();
    },[])
    return (
        <div>
            <Navbar1/>      
        <div>
        <Card style={{ width: '18rem' }}>
          <Card.Img variant="top" src={newproduct.image} />
          <Card.Body>
            <Card.Title>{newproduct.title}</Card.Title>
            <Card.Text>
              {newproduct.category}<br></br>
              {newproduct.id}<br></br>
              {newproduct.price}<br></br>
              {newproduct.description}

            </Card.Text>
            <Button variant="primary">Go somewhere</Button>
          </Card.Body>
        </Card>
        </div>
        </div>
      );
    }
    
    
export default Backpack