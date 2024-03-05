package com.learnspringboot.LearnWeb.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnspringboot.LearnWeb.DAO.CourseClassDAO;
import com.learnspringboot.LearnWeb.Entity.CourseClass;

@Service
public class CourseClassService {
	
	@Autowired
	private CourseClassDAO courseClassDAO;
	
	public List<CourseClass> getAllCourseClass() {
		return courseClassDAO.getAllCourseClass();
	}
}
