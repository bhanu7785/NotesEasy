package com.notes.easy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.notes.easy.entity.Course;
import com.notes.easy.helper.FileUploadHelper;
import com.notes.easy.service.CourseService;

@RestController
public class CourseController {
	
	
	@Autowired
	private CourseService courseService;
	@Autowired
	private FileUploadHelper fileUploadHelper;
	
	
	//Extracting all courses
	@GetMapping("/courses")
	public List<Course> getAllCourses() {
		
		return courseService.getAllCourses();
		
	}
	
	//Extracting one course from id
	@GetMapping("/courses/{cid}")
	public Course getCourseById(@PathVariable("cid") long cid) {
		
		return courseService.getCourseById(cid);
		
	}
	
	//adding course to courses list
	@PostMapping("/courses")
	public Course addCourseById (@RequestBody Course course) {
		
		return courseService.addCourse(course);
	}
	
	//deleting courses using courseid
	@DeleteMapping("/courses/{cid}")
	public void deleteCourseById(@PathVariable("cid") int cid) {
		 courseService.deleteCourse(cid);
	}
	
	//updting course calue by course id
	@PutMapping("/courses")
	public Course updateCourseById(@PathVariable("cid") long cid,@RequestBody Course course) {
		
		return courseService.updateCourseById(cid,course);
	}
	
	@PostMapping("/upload")
	public ResponseEntity<?> uploadingFile(@RequestParam MultipartFile file){
		
		if(file.isEmpty()) {
			ResponseEntity.ok("File is Empty !! Pleaseupload file");
		}
		
		boolean uploadFilestatus = fileUploadHelper.uploadFile(file);
		if(uploadFilestatus) {
			System.out.println("File uploaded Successfully");
		}
		return ResponseEntity.ok("successfully uploaded");
	}
	

}
