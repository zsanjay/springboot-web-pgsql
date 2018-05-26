package com.websystique.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@Value("${nano:0}")
	private String nano;
	
	@RequestMapping("/")
	String home(ModelMap modal) {
		modal.addAttribute("title", "Spring Boot Web");
		modal.addAttribute("message", "NANO is " + nano);
		return "hello";
	}
}
