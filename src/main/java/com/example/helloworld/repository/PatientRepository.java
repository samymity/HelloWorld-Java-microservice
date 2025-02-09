package com.example.helloworld.repository;

import com.example.helloworld.entity.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PatientRepository extends MongoRepository<Patient, String> {
}