package com.learnspringboot.LearnWeb.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnspringboot.LearnWeb.DAO.CourseDAO;
import com.learnspringboot.LearnWeb.Entity.Course;

@Service
public class CourseService {
	
	@Autowired
	private CourseDAO courseDAO;
	
	public List<Course> getAllCourse() {
		return courseDAO.getAllCourse();
	}
	
	public Course getCourseBymaHocPhan(String maHocPhan) {
		Course course = courseDAO.getCourseBymaHocPhan(maHocPhan);
		return course;
	}
	
	public Course saveCourse(String maHocPhan, String tenHocPhan, Float trongSo, Integer soTinHocPhan, Integer soTinHocPhi, Long soLuongDangKy) {
		Course course = courseDAO.saveCource(maHocPhan, tenHocPhan, trongSo, soTinHocPhan, soTinHocPhi, soLuongDangKy);
		return course;
	}
	
	public Course removeCourse(String maHocPhan) {
		Course course = courseDAO.removeCourse(maHocPhan);
		return course;
	}
	
	public Course putCourse(String maHocPhan, String maHocPhanMoi, String tenHocPhan, Float trongSo, Integer soTinHocPhan, Integer soTinHocPhi, Long soLuongDangKy) {
		Course course = courseDAO.getCourseBymaHocPhan(maHocPhan);
		
		if (course != null) {
			course.setMaHocPhan(maHocPhanMoi);
			course.setTenHocPhan(tenHocPhan);
			course.setTrongSo(trongSo);
			course.setSoTinHocPhan(soTinHocPhan);
			course.setSoTinHocPhi(soTinHocPhi);
			course.setSoLuongDangKy(soLuongDangKy);
			
			courseDAO.saveCource(maHocPhanMoi, tenHocPhan, trongSo, soTinHocPhan, soTinHocPhi, soLuongDangKy);
		}
		return course;
	}
}
