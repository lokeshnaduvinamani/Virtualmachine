package com.Patient.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Patient.Entity.Patient;
import com.Patient.Repository.PatientRepository;
import com.Patient.VO.RequestTemplate;


@Service
public class PatientService {
	
	@Autowired
	private PatientRepository patientrepository;
	public List<Patient> findAll(){
		return patientrepository.findAll();
	}
	
	public Patient savePatientInformation(Patient patient) {
		return patientrepository.save(patient);
	}
	
	public Patient getById(long id) {
		return patientrepository.readById(id);
	}
	
	public RequestTemplate specficdoctorpatient(long id) {
		return patientrepository.getById(id);
	}

}
