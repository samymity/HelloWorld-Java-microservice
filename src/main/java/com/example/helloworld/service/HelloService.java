package com.example.helloworld.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    private final GreetingRepository greetingRepository;

    public HelloService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public String sayHello(String name) {
        String greeting = greetingRepository.getGreeting();
        return greeting + ", " + name + "!";
    }
}