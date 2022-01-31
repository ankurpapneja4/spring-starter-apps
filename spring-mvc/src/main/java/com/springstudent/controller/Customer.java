package com.springstudent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Customer {
	
	@RequestMapping("/")
	public String showHomePage() {
		return "welcome";
	}
}
