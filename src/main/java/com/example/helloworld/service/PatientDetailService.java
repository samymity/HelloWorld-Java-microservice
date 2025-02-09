package com.example.helloworld.service;

import com.example.helloworld.entity.PatientDetail;
import com.example.helloworld.repository.PatientDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientDetailService {
    @Autowired
    private PatientDetailRepository patientDetailRepository;

    public List<PatientDetail> getAllDetailsByPatientId(String patientId) {
        return patientDetailRepository.findByPatientId(patientId);
    }

    public PatientDetail createDetail(PatientDetail detail) {
        return patientDetailRepository.save(detail);
    }

    public void deleteDetail(String id) {
        patientDetailRepository.deleteById(id);
    }
}