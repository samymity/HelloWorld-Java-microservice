package com.example.helloworld.entity;

import jakarta.persistence.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class MySQLPatient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;

    @OneToMany(mappedBy = "mySQLPatient", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference 
    private List<MySQLPatientDetail> mySQLPatientDetails;

    // Constructors, Getters, and Setters
    public MySQLPatient() {}

    public MySQLPatient(String name, int age) {
        this.name = name;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<MySQLPatientDetail> getMySQLPatientDetails() {
        return mySQLPatientDetails;
    }

    public void setMySQLPatientDetails(List<MySQLPatientDetail> mySQLPatientDetails) {
        this.mySQLPatientDetails = mySQLPatientDetails;
    }
}