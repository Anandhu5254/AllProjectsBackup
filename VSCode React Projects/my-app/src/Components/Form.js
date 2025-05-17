import React,{useState} from 'react'

function Form() {
    const [login,setLogin]=useState(false)
     const [user, setUSer] = useState({
        Name: "",
        Password: "",
        Email:""
      })
      const[show,setShow]=useState(null);
    
      const Details=(e)=>{
        setUSer({...user,[e.target.name]: e.target.value});
        console.log(user);
        
    }
    const post = () => {
        setLogin(!login);
        if (!login) {
            setShow({
            Name: user.Name,
            Password: user.Password,
            Email: user.Email
          
          });
        }
      };
   
  return (
    <div>
      <label>name</label>
      <input type="text" name="Name"  onChange={Details}></input><br></br>
      <label>password</label>
      <input type="password" name="Password" onChange={Details}></input><br></br>
      <label>email</label>
      <input type="email" name="Email" onChange={Details}></input><br></br>

      <button type='button' onClick={post} > {login ? "logout":"login" }</button>

      {login===true? (
      <div>
       <h3>Submit data</h3>
          <p>Name: {show.Name}</p>
          <p>Email: {show.Email}</p>
          <p>Password: {show.Password}</p>
        </div>
      ):" "}
    </div>
  )
}

export default Form
