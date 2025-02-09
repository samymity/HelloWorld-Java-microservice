package com.example.helloworld.controller;

import com.example.helloworld.entity.MySQLPatient;
import com.example.helloworld.service.MySQLPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mysql/patients")
public class MySQLPatientController {
    @Autowired
    private MySQLPatientService mySQLPatientService;

    @PostMapping
    public MySQLPatient createPatient(@RequestBody MySQLPatient patient) {
        return mySQLPatientService.createPatient(patient);
    }

    @GetMapping
    public List<MySQLPatient> getAllPatients() {
        return mySQLPatientService.getAllPatients();
    }

    @GetMapping("/{id}")
    public MySQLPatient getPatientById(@PathVariable Long id) {
        return mySQLPatientService.getPatientById(id);
    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable Long id) {
        mySQLPatientService.deletePatient(id);
    }
}