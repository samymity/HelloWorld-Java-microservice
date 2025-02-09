package com.example.helloworld.controller;

import com.example.helloworld.entity.MySQLPatientDetail;
import com.example.helloworld.service.MySQLPatientDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient-details")
public class MySQLPatientDetailController {

    @Autowired
    private MySQLPatientDetailService mySQLPatientDetailService;

    @PostMapping
    public ResponseEntity<MySQLPatientDetail> createPatientDetail(@RequestBody MySQLPatientDetail patientDetail) {
        MySQLPatientDetail savedDetail = mySQLPatientDetailService.savePatientDetail(patientDetail);
        return new ResponseEntity<>(savedDetail, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<MySQLPatientDetail>> getAllPatientDetails() {
        List<MySQLPatientDetail> details = mySQLPatientDetailService.getAllPatientDetails();
        return new ResponseEntity<>(details, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MySQLPatientDetail> getPatientDetailById(@PathVariable Long id) {
        MySQLPatientDetail detail = mySQLPatientDetailService.getPatientDetailById(id);
        return detail != null ? new ResponseEntity<>(detail, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePatientDetail(@PathVariable Long id) {
        mySQLPatientDetailService.deletePatientDetail(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}