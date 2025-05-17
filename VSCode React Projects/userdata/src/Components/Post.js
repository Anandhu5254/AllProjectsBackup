import React,{useState} from 'react'
import axios from 'axios';

function Post() {
    const[user,setUser]=useState({
        Name:"",
        Age:""
    });
    const handleChange=(e)=>{
        setUser({...user,[e.target.name]:e.target.value})
        console.log(user)
    }
    const postData=()=>{
        axios.post("https://jsonplaceholder.typicode.com/posts",user)
        .then((a)=>{
            console.log(a.data);                
        })
        .catch((err)=>{
            console.log(err)
        });
    };
  return (
    <div>
      <label>Name</label>
      <input type='text' name='Name' onChange={handleChange}></input><br></br><br></br>
      <label>Age</label>
      <input type='text' name='Age'  onChange={handleChange}></input><br></br><br></br>
      <button type='submit' onClick={postData}>Submit</button>
    </div>
  )
}

export default Post
