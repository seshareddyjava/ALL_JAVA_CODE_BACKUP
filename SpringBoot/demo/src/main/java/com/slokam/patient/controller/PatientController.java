package com.slokam.patient.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.patient.entity.Patient;
import com.slokam.patient.repo.PatientRepo;

@RestController
public class PatientController {
	@Autowired
	private PatientRepo patientRepo;
	
	@PostMapping(value = "savePatient")
	public ResponseEntity<Patient> savePatient(@RequestBody Patient patent) {
		patientRepo.save(patent);
		
		return new ResponseEntity<Patient>(HttpStatus.CREATED);
	}
	
	@GetMapping("getById/{id}")
	public ResponseEntity<Patient> getById(@PathVariable Integer id){
	Optional<Patient> opt=	patientRepo.findById(id);
	if(opt.isPresent()) {
	return new ResponseEntity<>(opt.get(),HttpStatus.OK);
	}
	return new ResponseEntity<Patient>(HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("getAllPatients")
	public ResponseEntity<List<Patient>> getAllPatients(){
		List<Patient> list= patientRepo.findAll();
		if(list.isEmpty()) {
			return new ResponseEntity<List<Patient>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Patient>>(list,HttpStatus.OK);
	}
	
	@PutMapping(value = "updatePatient")
	public ResponseEntity<Patient> updatePatient(@RequestBody Patient patient ){
		patientRepo.save(patient);
		return new ResponseEntity<Patient>(HttpStatus.OK);
	}
	
	@DeleteMapping(value = "deletePatient/{id}")
	public ResponseEntity<Patient> deletePatient(@PathVariable Integer id){
		patientRepo.deleteById(id);
		return new ResponseEntity<Patient>(HttpStatus.OK);
		
	}
	
}
