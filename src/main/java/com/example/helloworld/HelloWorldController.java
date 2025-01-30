package com.example.helloworld;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/page1")
    public String hello1() {
        return "Hello, World!";
    }
    
    
    @GetMapping("/page2")
    public Map<String, String> hello2() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello, World!");
        return response;
    }
    
    @GetMapping("/page3")
    public Map<String, Object> hello3() {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Hello from page 3!");
        response.put("pageNumber", 3);
        response.put("status", "success");
        return response;
    }
    
}