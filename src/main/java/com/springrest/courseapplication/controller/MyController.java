package com.springrest.courseapplication.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.PutExchange;

import com.springrest.courseapplication.entities.Course;
import com.springrest.courseapplication.services.CourseService;


@RestController //to tell the project it is controller
  				//It is  a combination of @response body and @controller
public class MyController {

	@Autowired
	private CourseService courseService;
	@GetMapping("/home")
	public String home() {
		return "This is my home page";
	}
	
	@RequestMapping(path="/courses" , method= RequestMethod.GET)
//	@GetMapping("/courses")
	public List<Course> getCourses(){
		return this.courseService.getCourses();
	}
	
	
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping(path="/courses" , consumes="application/json")
	public Course addCourse(@RequestBody Course course) {
		return this.courseService.addCourse(course);
	}
	
	@PutMapping("/courses/{id}")
	public Course updateCourse(@RequestBody Course course) {
		return this.courseService.updateCourse(course);	
	}
	
	@DeleteMapping("/courses/{courseId}")
	public Course deleteCourse(@PathVariable String courseId) {
		return this.courseService.deleteCourse(Long.parseLong(courseId));
	}
	
	@DeleteMapping("/courses")
	public void deleteAllCourses() {
		 this.courseService.deleteAllCourses();
	}
}
