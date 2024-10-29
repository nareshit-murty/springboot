package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.nit.model.PersonForm;

import jakarta.validation.Valid;

@Controller
public class HelloController {

	@GetMapping("/")
	public String home(PersonForm form) {
		return "home";
	}

	@PostMapping("/validate")
	public String checkPersonInfo(@Valid PersonForm personForm, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "home";
		}
		return "success";
	}
}
