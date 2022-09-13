package com.Patient.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Patient.Entity.Patient;
import com.Patient.VO.RequestTemplate;

public interface PatientRepository extends JpaRepository<Patient,Long> {
	
    Patient readById(long id);
	
	RequestTemplate getById(long id);

}
