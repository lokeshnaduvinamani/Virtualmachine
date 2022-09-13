package com.midtree.doctorpatient.controller;

import com.midtree.doctorpatient.entity.Doctor;
import com.midtree.doctorpatient.service.HospitalService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class DoctorController {

    @Autowired
    HospitalService service;

    @PostMapping("/doctors/doctor")
    public boolean addUser(@RequestBody Doctor doctor) {
        service.saveDoctorInformation(doctor);
        return true;

    }

   

    @GetMapping("doctors/doc/{name}")
    public Doctor getDoctorInfo(@PathVariable String name) {
        Doctor doctor = service.showDoctorInformation(name);
        return doctor;
    }


}
