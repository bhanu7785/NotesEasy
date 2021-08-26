import axios from 'axios';
import React, { useEffect, useState } from 'react';
import { Container, Form, FormGroup, Input } from 'reactstrap';
import { Button } from 'reactstrap';
import base_url from '../api/bootapi';

const AddCourse=()=>{
     useEffect(()=>
    {
        document.title="Add Courses || Notes";
        
    },[]);

    const [course,setCourses]=useState([]);

    //form handler function
     const handleForm =(e)=>{
      e.preventDefault();
     };

     //creating a function to add data to courses

     const postDatatoCourses =(data)=>{
       
        axios.post(`${base_url}/courses`).then(
           (response)=> {
           console.log("success")
            },
            (error) =>{
             console.log("failed")
            }
        )
     };

    return (
        <div>
            <h1 className="text-center">Fill Course Detail</h1>
            <Form onSubmit={handleForm}>
                <FormGroup>
                    <label for="courseId">Course Id</label>
                    <Input type="text" placeholder="Enter here" name="courseId" id="courseId"
                    onChange={(e)=>{
                    setCourses({...course,id:e.target.value});
                    }}
                    ></Input>
                </FormGroup>

                <FormGroup>
                    <label for="courseTitle">Course Title </label>
                    <Input type="text" placeholder="Enter here" name="courseTitle" id="courseTitle" 
                   onChange={(e)=>{
                       setCourses({...course,title:e.target.value});
                   }}
                   />
                </FormGroup>

                <FormGroup>
                    <label for="courseDesc">Course Description</label>
                    <Input type="textarea"  placeholder="Enter Details Here!!" name="courseDesc" 
                    id="courseDesc" onChange={(e)=>{
                    setCourses({...course,description:e.target.value})
                    }}/>
                </FormGroup>
              <Container className="text-center">
                < Button type="submit" color="success">AddCourse</Button>
                <Button color="warning ml-2">Clear</Button>
                </Container>
            </Form>

        </div>

    );
}
export default AddCourse;