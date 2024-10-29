package com.nit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.model.Employee;

@RestController
public class HelloController {

	
	@GetMapping("/sayHello")
	public String sayhello() {
		return "How are you ?";
	}
	
	@GetMapping("/displayEmployee")
	public Employee displayEmployee() {
		return new Employee(1L, "Murty", "KPHB", 50000D);
	}
}
