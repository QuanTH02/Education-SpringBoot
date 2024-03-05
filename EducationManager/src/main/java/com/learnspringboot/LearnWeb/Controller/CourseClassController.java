package com.learnspringboot.LearnWeb.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.learnspringboot.LearnWeb.Entity.CourseClass;
import com.learnspringboot.LearnWeb.Service.CourseClassService;

@Controller
public class CourseClassController {
	
	@Autowired
	private CourseClassService courseClassService;
	
	@GetMapping("/api/view/allcourseclass")
	public ResponseEntity<List<CourseClass>> getAllCourseClass() {
		return new ResponseEntity<List<CourseClass>>(courseClassService.getAllCourseClass(), HttpStatus.OK);
	}
}
