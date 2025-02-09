package com.example.helloworld.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "patient_details")
public class PatientDetail {
    @Id
    private String id;
    private String description; // Details about the patient
    private String treatment;    // Treatment given
    private String patientId;    // Reference to the Patient ID
	public PatientDetail(String id, String description, String treatment, String patientId) {
		super();
		this.id = id;
		this.description = description;
		this.treatment = treatment;
		this.patientId = patientId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTreatment() {
		return treatment;
	}
	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

    // Constructors, getters, and setters
}