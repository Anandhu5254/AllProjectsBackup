import { useLocation } from "react-router-dom";

function ResumePreview() {
  const location = useLocation();
  const { personal, education, experience } = location.state || {
    personal: {},
    education: [],
    experience: []
  };

  return (
    <div style={{ padding: "20px", maxWidth: "800px", margin: "0 auto" }}>
      <h1 style={{ textAlign: "center", borderBottom: "2px solid #333", paddingBottom: "10px" }}>
        {personal.name || "Your Name"}
      </h1>
      <div style={{ textAlign: "center", marginBottom: "20px" }}>
        <p>{personal.email}</p>
        <p>{personal.phone}</p>
      </div>

      <h2 style={{ borderBottom: "1px solid #333", paddingBottom: "5px" }}>Education</h2>
      {education.map((edu, index) => (
        <div key={index} style={{ marginBottom: "15px" }}>
          <h3>{edu.degree}</h3>
          <p>{edu.institution} - {edu.year}</p>
        </div>
      ))}

      <h2 style={{ borderBottom: "1px solid #333", paddingBottom: "5px" }}>Work Experience</h2>
      {experience.map((exp, index) => (
        <div key={index} style={{ marginBottom: "15px" }}>
          <h3>{exp.position}</h3>
          <p>{exp.company} | {exp.duration}</p>
        </div>
      ))}
    </div>
  );
}

export default ResumePreview;
