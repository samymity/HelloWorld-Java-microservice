package com.example.helloworld.service;

import com.example.helloworld.model.Greeting;
import com.example.helloworld.repository.GreetingRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingService {
    
    @Autowired
    private GreetingRepository greetingRepository; // Field injection
    
    
   

    public Greeting saveGreeting(Greeting greeting) {
        return greetingRepository.save(greeting);
    }

    public List<Greeting> getAllGreetings() {
        return greetingRepository.findAll();
    }

    public String getGreeting(String name) {
        return "Hello, " + name + "!";
    }
}