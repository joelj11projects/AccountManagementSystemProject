package com.qa.com.qa.AccountManagementSystem.MainSystem;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerMain {

	@GetMapping("/hello")
	public String init() {
		return "index";
	}
	
}
