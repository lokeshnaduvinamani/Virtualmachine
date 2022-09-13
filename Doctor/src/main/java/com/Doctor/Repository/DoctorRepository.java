package com.Doctor.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Doctor.Entity.Doctor;
import com.Doctor.VO.RequestTemplate;

public interface DoctorRepository extends JpaRepository<Doctor,String>{
	Doctor readByName(String name);
	
	RequestTemplate getByName(String name);

}
