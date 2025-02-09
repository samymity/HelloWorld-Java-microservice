package com.example.helloworld.controller;

import com.example.helloworld.service.MySQLPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldSecondController {

    @Autowired
    private MySQLPatientService mySQLPatientService;

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
}