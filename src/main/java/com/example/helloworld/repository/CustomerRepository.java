package com.example.helloworld.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.helloworld.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}