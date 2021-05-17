package com.slokam.healthcare.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.healthcare.entity.Patient;
import com.slokam.healthcare.pojo.PatientSearchPojo;
import com.slokam.healthcare.repo.IPatientRepo;
import com.slokam.healthcare.repo.PatientCriteriaRepo;
import com.slokam.healthcare.service.IPatientService;

@Service
public class IPatientServiceImpl implements IPatientService {

	@Autowired
	private IPatientRepo patientRepo;

	@Autowired
	private PatientCriteriaRepo patientCriteria;

	@Override
	public void patientRegistration(Patient patient) {

		patient.setRegDate(new Date());
		patientRepo.save(patient);
	}

	@Override
	public List<Patient> criteriaTest(String name, String email) {
		return patientCriteria.patientSearch(name, email);
	}

	@Override
	public List<Patient> patientSearch(PatientSearchPojo searchPojo) {
		return patientCriteria.patientFullSearch(searchPojo);
	}

	@Override
	public List<Patient> getAllPatients() {
		return patientRepo.findAll();

	}

	@Override
	public Patient getPatientById(Integer id) {
		Optional<Patient> opt= patientRepo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

	@Override
	public List<Patient> findEvenPatient() {
		List<Patient> patientList=patientRepo.findAll();
		return patientList;
	}
}
