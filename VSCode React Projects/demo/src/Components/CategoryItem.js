import React,{useState,useEffect} from 'react'
import axios from 'axios';
import Navbar1 from './Navbar1';
import Button from 'react-bootstrap/Button';
import Card from 'react-bootstrap/Card';
import { useParams } from 'react-router-dom';

function CategoryItem() {
    const[categoryitem,setNewcategory]=useState([])
    const{category}=useParams()
    console.log(category)
    const[item,setItem]=useState(false)
    const show=()=>{
        axios.get("https://fakestoreapi.com/products/category/"+category)
        .then((a)=>{
            setNewcategory(a.data);
            console.log(a);                
        })
        .catch((err)=>{
          console.log(err)
      });
    };
    useEffect(()=>{
        show();
    },[])
    const handleButtonClick = () => {
        setItem(!item);
    };
    return (
      <div>
          <Navbar1 />
          <div className="container">
              <div className="row">
                  {categoryitem.map((a, index) => (
                      <div key={index} className="col-12 col-sm-6 col-md-4 col-lg-3 mb-4">
                          <Card>
                              <Card.Img variant="top" src={a.image} />
                              <Card.Body>
                                  <Card.Title>{a.title}</Card.Title>
                                  <Card.Text>
                                      {a.category}<br />
                                      {a.id}<br />
                                      ${a.price}<br />
                                      {a.description}
                                  </Card.Text>
                                  <Button variant="primary">Go somewhere</Button>
                              </Card.Body>
                          </Card>
                      </div>
                  ))}
                        <Button type='button'  onClick={handleButtonClick}>Click</Button>
                                        {item ? <h1>Show Category</h1> : null}
                                 
              </div>
          </div>
    
      </div>
  );
}

export default CategoryItem;