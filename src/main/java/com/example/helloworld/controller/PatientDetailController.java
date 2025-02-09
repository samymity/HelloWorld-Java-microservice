package com.example.helloworld.controller;

import com.example.helloworld.entity.PatientDetail;
import com.example.helloworld.service.PatientDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patient-details")
public class PatientDetailController {
    @Autowired
    private PatientDetailService patientDetailService;

    @GetMapping("/patient/{patientId}")
    public List<PatientDetail> getDetailsByPatientId(@PathVariable String patientId) {
        return patientDetailService.getAllDetailsByPatientId(patientId);
    }

    @PostMapping
    public ResponseEntity<PatientDetail> createDetail(@RequestBody PatientDetail detail) {
        PatientDetail createdDetail = patientDetailService.createDetail(detail);
        return new ResponseEntity<>(createdDetail, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDetail(@PathVariable String id) {
        patientDetailService.deleteDetail(id);
        return ResponseEntity.noContent().build();
    }
}