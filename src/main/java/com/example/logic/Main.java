package com.example.logic;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorldService helloWorldService = context.getBean(HelloWorldService.class);
        helloWorldService.sayHello(); // Output: Hello, World!
    }
}