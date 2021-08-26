package com.notes.easy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notes.easy.dao.CourseDao;
import com.notes.easy.entity.Course;

@Service
public class CourseServiceImpl implements CourseService {
     
	@Autowired
	private CourseDao courseDao;
	
	@Override
	public List<Course> getAllCourses() {
	// TODO Auto-generated method stub
		List<Course> allCourses = courseDao.findAll();
		return allCourses;
	}



	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		
		Course addCourse = courseDao.save(course);
		
		return addCourse;
	}

	@Override
	public void deleteCourse(long cid) {
		// TODO Auto-generated method stub
		Course byId = courseDao.getById(cid);
		courseDao.delete(byId);
		
	}

	@Override
	public Course getCourseById(long courseId) {
		// TODO Auto-generated method stub
		Course course = courseDao.getById(courseId);
		
		return course;
	}



	@Override
	public Course updateCourseById(long courseId, Course course) {
		// TODO Auto-generated method stub
		Course courseById = courseDao.save(course);
		return courseById;
	}
	

}
