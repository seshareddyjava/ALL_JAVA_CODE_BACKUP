package com.slokam.SpringWithJdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Manager {

	@Autowired
	private TL tl;
	
	public void doWork() {
		System.out.println("Manager work Started");
		tl.doWork();
		System.out.println("Manager work ended");
	}
	
}
