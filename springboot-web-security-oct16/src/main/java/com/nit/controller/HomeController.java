package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/murty")
	public String murty() {
		return "murty";
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
}
