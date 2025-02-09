package com.example.helloworld.repository;

import com.example.helloworld.entity.MySQLPatientDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MySQLPatientDetailRepository extends JpaRepository<MySQLPatientDetail, Long> {
}