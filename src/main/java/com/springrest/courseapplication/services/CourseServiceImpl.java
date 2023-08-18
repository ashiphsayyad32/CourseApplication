package com.springrest.courseapplication.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.courseapplication.entities.Course;


@Service
public class CourseServiceImpl implements CourseService {

	
	List<Course> list;
	
	public CourseServiceImpl() {
		list = new ArrayList<Course>();
		list.add(new Course(129, "Java Course" , "Java Basics"));
		list.add(new Course(12, "Python Course" , "Python Basics"));
	}
	public List<Course> getCourses() {
		
		return list;
	}
	public Course getCourse(long courseId) {
		Course c =null;
		for(Course course:list) {
			if(course.getId() == courseId) {
				c = course;
				break;
			}
		}
		return c;
	}
	public Course addCourse(Course course) {
		
		list.add((course));
		return course;
	}
	public Course updateCourse(Course course) {
		for(Course course2:list) {
			if(course2.getId() == course.getId()) {
				list.set(list.indexOf(course2) , course);
				break;
			}
		}
		
		return course;
	}
	public Course deleteCourse(long courseId) {
		
		for(Course course2:list) {
			if(course2.getId() == courseId) {
				list.remove(list.indexOf(course2));
				break;
			}
		}
		return null;
	}
	

	public void deleteAllCourses() {
		list.clear();
		System.out.println("All courses deleted");
		
	}
}
