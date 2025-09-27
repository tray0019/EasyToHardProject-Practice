package com.example.demo.SpringPractice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControllerClass {

	private final ServiceClass serviceClass;

    public ControllerClass(ServiceClass serviceClass) {
        this.serviceClass = serviceClass;
    }

    @GetMapping("/")
	public String showFormAndList(Model model) {
		ModelClass user = new ModelClass();
		model.addAttribute("user", user);//ModelClass is user here
		model.addAttribute("users",serviceClass.findAll());
		return "View";
	}

	@PostMapping("/submit")
	public String submitForm(@ModelAttribute ModelClass user, Model model){
		serviceClass.add(user);
		return "redirect:/";
	}

	@PostMapping("/clear")
	public String clearAll(){
		serviceClass.clear();
		return "redirect:/";
	}
	
}
