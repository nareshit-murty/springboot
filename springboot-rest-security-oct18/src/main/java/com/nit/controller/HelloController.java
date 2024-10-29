package com.nit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.model.Collecge;

@RestController
public class HelloController {

	@GetMapping("/")
	public Collecge getCollecge() {
		return new Collecge(1L,"JNTU","Kukatpally");
	}
}
