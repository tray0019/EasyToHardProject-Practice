package com.example.demo.SpringPractice;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControllerClass {

	private final ServiceClass service;

    public ControllerClass(ServiceClass service) {
        this.service = service;
    }

    @GetMapping("/")
	public String showFormAndList(Model model) {
		ModelClass user = new ModelClass();
		model.addAttribute("user", user);//ModelClass is user here
		model.addAttribute("users",service.findAll());
		return "View";
	}

	@PostMapping("/submit")
	public String submitForm(@ModelAttribute ModelClass user, Model model){
		service.add(user);
		return "redirect:/";
	}

	@PostMapping("/clear")
	public String deleteAll(){
		service.deleteAll();
		return "redirect:/";
	}
	
}
