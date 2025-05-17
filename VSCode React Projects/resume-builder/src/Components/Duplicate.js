import { useState } from "react";
import { useNavigate } from "react-router-dom";

function CreateResume() {
  const navigate = useNavigate();
  const [name, setName] = useState("");
  const [email, setEmail] = useState("");
  const [phone, setPhone] = useState("");
  const [education, setEducation] = useState([{ degree: "", institution: "", year: "" }]);
  const [experience, setExperience] = useState([{ company: "", position: "", duration: "" }]);

  const addEducation = () => {
    setEducation([...education, { degree: "", institution: "", year: "" }]);
  };

  const addExperience = () => {
    setExperience([...experience, { company: "", position: "", duration: "" }]);
  };

  const handleSubmit = () => {
    const resumeData = {
      personal: { name, email, phone },
      education,
      experience
    };
    navigate("/preview", { state: resumeData });
  };

  return (
    <div style={{ padding: "20px" }}>
      <h2 style={{ textAlign: "center" }}>Create Your Resume</h2>
      
      <h3>Personal Details</h3>
      <input
        type="text"
        placeholder="Full Name"
        value={name}
        onChange={(e) => setName(e.target.value)}
        style={{ width: "100%", marginBottom: "10px" }}
      />
      <input
        type="email"
        placeholder="Email"
        value={email}
        onChange={(e) => setEmail(e.target.value)}
        style={{ width: "100%", marginBottom: "10px" }}
      />
      <input
        type="tel"
        placeholder="Phone"
        value={phone}
        onChange={(e) => setPhone(e.target.value)}
        style={{ width: "100%", marginBottom: "20px" }}
      />

      <h3>Education</h3>
      {education.map((edu, index) => (
        <div key={index} style={{ marginBottom: "15px" }}>
          <input
            type="text"
            placeholder="Degree"
            value={edu.degree}
            onChange={(e) => {
              const newEdu = [...education];
              newEdu[index].degree = e.target.value;
              setEducation(newEdu);
            }}
            style={{ width: "100%", marginBottom: "5px" }}
          />
          <input
            type="text"
            placeholder="Institution"
            value={edu.institution}
            onChange={(e) => {
              const newEdu = [...education];
              newEdu[index].institution = e.target.value;
              setEducation(newEdu);
            }}
            style={{ width: "100%", marginBottom: "5px" }}
          />
          <input
            type="text"
            placeholder="Year"
            value={edu.year}
            onChange={(e) => {
              const newEdu = [...education];
              newEdu[index].year = e.target.value;
              setEducation(newEdu);
            }}
            style={{ width: "100%", marginBottom: "10px" }}
          />
        </div>
      ))}
      <button onClick={addEducation} style={{ marginBottom: "20px" }}>Add Education</button>

      <h3>Work Experience</h3>
      {experience.map((exp, index) => (
        <div key={index} style={{ marginBottom: "15px" }}>
          <input
            type="text"
            placeholder="Company"
            value={exp.company}
            onChange={(e) => {
              const newExp = [...experience];
              newExp[index].company = e.target.value;
              setExperience(newExp);
            }}
            style={{ width: "100%", marginBottom: "5px" }}
          />
          <input
            type="text"
            placeholder="Position"
            value={exp.position}
            onChange={(e) => {
              const newExp = [...experience];
              newExp[index].position = e.target.value;
              setExperience(newExp);
            }}
            style={{ width: "100%", marginBottom: "5px" }}
          />
          <input
            type="text"
            placeholder="Duration"
            value={exp.duration}
            onChange={(e) => {
              const newExp = [...experience];
              newExp[index].duration = e.target.value;
              setExperience(newExp);
            }}
            style={{ width: "100%", marginBottom: "10px" }}
          />
        </div>
      ))}
      <button onClick={addExperience} style={{ marginBottom: "20px" }}>Add Experience</button>

      <div style={{ textAlign: "center" }}>
        <button onClick={handleSubmit} style={{ padding: "10px 20px" }}>Preview Resume</button>
      </div>
    </div>
  );
}

export default CreateResume;