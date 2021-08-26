import React, { useEffect, useState } from "react";
import Course from "./Course";
import axios from "axios";
import base_url from "../api/bootapi";


const AllCourse =()=>{

    useEffect(()=>
    {
        document.title="All Courses || Notes"
        //loading all courses
        getAllCourse()
    },[]);

    //function to call allcourses server

    const getAllCourse =()=> {
       axios.get(`${base_url}/courses`).then(
           (response)=>{
                 console.log("sucess");
           },
           (error)=>{
            console.log("error");
           }
       )
    };

    const [courses,setCourses]=useState([])
    return (
      <div>
          <h1>
              All Courses.....
          </h1>
          <p>List of Corses are as follows</p>

          {
                 courses.length>0 ? courses.map((item) =>(
                    <Course key={item.id} course={item} />
                 )):"No Courses"

          }
      </div>
    );
}

export default AllCourse;