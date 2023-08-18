package com.springrest.courseapplication.services;

import java.util.List;

import com.springrest.courseapplication.entities.Course;

public interface CourseService {

	public List<Course> getCourses();
	public Course getCourse(long courseId);
	public Course addCourse(Course course);
	public Course updateCourse(Course course);
	public Course deleteCourse(long courseId);
	public void deleteAllCourses();
}
