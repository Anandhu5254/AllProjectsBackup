import { useNavigate } from "react-router-dom";

function Home() {
  const navigate = useNavigate();

  return (
    <div style={{ textAlign: "center", padding: "20px" }}>
      <h1>Welcome to Resume Builder</h1>
      <p>Create your professional resume in minutes.</p>
      <button onClick={() => navigate("/create")}>Create Resume</button>
    </div>
  );
}

export default Home;