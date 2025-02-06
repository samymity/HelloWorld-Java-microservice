package com.example.helloworld.dependencypieces;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Tire {
    
    private String name;

    // Constructor that uses @Value to inject the property
    public Tire(@Value("${tire.name:defaultTire}") String name) {
        this.name = name;  // Use the injected name, or fallback to "defaultTire"
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}