package com.slokam.healthcare.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.healthcare.repo.IVisitingRepo;
import com.slokam.healthcare.service.IVisitingService;

@Service
public class IVistingServiceImpl implements IVisitingService {
	
	
	@Autowired
	private IVisitingRepo visitingRepo;

	@Override
	public List<String> getVisitingsByPatientId(Integer id) {
		
		List<String> list = visitingRepo.getPatientsById(id);
		return list;
	}
	

}
