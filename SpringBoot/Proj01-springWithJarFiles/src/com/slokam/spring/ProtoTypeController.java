package com.slokam.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProtoTypeController {

	@Autowired
	private ProtoTypeService protoService;
	
	
	public String protoMethod() {
		return null;
	}
}
