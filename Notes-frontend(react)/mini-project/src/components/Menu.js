import React, { Fragment } from 'react';
import { Link } from 'react-router-dom';
import { ListGroup, ListGroupItem } from 'reactstrap';

function Menu(){
    return (

        <Fragment>
            <ListGroup>
                <Link class="list-group-item list-group"  tag="a" to="/" action>Home</Link>
                <Link class="list-group-item list-group" tag="a" to="/add-course" action>Add Course</Link>
                <Link class="list-group-item list-group" tag="a" to="/view-course" action>View Courses</Link>
                <Link class="list-group-item list-group" tag="a" to="#!" action>About</Link>
                <Link class="list-group-item list-group" tag="a" to="#!" action>Contact</Link>
            </ListGroup>
        </Fragment>
    );

}

export default Menu;