package com.myjavaapi.myjavarestapi;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class CourseController {
	// courses: Course: id, name, author
	// /courses
	// Go to this link browser: http://localhost:8080/courses
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses() {
		return Arrays.asList(
				new Course(1, "Learning JAVA SPring Boot", "noOne"),
				new Course(1, "Learning AWS", "noOne")
				);
	}

}
