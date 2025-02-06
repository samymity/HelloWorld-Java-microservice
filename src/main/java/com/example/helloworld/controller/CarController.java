package com.example.helloworld.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.helloworld.dependencypieces.Engine;

@RestController

public class CarController {
	
	@Autowired
	private Engine engine;
	
	@GetMapping("/Car/{username}")
    public String getUserRepos(@PathVariable String username) {
        return  engine.getName();
    }

}
