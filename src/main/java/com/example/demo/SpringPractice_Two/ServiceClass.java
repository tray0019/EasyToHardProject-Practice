package com.example.demo.SpringPractice_Two;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
class ServiceClass{

    private final InterfaceRepository repo;

    ServiceClass(InterfaceRepository repo) {
        this.repo = repo;
    }

    public List<ModelClass> findAllUser(){
        return repo.findAll();
    }

    public ModelClass addUser(ModelClass user){
        return repo.save(user);
    }

    public void clearForm(){
        repo.deleteAll();
    }

}
