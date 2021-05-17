package com.slokam.patient.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.slokam.patient.entity.Patient;

@Repository
public interface PatientRepo extends JpaRepository<Patient,Integer> {
	
	 List<Patient> findByAddr(String addr);
	 
	 @Query("from Patient p where p.name like ?1")
	public List<Patient> getPatientByName(String name);
}
