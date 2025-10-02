package com.example.demo.SpringPractice;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControllerClass {

	/*
	- implement serviceclass
	- constructor dependency injection
	- showFormAndList
	- Submit form
	- deleteAll
	 */

	private final ServiceClass service;

    public ControllerClass(ServiceClass service) {
        this.service = service;
    }

	@GetMapping("/")
	public String showFormList(Model model){
		ModelClass user = new ModelClass();
		model.addAttribute("user",user);
		model.addAttribute("users",service.findAll());
		return "View";
	}

	@PostMapping("/submit")
	public String submit(@ModelAttribute ModelClass user){
		service.add(user);
		return "rediret:/";
	}

	@PostMapping("/clear")
	public String deleteAll(ModelClass user){
		service.clearForm();
		return "redirect:/";
	}


}
