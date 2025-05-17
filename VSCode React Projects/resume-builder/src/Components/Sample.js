import { useState } from "react";
import { useNavigate } from "react-router-dom";

import React from 'react'

function CreateResume() {

  const navigate=useNavigate();
  const[name,setName]=useState("");
  const[email,setEmail]=useState("");
  const[phone,setPhone]=useState("");
  const[education,setEducation]=useState([{degree:"",institution:"",year:""}]);
  const[experience,setExperience]=useState([{company:"",position:"",duration:""}]);

  const addEducation=()=>{
    setEducation([...education,{degree:"",institution:"",year:""}])
  }
  const addExperience=()=>{
    setExperience([...experience,{company:"",position:"",duration:""}])
  }

  const handleSubmit=()=>{
    const resumeData={
      personal:{name,email,phone},
      education,
      experience
    }
    navigate("/preview",{state:resumeData});
  }
  return (
    <div>
      <h2 style={{textAlign:"center",padding:20}}>Create Your Resume</h2>
      <div style={{marginLeft:20}}>
      <h3>Personal Info</h3>
      <input
           type="text"
           placeholder="Enter Name"
           value={name}
           onChange={(e)=>setName(e.target.value)}
           style={{width:"98%"}}
      /><br></br><br></br>
      <input
           type="email"
           placeholder="Enter Email"
           value={email}
           onChange={(e)=>setEmail(e.target.value)}
           style={{width:"98%"}}
      /><br></br><br></br>
      <input
           type="number"
           placeholder="Enter phone"
           value={phone}
           onChange={(e)=>setPhone(e.target.value)}
           style={{width:"98%"}}
      /><br></br><br></br>
      <h3>Education</h3>
      {education.map((edu,index)=>(
        <div key={index}>
          <input style={{width:"98%"}}
              type="text"
              placeholder="degree"
              value={edu.degree}
              onChange={(e)=>{
                const newEdu={...education};
                newEdu[index].degree=e.target.value
                setEducation(newEdu);
              }}          
          /><br></br><br></br>
          <input style={{width:"98%"}}
              type="text"
              placeholder="Institution"
              value={edu.institution}
              onChange={(e)=>{
                const newEdu={...education};
                newEdu[index].institution=e.target.value
                setEducation(newEdu);
              }}          
          /><br></br><br></br>
          <input style={{width:"98%"}}
              type="number"
              placeholder="Year"
              value={edu.year}
              onChange={(e)=>{
                const newEdu={...education};
                newEdu[index].year=e.target.value
                setEducation(newEdu);
              }}          
          /><br></br><br></br>
        </div>
      ))}
     <button onClick={addEducation}>Add Education</button>
     
      <h3>Experiences</h3>
      {experience.map((exp,index)=>(
        <div key={index}>
          <input style={{width:"98%"}}
              type="text"
              placeholder="Company"
              value={exp.company}
              onChange={(e)=>{
                const newExp={...experience}
                newExp[index].company=e.target.value
                setExperience(newExp)
              }}
          /><br></br><br></br>
          <input style={{width:"98%"}}
              type="text"
              placeholder="Position"
              value={exp.position}
              onChange={(e)=>{
                const newExp={...experience}
                newExp[index].position=e.target.value
                setExperience(newExp)
              }}
          /><br></br><br></br>
          <input style={{width:"98%"}}
              type="text"
              placeholder="Duration"
              value={exp.duration}
              onChange={(e)=>{
                const newExp={...experience}
                newExp[index].duration=e.target.value
                setExperience(newExp)
              }}
          /><br></br><br></br>
        </div>
      ))}
      <button onClick={addExperience}>Add Experience</button><br></br><br></br>
      </div>
      <div style={{textAlign:"center"}}>
      <button onClick={handleSubmit} style={{padding:"10px 20px"}}>Preview Resume</button>
      </div>
    </div>
  )
}

export default CreateResume

