package com.example.helloworld.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String engineName;
    private String tireName;

    // Constructors
    public Car() {}

    public Car(String name, String engineName, String tireName) {
        this.name = name;
        this.engineName = engineName;
        this.tireName = tireName;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public String getTireName() {
        return tireName;
    }

    public void setTireName(String tireName) {
        this.tireName = tireName;
    }
}