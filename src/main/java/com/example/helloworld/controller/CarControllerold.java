package com.example.helloworld.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.helloworld.dependencypieces.Engine;
import com.example.helloworld.dependencypieces.Tire;

@RestController

public class CarControllerold {
	
	@Autowired
	private Engine engine;
	
	 @Autowired
	    private Tire tire;
	
	@GetMapping("/Car/{username}")
    public String getUserRepos(@PathVariable String username) {
        return   " Engine Name: " +  engine.getName() + ", Tire Name: " + tire.getName();
    }

}
