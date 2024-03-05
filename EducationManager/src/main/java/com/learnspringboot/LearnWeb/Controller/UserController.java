package com.learnspringboot.LearnWeb.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.learnspringboot.LearnWeb.DAO.UserDAO;
import com.learnspringboot.LearnWeb.Entity.User;

@Controller
public class UserController {
	
	@Autowired
	private UserDAO userDAO;

	@GetMapping("api/view/account")
	public ResponseEntity<User> getUserByName(@RequestParam("account") String account) {
		return new ResponseEntity<User>(userDAO.getUserByAccount(account), HttpStatus.OK);
	}
	
	@GetMapping("/login")
	public String showLoginPage() {
		return "login";
	}
	
	@GetMapping("/home")
	public String showHomePage(Model model, RedirectAttributes redirectAttributes) {
//		User user = (User) redirectAttributes.getFlashAttributes().get("user");
//		model.addAttribute("role", user.getRole());
		return "home";
	}
	
	@PostMapping("/login")
	public String login(@RequestParam("account") String account, @RequestParam("password") String password, RedirectAttributes redirectAttributes) {
		User user = userDAO.getUserByAccount(account);
		
		if (user != null && user.getPassword().equals(password)) {
			redirectAttributes.addFlashAttribute("user", user);
			return "redirect:/home";
		} else {
			return "redirect:/login";
		}
	}
}
