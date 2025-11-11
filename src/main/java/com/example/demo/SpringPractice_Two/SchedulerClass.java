package com.example.demo.SpringPractice_Two;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
class SchedulerClass{

    private ServiceClass service;


    SchedulerClass(ServiceClass service){
        this.service = service;
    }


    @Scheduled(fixedRate = 100)
    public void checkUserCount(){
        long count = service.getAllUser().size();
        System.out.println("Get user: "+ count);
    }

    @Scheduled(fixedRate = 100)
    public void autoAddUser(){
        ModelClass newUser = new ModelClass();

        int num = 1;

        newUser.setName("Man "+num);
        newUser.setAge((int)(Math.random()*40+20));

        service.addUser(newUser);
        System.out.println("Added new user automatically: "+ newUser.getName());

        num++;

    }




}

















/*
package com.example.demo.SpringPractice_Two;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerClass {

    private final ServiceClass service;

    public SchedulerClass(ServiceClass service){
        this.service = service;
    }

    @Scheduled(fixedRate = 10000)
    public void checkUserCount(){
        long count = service.getAllUser().size();
        System.out.println("Current numnber of users: "+count);

    }

    @Scheduled(fixedRate = 15000)
    public void autoAddUser(){
        ModelClass newUser = new ModelClass();
        newUser.setName("AutoName");
        newUser.setAge((int)(Math.random() * 40 + 20));
        service.addUser(newUser);
        System.out.println("Added new user automatically: "+ newUser.getName());

    }



}
*/