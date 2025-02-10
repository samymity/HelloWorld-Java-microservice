package com.example.helloworld.controller;

import com.example.helloworld.entity.MySQLPatient;
import com.example.helloworld.service.MySQLPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200") // Allow CORS for this controller
@RequestMapping("/patients")
public class MySQLPatientController {

    @Autowired
    private MySQLPatientService mySQLPatientService;

    @PostMapping
    public ResponseEntity<MySQLPatient> createPatient(@RequestBody MySQLPatient patient) {
        MySQLPatient savedPatient = mySQLPatientService.savePatient(patient);
        return new ResponseEntity<>(savedPatient, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<MySQLPatient>> getAllPatients() {
        List<MySQLPatient> patients = mySQLPatientService.getAllPatients();
        return new ResponseEntity<>(patients, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MySQLPatient> getPatientById(@PathVariable Long id) {
        MySQLPatient patient = mySQLPatientService.getPatientById(id);
        return patient != null ? new ResponseEntity<>(patient, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePatient(@PathVariable Long id) {
        mySQLPatientService.deletePatient(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}