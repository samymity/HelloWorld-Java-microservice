package com.example.helloworld.service;

import com.example.helloworld.entity.MySQLPatientDetail;
import com.example.helloworld.repository.MySQLPatientDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MySQLPatientDetailService {

    @Autowired
    private MySQLPatientDetailRepository mySQLPatientDetailRepository;

    public MySQLPatientDetail savePatientDetail(MySQLPatientDetail patientDetail) {
        return mySQLPatientDetailRepository.save(patientDetail);
    }

    public List<MySQLPatientDetail> getAllPatientDetails() {
        return mySQLPatientDetailRepository.findAll();
    }

    public MySQLPatientDetail getPatientDetailById(Long id) {
        return mySQLPatientDetailRepository.findById(id).orElse(null);
    }

    public void deletePatientDetail(Long id) {
        mySQLPatientDetailRepository.deleteById(id);
    }
}