import logo from './logo.svg';
import './App.css';
import {Button, Col, Container, Row} from 'reactstrap';
import {ToastContainer, toast} from 'react-toastify';
import Home from './components/Home';
import Header from './components/Header';
import Course from './components/Course';
import AllCourse from './components/allCourses';
import AddCourse from './components/AddCourse';
import { Component } from 'react';
import Menu from './components/Menu';
import {BrowserRouter as Router,Route,Link} from 'react-router-dom';



function App() {

  return (
    <div>
     <Router>
     <Container>
        <Header />
        <Row>
          <Col md={4}><Menu /></Col>
          <Col md={8}>
            <Route path="/" component={Home} exact />
            <Route path="/add-course" component={AddCourse} exact />
            <Route path="/view-course" component={AllCourse} exact />

          </Col>
        </Row>
      </Container>
     </Router>
     
    </div>
  );
}

export default App;
