package com.midtree.doctorpatient.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.midtree.doctorpatient.entity.Patient;

@Repository

public interface PatientRepository extends CrudRepository<Patient,Integer> {

}