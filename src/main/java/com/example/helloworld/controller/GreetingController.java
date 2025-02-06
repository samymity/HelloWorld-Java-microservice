package com.example.helloworld.controller;

import com.example.helloworld.model.Greeting;
import com.example.helloworld.service.GreetingService;
import com.example.helloworld.test.Actor;
import com.example.helloworld.test.ChildLego;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/greetings")
public class GreetingController {
    
    @Autowired
    private GreetingService greetingService; // Field injection
    
    @Autowired
    private Actor actor;
    
    @Autowired
    private ChildLego childlego ;

    @PostMapping
    public ResponseEntity<Greeting> createGreeting(@RequestBody Greeting greeting) {
        Greeting savedGreeting = greetingService.saveGreeting(greeting);
        return new ResponseEntity<>(savedGreeting, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Greeting>> getAllGreetings() {
        List<Greeting> greetings = greetingService.getAllGreetings();
        return new ResponseEntity<>(greetings, HttpStatus.OK);
    }

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        return greetingService.getGreeting(name);
    }
    
    @GetMapping("/greet1/{name}")
    public String greet1(@PathVariable String name) {
        return actor.getName();
    }
    
    
    
    
}