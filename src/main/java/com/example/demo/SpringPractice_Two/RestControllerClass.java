package com.example.demo.SpringPractice_Two;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class RestControllerClass {

    private final ServiceClass service;

    RestControllerClass(ServiceClass service){
        this.service = service;
    }

    @GetMapping
    public List<ModelClass> getAllUser(){
        return service.getAllUser();
    }

    @PostMapping
    public ModelClass addUser(@RequestBody ModelClass user){
        return service.addUser(user);
    }


}
