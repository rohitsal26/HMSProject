package com.java.hms.endpoint;

import java.util.Date;

import javax.ws.rs.Path;

import org.springframework.stereotype.Component;

import com.java.hms.model.Gender;
import com.java.hms.model.Patient;

@Component
@Path("/api/v1/")
public class PatientEndpoint {
	@Path("get/patient")
	public Patient getPatient() {
		Patient patient = new Patient();
		patient.setFirstName("Rohit");
		patient.setMiddleName("Suresh");
		patient.setFirstName("Salunkhe");
		patient.setGender(Gender.Male);
		patient.setDateOfBirth(new Date());
		return patient;
	}
}
