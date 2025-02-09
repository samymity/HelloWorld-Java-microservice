package com.example.helloworld.repository;

import com.example.helloworld.entity.MySQLPatient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MySQLPatientRepository extends JpaRepository<MySQLPatient, Long> {
}