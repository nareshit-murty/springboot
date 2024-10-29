package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/showValues")
	public String showSalary() {
		return "salary";
	}
}
