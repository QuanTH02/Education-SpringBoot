package com.learnspringboot.LearnWeb.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnspringboot.LearnWeb.DAO.UserDAO;
import com.learnspringboot.LearnWeb.Entity.User;

@Service
public class AdminService {
	
	@Autowired
	private UserDAO userDAO;
	
	public User changeAccount(String username, String ho, String ten, String newusername, String password) {
		User user = userDAO.getUserByAccount(username);
		if (user != null) {
			user.setHo(ho);
			user.setTen(ten);
			user.setUsername(newusername);
			user.setPassword(password);
		}
		
		userDAO.saveUser(user);
		return user;
	}
}
