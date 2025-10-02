package com.example.demo.SpringPractice_Two;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
class ControllerClass{

    private ServiceClass service;

    ControllerClass(ServiceClass service){
        this.service = service;
    }

    @GetMapping("/")
    public String showForm(Model model){
        ModelClass user = new ModelClass();
        model.addAttribute("user",user);
        model.addAttribute("users",service.findAllUser());
        return "View";
    }

    @PostMapping("submit")
    public String addUser(ModelClass user){
        service.addUser(user);
        return "redirect:/";
    }

    @PostMapping("delete")
    public String clearForm(){
        service.clearForm();
        return "redirect:/";
    }





}
