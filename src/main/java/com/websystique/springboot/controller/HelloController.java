package com.websystique.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@Value("${appz.image_version:0.0.0}")
	private String version;
	
	@Value("${title:0}")
	private String title;

	@Value("${nano:0}")
	private String nano;
	
	@RequestMapping("/")
	String home(ModelMap modal) {
		modal.addAttribute("title", title + " " + version);
		modal.addAttribute("message", "NANO is " + nano);
		return "hello";
	}
}
