package com.example.logic;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldService {
    public void sayHello() {
        System.out.println("Hello, World!");
    }
}