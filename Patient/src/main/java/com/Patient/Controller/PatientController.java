package com.Patient.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Patient.Entity.Patient;
import com.Patient.Service.PatientService;
import com.Patient.VO.RequestTemplate;


@RestController
@RequestMapping("/patient")
public class PatientController {
	
	@Autowired
	private PatientService patientservice;
	@PostMapping
	public Patient addPatient(@RequestBody Patient patient) {
		return patientservice.savePatientInformation(patient);
	}
	
	@GetMapping("{name}")
	public Patient getById(@PathVariable long id) {
		return patientservice.getById(id);
	}
	
	@GetMapping("/patients")
	public List<Patient>findAll(){
		return patientservice.findAll();
	}
	
	@GetMapping("/doctor-with-patient/{id}")
	public RequestTemplate specficdoctorpatient(@PathVariable long id) {
		return patientservice.specficdoctorpatient(id);
	}

}
