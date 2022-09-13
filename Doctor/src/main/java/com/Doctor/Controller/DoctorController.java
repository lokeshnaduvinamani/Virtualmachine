package com.Doctor.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Doctor.Entity.Doctor;
import com.Doctor.Service.DoctorService;
import com.Doctor.VO.RequestTemplate;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
	@Autowired
	private DoctorService doctorservice;
	@PostMapping
	public Doctor addDoctor(@RequestBody Doctor doctor) {
		return doctorservice.saveDoctorInformation(doctor);
	}
	
	@GetMapping("{name}")
	public Doctor getByName(@PathVariable String name) {
		return doctorservice.getByName(name);
	}
	
	@GetMapping("/doctors")
	public List<Doctor>findAll(){
		return doctorservice.findAll();
	}
	
	@GetMapping("/doctor-with-patient/{id}")
	public RequestTemplate specficdoctorpatient(@PathVariable String name) {
		return doctorservice.specficdoctorpatient(name);
	}

}
