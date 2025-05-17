import React, { useContext, useState } from "react";
import { Status } from "./FormProvider";
import { useNavigate } from "react-router-dom";

function FormComponent() {
  const { setFormdata } = useContext(Status);
  const [inputvalue, setInputValue] = useState({ name: "", age: "" });
  const navigate = useNavigate();

  const handleSubmit = (e) => {
    e.preventDefault();
    console.log(inputvalue);
    setFormdata(inputvalue);
    navigate("/formdata");
  };
  const show = (e) => {
    setInputValue({ ...inputvalue, [e.target.name]: e.target.value });
  };

  return (
    <div>
      <form onSubmit={handleSubmit}>
        <label>Enter Name</label>
        <input type="text" name="name" onChange={show}></input>
        <label> Enter Age</label>
        <input type="number" name="age" onChange={show}></input>

        <button type="submit">SUBMIT</button>
      </form>
    </div>
  );
}

export default FormComponent;
