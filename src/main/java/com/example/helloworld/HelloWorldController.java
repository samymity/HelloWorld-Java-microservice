package com.example.helloworld;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.*;


@RestController
public class HelloWorldController {
	
	@Autowired
	private PatientService patientService;

	@Autowired
    private CustomerService customerService;


    @GetMapping("/page1")
    public String hello1() {
        return "Hello, World!";
    }
    
    
    @GetMapping("/page2")
    public Map<String, String> hello2() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello, World!");
        return response;
    }
    
    @GetMapping("/page3")
    public Map<String, Object> hello3() {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Hello from page 3!");
        response.put("pageNumber", 3);
        response.put("status", "success");
        return response;
    }
    
    @GetMapping("/page4")
    public List<Patient> hello4() {
        return patientService.getAllPatients();
    }
    
    
    @GetMapping("/page5/Customers")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }
    
    // Create a new customer
    @PostMapping("/page6/createCustomers")
    public ResponseEntity<Customer> createCustomer(@RequestBody @Valid Customer customer) {
        Customer savedCustomer = customerService.saveCustomer(customer);
        return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);
    }
    
}