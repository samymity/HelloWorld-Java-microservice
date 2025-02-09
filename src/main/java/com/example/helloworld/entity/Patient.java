package com.example.helloworld.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;

@Document(collection = "patients")
public class Patient {
    @Id
    private String id;
    private String name;
    private int age;

    @DBRef
    private List<PatientDetail> details; // List of patient details

	public Patient(String id, String name, int age, List<PatientDetail> details) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.details = details;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public List<PatientDetail> getDetails() {
		return details;
	}

	public void setDetails(List<PatientDetail> details) {
		this.details = details;
	}

    // Constructors, getters, and setters
}