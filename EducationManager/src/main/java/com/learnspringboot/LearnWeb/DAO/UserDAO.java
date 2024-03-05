package com.learnspringboot.LearnWeb.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learnspringboot.LearnWeb.Entity.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
public class UserDAO {
	
	@Autowired
	private EntityManager entityManager;
	
	public User getUserByAccount(String name) {
		TypedQuery<User> sql = entityManager.createQuery("SELECT u FROM User u WHERE u.username = :name", User.class);
		sql.setParameter("name", name);
		return sql.getSingleResult();
	}
	
	public List<User> getAllUser() {
		TypedQuery<User> sql = entityManager.createQuery("SELECT u FROM User u", User.class);
		return sql.getResultList();
	}
	
	@Transactional
	public void saveUser(User user) {
		entityManager.merge(user);
	}
	
	
	
}
