package com.learnspringboot.LearnWeb.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learnspringboot.LearnWeb.Entity.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
public class CourseDAO {
	
	@Autowired
	private EntityManager entityManager;
	
	public List<Course> getAllCourse() {
		TypedQuery<Course> sql = entityManager.createQuery("SELECT c FROM Course c", Course.class);
		return sql.getResultList();
	}
	
	public Course getCourseBymaHocPhan(String maHocPhan) {
		TypedQuery<Course> sql = entityManager.createQuery("SELECT c FROM Course c WHERE c.maHocPhan = :maHocPhan", Course.class);
		sql.setParameter("maHocPhan", maHocPhan);
		return sql.getSingleResult();
	}
	
	@Transactional
	public Course saveCource(String maHocPhan, String tenHocPhan, Float trongSo, Integer soTinHocPhan, Integer soTinHocPhi, Long soLuongDangKy) {
		Course course = new Course(maHocPhan, tenHocPhan, trongSo, soTinHocPhan, soTinHocPhi, soLuongDangKy);
		entityManager.merge(course);
		return course;
	}
	
	@Transactional
	public Course removeCourse(String maHocPhan) {
		Course course = getCourseBymaHocPhan(maHocPhan);
		
		if (course != null) {
			entityManager.remove(course);
		}
		
		return course;
	}
	
	
}
