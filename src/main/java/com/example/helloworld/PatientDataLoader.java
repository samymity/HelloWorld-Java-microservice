package com.example.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class PatientDataLoader implements CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public void run(String... args) throws Exception {
        // Check if data already exists
        if (patientRepository.count() == 0) {
            // Create dummy patient data
            Patient patient1 = new Patient();
            patient1.setName("John Doe");
            patient1.setAge(30);
            patient1.setDiagnosis("Flu");

            Patient patient2 = new Patient();
            patient2.setName("Jane Smith");
            patient2.setAge(25);
            patient2.setDiagnosis("Cold");

            Patient patient3 = new Patient();
            patient3.setName("Emily Johnson");
            patient3.setAge(40);
            patient3.setDiagnosis("Headache");

            // Save to the repository
            patientRepository.saveAll(Arrays.asList(patient1, patient2, patient3));
        }
    }
}