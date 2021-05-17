package com.slokam.SpringWithJdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TL {

	@Autowired
	private Developer dev;
	
	public void doWork() {
		System.out.println("TL work started");
		dev.doWork();
		System.out.println("TL work ended");
	}
}
