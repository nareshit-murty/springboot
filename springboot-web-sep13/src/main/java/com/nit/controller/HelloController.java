package com.nit.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/")
	public String sayHello() {
		return "index";
	}
	
	@RequestMapping("/showDate")
	public ModelAndView showDate(Model model) {
		ModelAndView mv = new ModelAndView("show_date","abc", "Murty");
		return mv;
	}
	
	
}
