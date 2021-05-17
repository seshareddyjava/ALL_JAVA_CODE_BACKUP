package com.slokam.healthcare.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.slokam.healthcare.entity.Patient;
import com.slokam.healthcare.pojo.PatientSearchPojo;
import com.slokam.healthcare.repo.PatientCriteriaRepo;
import com.slokam.healthcare.service.IPatientService;

@RestController
@RequestMapping("patient")
public class PatientController {

	@Autowired
	private IPatientService patientService;
	@Value("${app.file.upload.location}")
	private String uploadLocation;
	
	@PostMapping("/savePatientImage")
	public ResponseEntity<String> savePatientImage(MultipartFile patientImage){
		
		String name = System.currentTimeMillis()+"-"+patientImage.getOriginalFilename();
		try {
			patientImage.transferTo(new File(uploadLocation+name));
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return new ResponseEntity<String>(name,HttpStatus.OK);

	}
	@Autowired
	private PatientCriteriaRepo criteriaRepo;
	
	@PostMapping("/register")
	public ResponseEntity<Patient> registerPatient(@RequestBody Patient patient){
		
		patientService.patientRegistration(patient);
		return new ResponseEntity<Patient>(patient,HttpStatus.CREATED);
	}
	@GetMapping("/criteriaTest/{name}/{email}")
	public ResponseEntity<List<Patient>> criteriaTest(@PathVariable String name,@PathVariable String email) {
		List<Patient> list = patientService.criteriaTest(name, email);
		return new ResponseEntity<List<Patient>>(list,HttpStatus.OK);
	}
	@PostMapping("/search")
	public ResponseEntity<List<Patient>> patientSearch(@RequestBody PatientSearchPojo searchPojo) {
		List<Patient> list=  patientService.patientSearch(searchPojo);
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Patient>> getAllPatients(){
		List<Patient> list=patientService.getAllPatients();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("byId/{id}")
	public ResponseEntity<Patient> getPatientById(@PathVariable Integer id){
		Patient p= patientService.getPatientById(id);
		
		return ResponseEntity.ok(p);
	}
	
	//to get even patient list
	@GetMapping("/getEvenPatients")
	public ResponseEntity<List<Patient>> getEvenPatients(){
		
		List<Patient> list= patientService.findEvenPatient();
		List<Patient> list1=list.stream().filter(patient->patient.getId()%2==0).collect(Collectors.toList());
		return new ResponseEntity<List<Patient>>(list1,HttpStatus.OK);
	}
	@GetMapping("/getEvenPatientsName")
	public ResponseEntity<List<String>> getEvenPatientsName(){
		
		List<Patient> list= patientService.findEvenPatient();
		List<String> nameList=list.stream().filter(patient->patient.getId()%2==0).map(m->m.getName()).collect(Collectors.toList());
		return new ResponseEntity<List<String>>(nameList,HttpStatus.OK);
	}
	
	
}
