package com.nit.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("today", new Date());
		return "index";
	}
	
	@RequestMapping("/hello")
	public String hello(Model model) {
		return "hello";
	}
}
