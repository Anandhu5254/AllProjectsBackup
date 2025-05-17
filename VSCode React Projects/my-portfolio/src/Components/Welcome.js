import React from 'react'
import Navbar1 from './Navbar1'
import "./Welcome.css"
import "./Style.css"

import profileImage from "../Images/IMG_4273.JPG"
function Welcome() {
  return (
    <div>
          <Navbar1/>
          <img src={profileImage} alt="Anandhu S" className="profile-image" />
   <section id="welcome" >
    <b><h1>Hello,I'm Anandhu S</h1></b>
     <i><p>Aspiring Java Full Stack Developer</p></i>
     
   </section>
   </div>
  )
}

export default Welcome
