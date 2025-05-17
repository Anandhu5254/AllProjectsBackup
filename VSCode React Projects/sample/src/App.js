import './App.css';
import NavbarEx from './Components/NavbarEx';
import Home from './Components/Home';
import Card1 from './Components/Card'
import Test from './Components/Test';
import Form1 from './Components/Form1';
import { useEffect, useState } from 'react';
function App() {
  const [name, setName] = useState("anand")
  const [id, setId] = useState(111)
  const[fruits,setFruits] =useState(["Mango","Cherry","Guava"])
  const[worker,setWorker]=useState({name:"Ajay",age:21})
  const[employee,setEmployee]=useState([{name:"Ajay",age:21},{name:"Deepa",age:28}])
  function Statechange() {  // Regular function
    setName("ajeena")

  }
  const Increment=()=>{   // Arrow function,mostly used
    setId(id+1)
  }
  const Decrement=()=>{
    setId(id-1)
  }
  const Reset=()=>{
    setId(111)
  }
  useEffect(()=>{console.log(id,'initial')
  return()=>{console.log(id,'unmount')}},[id])

  return (
    <div className="App">
      <header className="App-header">
        <h1>{name}</h1>
        <NavbarEx a={name} c={Statechange}/>
        <Home b={id}/>
        <h1>{id}</h1>
        <button onClick={Statechange} >changename</button>
        <button onClick={Increment} >Increment</button>
        <button onClick={Decrement} >Decerement</button>
        <button onClick={Reset} >Reset</button>
        <Test name="World" language="java"/>
        <Test name="React" language="python"/>
        <Test name="Javascript" language="c++"/>
        {
          fruits.map((data)=>(
            <h1>{data}</h1>
          )   )
        }
        <h4>worker name is {worker.name}</h4>
        <h4>worker name is {worker.age}</h4>
        {
          employee.map((employee)=>(
           <h3>employee name is {employee.name} and age is {employee.age}</h3>
          ))
        }
        <Form1/>



        <Card1 />

      </header>
    </div>
  );
}

export default App;
