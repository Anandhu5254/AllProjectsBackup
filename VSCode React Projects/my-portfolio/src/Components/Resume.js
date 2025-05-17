import React from 'react'
import resume from "../Files/Anandhu.pdf"
import Navbar1 from './Navbar1'
import './Resume.css'

function Resume() {
  return (
    <div>
        <Navbar1/>
      <section id="resume">
      <h1>My Portfolio</h1>
      <p>Welcome to my personal portfolio!</p>
      <button>
        <a href={resume} download="My_Resume.pdf" style={{ textDecoration: 'none', color: 'inherit' }}>
          Download My Resume
        </a>
      </button>
      </section> 
      </div>   
  )
}

export default Resume
