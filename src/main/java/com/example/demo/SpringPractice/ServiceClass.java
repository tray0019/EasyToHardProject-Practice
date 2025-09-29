package com.example.demo.SpringPractice;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class ServiceClass {

    private final RepositoryInterface repo;

    public ServiceClass(RepositoryInterface repo) {
        this.repo = repo;
    }

    public void add(ModelClass user){
        repo.save(user);
    }

    public List<ModelClass> findAll(){
        return repo.findAll();
    }

    public void deleteAll(){
        repo.deleteAll();
    }

}
