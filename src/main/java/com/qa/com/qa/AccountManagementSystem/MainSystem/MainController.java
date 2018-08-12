package com.qa.com.qa.AccountManagementSystem.MainSystem;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.com.qa.AccountManagementSystem.Model.User;

@RestController
public class MainController {
	
	@Autowired
	private AccountService accountService;
	
	@RequestMapping(value ="/h")
	public String home() {
		return "Hello Wordddld!22";
	}
	
	@RequestMapping(value ="/all")
	public Collection<User> getAllUser() {
		return accountService.findAllUser();
	}
	
	@GetMapping(value ="/ho")
	public String homee() {
		return "index";
	}
	

}
