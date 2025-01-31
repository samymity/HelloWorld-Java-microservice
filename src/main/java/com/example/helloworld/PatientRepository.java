package com.example.helloworld;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    // Additional query methods can be defined here if needed
}