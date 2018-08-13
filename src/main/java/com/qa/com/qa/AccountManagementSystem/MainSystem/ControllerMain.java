package com.qa.com.qa.AccountManagementSystem.MainSystem;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.qa.com.qa.AccountManagementSystem.Model.User;

@Controller
public class ControllerMain {

	
	@Autowired
	private AccountService accountService;
	
	@GetMapping("/")
	public String init(HttpServletRequest req) {
		req.setAttribute("users", accountService.findAllUser());
		req.setAttribute("mode", "USER_VIEW");
		return "index";
	}
	
	@GetMapping("/updateUser")
	public String init(@RequestParam long id, HttpServletRequest req) {
		req.setAttribute("user", accountService.findOne(id));
		req.setAttribute("mode", "USER_EDIT");
		return "index";
	}
	

	
	@PostMapping("/save")
	public void save(@ModelAttribute User user, HttpServletRequest req, HttpServletResponse resp) throws IOException {
		accountService.save(user);
		req.setAttribute("users", accountService.findAllUser());
		req.setAttribute("mode", "USER_VIEW");
		resp.sendRedirect("/");
	}
	
	@GetMapping("/newUser")
	public String newUser(HttpServletRequest req) {
		req.setAttribute("mode", "USER_NEW");
		return "index";
	}
	
	@GetMapping("/deleteUser")
	public void deleteUser(@RequestParam long id, HttpServletRequest req, HttpServletResponse resp) throws IOException {
		accountService.delete(id);
		req.setAttribute("users", accountService.findAllUser());
		req.setAttribute("mode", "USER_NEW");
		resp.sendRedirect("/");
	}
	
}
