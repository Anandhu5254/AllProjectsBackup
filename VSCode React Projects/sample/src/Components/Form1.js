import React,{useState}from 'react'

function Form1() {
  // const[name,setName]=useState('');
     // const[email,setEmail]=useState('');
     // const[password,setPassword]=useState('');
     const[newform,setNewform]=useState({
         name:"",
         email:"",
         password:""
     })
 
     const Fun=(e)=>{
         setNewform({...newform,[e.target.name]:e.target.value})
         // console.log({...newform,[e.target.name]:e.target.value})
     }
     const Show=()=>{
         console.log(newform);   
     }
 
 // const Fun=(e)=>{
 //     setName(e.target.value)
 // }
 // alert(name)
 // const Fun1=(e)=>{
 //     setEmail(e.target.value)
 // }
 // const Fun2=(e)=>{
 //     setPassword(e.target.value)
 // }
 
   return (
     <div>
     <form>
     <label>Name</label>
     <input type="text" name="name" onChange={Fun}></input><br></br><br></br>
     <label>Email</label>
     <input type="email" name="email" onChange={Fun}></input><br></br><br></br>
     <label>Password</label>
     <input type="text" name="password" onChange={Fun}></input><br></br><br></br>
     <button type="button" onClick={Show}>Submit</button>
     </form>
     </div>
   )
 }
export default Form1
