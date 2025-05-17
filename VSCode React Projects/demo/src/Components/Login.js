import React from "react";
import './Login.css';
import Navbar1 from "./Navbar1";

function Login() {
  return (
    <div>
      <Navbar1/>
    <div className="firstbox">
      <div className="secondbox"></div>
      <div className="thirdbox">
        <form>
          <label className="login"><b>Login</b></label>
          <br />
          <br />
          
          <input className="mail" type="text" placeholder="Email ID" />
          <i className="fa-regular fa-envelope mailicon"></i>
          <br />
          <br />
          
          <input className="password" type="password" placeholder="Password" />
          <i className="fa-solid fa-lock" id="passicon"></i>
          <br />
          <br />
          
          <input className="check" type="checkbox" />
          <small><label className="a">Remember me</label></small>
          <br />
          
          <small><a className="b" href="/forgot-password">Forgot password?</a></small>
          <br />
          <br />
          
          <button className="logIn" type="submit">Login</button>
        </form>
        
        <small><a className="c" href="/register">Don't have an account? Register</a></small>
      </div>
    </div>
    </div>
  );
}

export default Login
