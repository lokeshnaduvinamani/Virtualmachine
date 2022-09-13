package com.Doctor.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Doctor.Entity.Doctor;
import com.Doctor.Repository.DoctorRepository;
import com.Doctor.VO.RequestTemplate;

@Service
public class DoctorService {
	@Autowired
	private DoctorRepository doctorrepository;
	public List<Doctor> findAll(){
		return doctorrepository.findAll();
	}
	
	public Doctor saveDoctorInformation(Doctor doctor) {
		return doctorrepository.save(doctor);
	}
	
	public Doctor getByName(String name) {
		return doctorrepository.readByName(name);
	}
	
	public RequestTemplate specficdoctorpatient(String name) {
		return doctorrepository.getByName(name);
	}

}
