import React,{useState,useEffect} from 'react'
import axios from 'axios'
import './view.css';

function View() {
    const[user,setUser]=useState([])
    const show=()=>{
        axios.get("https://jsonplaceholder.typicode.com/users")
        .then((a)=>{
            setUser(a.data);
            console.log(a.data);                
        })
        .catch((err)=>{
          console.log(err)
      });
    };
    useEffect(()=>{
        show()
    },[])

    return (
        <div>
          <table border="1" cellPadding={5} cellSpacing={5} >
              <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Username</th>
                <th>Email</th>
                <th>Address</th>
              </tr>
              {
                user.map((a) => (
                  <tr>
                    <td>{a.id}</td>
                    <td>{a.name}</td>
                    <td>{a.username}</td>
                    <td>{a.email}</td>
                    <td>{a.address.street}, {a.address.city}</td>
                  </tr>
                ))
              }
          </table>
        </div>
      );
    }
    
export default View

