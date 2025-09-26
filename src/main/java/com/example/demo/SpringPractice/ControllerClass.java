package com.example.demo.SpringPractice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerClass {

	@GetMapping("/")
	public String home(Model model) {
		
		ModelClass user = new ModelClass();
	
		
		return "View";
		
	}
	
}
