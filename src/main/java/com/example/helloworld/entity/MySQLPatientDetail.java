package com.example.helloworld.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

@Entity
public class MySQLPatientDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String detail;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    @JsonBackReference
    private MySQLPatient mySQLPatient;

    // Constructors, Getters, and Setters
    public MySQLPatientDetail() {}

    public MySQLPatientDetail(String detail) {
        this.detail = detail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public MySQLPatient getMySQLPatient() {
        return mySQLPatient;
    }

    public void setMySQLPatient(MySQLPatient mySQLPatient) {
        this.mySQLPatient = mySQLPatient;
    }
}