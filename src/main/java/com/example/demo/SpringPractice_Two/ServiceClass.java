package com.example.demo.SpringPractice_Two;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
class ServiceClass{

    private final RepositoryInterface repo;

    ServiceClass(RepositoryInterface repo){
        this.repo = repo;
    }

    public List<ModelClass> getAllUser(){
        return repo.findAll();
    }

    public ModelClass addUser(ModelClass user){
        return repo.save(user);
    }

    public void deleteAllUser(){
        repo.deleteAll();
    }


}