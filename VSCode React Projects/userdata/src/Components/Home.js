import Button from 'react-bootstrap/Button';
import Card from 'react-bootstrap/Card';
import mountain from './images/Mountain.jpg';
import Navbar1 from './Navbar1';

function Home() {
  return (
    <div>
        <Navbar1/>
    <Card style={{ width: '18rem' }}>
      <Card.Img variant="top" src={mountain} />
      <Card.Body>
        <Card.Title>Card Title</Card.Title>
        <Card.Text>
          Some quick example text to build on the card title and make up the
          bulk of the card's content.
        </Card.Text>
        <Button variant="primary">Go somewhere</Button>
      </Card.Body>
    </Card>
    </div>
  );
}

export default Home;