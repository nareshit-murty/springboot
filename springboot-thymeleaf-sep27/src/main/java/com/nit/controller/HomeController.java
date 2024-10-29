package com.nit.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nit.model.Student;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("header", "Employee Management System");
		List<String> languages = new ArrayList<>();
		languages.add("Java");
		languages.add("Python");
		languages.add("C#");
		languages.add(bute("languages", languages);
		model.addAttribute("students", getStudents());
		return "home";
	}"Node JS");
		model.addAttri
	
	private List<Student> getStudents(){
		List<Student> students = new ArrayList<>();
		for(long i=1;i<=5;i++) {
			Student st = new Student(i,"Kiran-"+i,"B.Tech","Hyderabad");
			students.add(st);
		}
		return students;
	}
	

	@RequestMapping(value = {"/registration","/happy"})
	public String registration(Model model) {
		model.addAttribute(new Student(1L,"Murty","B.Tech","Hyderabad"));
		return "student";
	}
	
	
	@RequestMapping("/saveStudent")
	public String saveStudent(@ModelAttribute Student st, Model model) {
		model.addAttribute("st", st);
		return "success";
	}
}
