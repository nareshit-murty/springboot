package com.nit.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/")
	public String showDate(Model model) {
		model.addAttribute("date", new Date());
		return "home";
	}
}
