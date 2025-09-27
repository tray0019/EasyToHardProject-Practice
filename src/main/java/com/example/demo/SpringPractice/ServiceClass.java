package com.example.demo.SpringPractice;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class ServiceClass {

    private final List<ModelClass> users = new CopyOnWriteArrayList<>();

    public void add(ModelClass user){
        users.add(user);
    }

    public List<ModelClass> findAll(){
        return users;
    }

    public void clear(){
        users.clear();
    }

}
