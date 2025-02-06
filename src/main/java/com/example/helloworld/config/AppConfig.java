package com.example.helloworld.config;

import com.example.helloworld.test.Actor;
import com.example.helloworld.test.ChildLego;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class AppConfig {

    @Bean
    public ChildLego childLego() { // Use camelCase for method names
        return new ChildLego("Your Desired Value"); // Provide the desired value here
    } 
        @Bean
       public Actor actor() {
       return new Actor("sandeep");
        
    }
        
        
        @Bean
        public WebClient.Builder webClientBuilder() {
            return WebClient.builder(); // Create a WebClient builder
        }
}