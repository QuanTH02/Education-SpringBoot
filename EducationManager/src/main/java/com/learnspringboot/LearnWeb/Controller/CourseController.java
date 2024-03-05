package com.learnspringboot.LearnWeb.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learnspringboot.LearnWeb.Entity.Course;
import com.learnspringboot.LearnWeb.Service.CourseService;

@Controller
public class CourseController {
	
	@Autowired
	private CourseService courseService;

	@GetMapping("/api/view/allcourse")
	public ResponseEntity<List<Course>> getAllCourse() {
		return new ResponseEntity<List<Course>>(courseService.getAllCourse(), HttpStatus.OK);
	}
	
	@GetMapping("/api/view/course")
	public ResponseEntity<Course> getCourseBymaHocPhan(@RequestParam("maHocPhan") String maHocPhan) {
		return new ResponseEntity<Course>(courseService.getCourseBymaHocPhan(maHocPhan), HttpStatus.OK);
	}
	
	@PostMapping("/api/add/course")
	public ResponseEntity<Course> addCourse(@RequestParam("maHocPhan") String maHocPhan, @RequestParam("tenHocPhan") String tenHocPhanString, @RequestParam("trongSo") Float trongSo, @RequestParam("soTinHocPhan") Integer soTinHocPhan, @RequestParam("soTinHocPhi") Integer soTinHocPhi, @RequestParam("soLuongDangKy") Long soLuongDangKy) {
		Course course = courseService.saveCourse(maHocPhan, tenHocPhanString, trongSo, soTinHocPhan, soTinHocPhi, soLuongDangKy);
		return new ResponseEntity<Course>(course, HttpStatus.OK);
	}
	
	@DeleteMapping("/api/detele/course")
	public ResponseEntity<String> removeCourse(@RequestParam("maHocPhan") String maHocPhan) {
		Course course = courseService.removeCourse(maHocPhan);
		
		if (course != null) {
			return new ResponseEntity<>("Remove Successfully", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Remove Failed", HttpStatus.OK);
		}
	}
	
	@PutMapping("/api/put/course")
	public ResponseEntity<Course> putCourse(@RequestParam("maHocPhan") String maHocPhan, @RequestParam("maHocPhanMoi") String maHocPhanMoi, @RequestParam("tenHocPhan") String tenHocPhanString, @RequestParam("trongSo") Float trongSo, @RequestParam("soTinHocPhan") Integer soTinHocPhan, @RequestParam("soTinHocPhi") Integer soTinHocPhi, @RequestParam("soLuongDangKy") Long soLuongDangKy) {
		Course course = courseService.putCourse(maHocPhan, maHocPhanMoi, tenHocPhanString, trongSo, soTinHocPhan, soTinHocPhi, soLuongDangKy);
		return new ResponseEntity<Course>(course, HttpStatus.OK);
	}
}
