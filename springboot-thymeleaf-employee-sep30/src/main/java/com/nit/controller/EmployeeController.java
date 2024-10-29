package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.nit.entity.Employee;
import com.nit.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(value = {"/","/home"})
	public String home(Model model) {
		model.addAttribute("employees", employeeService.getAllEmployees());
		return "home";
	}
	
	@GetMapping("/addEmployee")
	public String addEmployee(Model model) {
		model.addAttribute(new Employee());
		return "add_employee";
	}
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute Employee employee) {
		employeeService.saveEmployee(employee);
		return "redirect:/home";
	}
	
	@GetMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable("id") Long id) {
		employeeService.deleteEmployee(id);
		return "redirect:/home";
	}
}
