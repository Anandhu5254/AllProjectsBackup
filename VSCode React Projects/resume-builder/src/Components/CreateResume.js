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
      <h1 style={{textAlign:"center",padding:"20"}}>Create Your Resume</h1>
      <div style={{marginLeft:"20px"}}>
        <h2>Personal Details</h2>
        <input style={{width:"98%", marginBlock:"5px"}}
            type="text"
            placeholder="Name"
            value={name}
            onChange={(e)=>setName(e.target.value)}
        />
         <input style={{width:"98%",marginBlock:"5px"}}
            type="email"
            placeholder="Email"
            value={email}
            onChange={(e)=>setEmail(e.target.value)}
        />
         <input style={{width:"98%",marginBlock:"5px"}}
            type="number"
            placeholder="Phone"
            value={phone}
            onChange={(e)=>setPhone(e.target.value)}
        />
        <h2>Education</h2>
        {education.map((edu,index)=>(
          <div key={index}>
            <input style={{width:"98%",marginBlock:"5px"}}
                type="text"
                placeholder="Degree"
                value={edu.degree}
                onChange={(e)=>{
                  const newEdu=[...education]
                  newEdu[index].degree=e.target.value
                  setEducation(newEdu);
                }}
            />
            <input style={{width:"98%",marginBlock:"5px"}}
                type="text"
                placeholder="Institution"
                value={edu.institution}
                onChange={(e)=>{
                  const newEdu=[...education]
                  newEdu[index].institution=e.target.value
                  setEducation(newEdu);
                }}
            />
            <input style={{width:"98%",marginBlock:"5px"}}
                type="number"
                placeholder="Year"
                value={edu.year}
                onChange={(e)=>{
                  const newEdu=[...education]
                  newEdu[index].year=e.target.value
                  setEducation(newEdu);
                }}
            />
          </div>
        ))}
            <button onClick={addEducation}>Add Education</button>
            <h2>Work Experience</h2>
            {experience.map((exp,index)=>(
              <div key={index}>
                <input style={{width:"98%",marginBlock:"5px"}}
                    type="text"
                    placeholder="Company"
                    value={exp.company}
                    onChange={(e)=>{
                      const newExp=[...experience]
                      newExp[index].company=e.target.value
                      setExperience(newExp);
                    }}
                />
                <input style={{width:"98%",marginBlock:"5px"}}
                    type="text"
                    placeholder="Position"
                    value={exp.position}
                    onChange={(e)=>{
                      const newExp=[...experience]
                      newExp[index].position=e.target.value
                      setExperience(newExp);
                    }}
                />
                <input style={{width:"98%",marginBlock:"5px"}}
                    type="text"
                    placeholder="Duration"
                    value={exp.duration}
                    onChange={(e)=>{
                      const newExp=[...experience]
                      newExp[index].duration=e.target.value
                      setExperience(newExp);
                    }}
                />
              </div>
            ))}
            <button onClick={addExperience}>Add Experience</button>
      </div>
      <div style={{textAlign:"center"}}>
        <button onClick={handleSubmit} style={{padding:"10px 20px"}}>Preview</button>
      </div>
    </div>
  )
}

export default CreateResume
