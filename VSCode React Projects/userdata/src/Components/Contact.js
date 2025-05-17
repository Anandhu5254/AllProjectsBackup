import Col from 'react-bootstrap/Col';
import Container from 'react-bootstrap/Container';
import Image from 'react-bootstrap/Image';
import Row from 'react-bootstrap/Row';
// import mountain from './images/Mountain.jpg'
// import superman from './images/Superman.jpg'
import dalia from './images/dalia.jpg'
import Navbar1 from './Navbar1';


function Contact() {
  return (
    <div>
        <Navbar1/>
    <Container>
      <Row>
        <Col xs={6} md={4}>
          <Image src={dalia} rounded />
        </Col>
        <Col xs={6} md={4}>
          <Image src={dalia} roundedCircle />
        </Col>
        <Col xs={6} md={4}>
          <Image src={dalia} thumbnail />
        </Col>
      </Row>
    </Container>
    </div>
  );
}

export default Contact;