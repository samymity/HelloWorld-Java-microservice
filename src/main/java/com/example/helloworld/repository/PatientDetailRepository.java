package com.example.helloworld.repository;

import com.example.helloworld.entity.PatientDetail;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PatientDetailRepository extends MongoRepository<PatientDetail, String> {
    List<PatientDetail> findByPatientId(String patientId);
}