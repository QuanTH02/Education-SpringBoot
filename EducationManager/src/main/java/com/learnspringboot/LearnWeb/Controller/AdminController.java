package com.learnspringboot.LearnWeb.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learnspringboot.LearnWeb.Entity.User;
import com.learnspringboot.LearnWeb.Service.AdminService;

@Controller
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@PutMapping("/api/update/user")
	public ResponseEntity<User> changeAccount(@RequestParam("username") String username, @RequestParam("ho") String ho, @RequestParam("ten") String ten, @RequestParam("newusername") String newusername, @RequestParam("password") String password) {
		User user = adminService.changeAccount(username, ho, ten, newusername, password);
		
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
}
