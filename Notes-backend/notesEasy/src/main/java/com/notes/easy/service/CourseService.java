package com.notes.easy.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.notes.easy.entity.Course;

@Service
public interface CourseService {
	
	public List<Course> getAllCourses();
	
	public Course getCourseById(long courseId);
	
	public Course addCourse(Course course);
	
	public  void deleteCourse(long cid);
	
	public Course updateCourseById(long courseId,Course course);

}
