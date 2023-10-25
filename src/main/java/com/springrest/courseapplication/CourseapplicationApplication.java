package com.springrest.courseapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.SpringServletContainerInitializer;

@SpringBootApplication
//public class CourseapplicationApplication extends SpringServletContainerInitializer
public class CourseapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseapplicationApplication.class, args);
	}

}
