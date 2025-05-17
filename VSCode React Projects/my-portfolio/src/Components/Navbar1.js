import React from "react";
import "./Navbar1.css"
import { Link } from "react-router-dom";

function Navbar1() {
  return (
    <header >
      <ul>
        <li><Link to='/welcome'>Welcome</Link></li>
        <li><Link to='/about'>About</Link></li>
        <li><Link to='/projects'>Projects</Link></li>
        <li><Link to='/contact'>Contact</Link></li>
        <li><Link to='/resume'>Resume</Link></li>

      </ul>
    </header>
  );
}

export default Navbar1;