package com.slokam.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TL {
	
	private Developer dev;

	@Autowired
	public void setDev(Developer dev) {
		this.dev = dev;
	}
	
	public void doWork() {
		System.out.println("TL work Started");
		dev.dowork();
		System.out.println("TL work ended");
	}
	
	
	
	
	
	

}
