package com.learnspringboot.LearnWeb.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learnspringboot.LearnWeb.Entity.CourseClass;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class CourseClassDAO {
	
	@Autowired
	private EntityManager entityManager;

	public List<CourseClass> getAllCourseClass() {
		TypedQuery<CourseClass> sql = entityManager.createQuery("SELECT c FROM CourseClass c", CourseClass.class);
		return sql.getResultList();
	}
}
