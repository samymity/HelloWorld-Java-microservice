package com.example.helloworld.service;

import com.example.helloworld.entity.MySQLPatient;
import com.example.helloworld.repository.MySQLPatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MySQLPatientService {
    @Autowired
    private MySQLPatientRepository mySQLPatientRepository;

    // CRUD methods for MySQL
    public MySQLPatient createPatient(MySQLPatient patient) {
        return mySQLPatientRepository.save(patient);
    }

    public List<MySQLPatient> getAllPatients() {
        return mySQLPatientRepository.findAll();
    }

    public MySQLPatient getPatientById(Long id) {
        return mySQLPatientRepository.findById(id).orElse(null);
    }

    public void deletePatient(Long id) {
        mySQLPatientRepository.deleteById(id);
    }
}