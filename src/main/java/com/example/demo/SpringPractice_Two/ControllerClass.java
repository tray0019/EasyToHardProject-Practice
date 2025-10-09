package com.example.demo.SpringPractice_Two;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
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
    public String getAllUser(Model model){
        ModelClass user = new ModelClass();
        model.addAttribute("user",user);
        model.addAttribute("users",service.getAllUser());
        return "View";
    }

    @PostMapping("submit")
    public String addUser(ModelClass user){
        service.addUser(user);
        return "redirect:/";
    }

    @PostMapping("clear")
    public String delete(){
        service.deleteUser();
        return "redirect:/";
    }

}