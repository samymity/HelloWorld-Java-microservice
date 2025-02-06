package com.example.helloworld.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.helloworld.entity.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
}