package com.slokam.healthcare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.healthcare.service.IVisitingService;

@RestController
@RequestMapping("visiting")
public class VisitingController {

	@Autowired
	private IVisitingService visitingService;
	
	@GetMapping("/getVisitingsByPatientId/{id}")
	public ResponseEntity<List<String>> getVisitingsByPatientId(@PathVariable Integer id){ 
		
		return ResponseEntity.ok(visitingService.getVisitingsByPatientId(id));
	}
}
