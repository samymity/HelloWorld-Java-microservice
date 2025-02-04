package com.example.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    // Retrieve all customers
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    // Save a new customer
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    // Find a customer by ID
    public Optional<Customer> findCustomerById(Long id) {
        return customerRepository.findById(id);
    }

    // Delete a customer by ID
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}