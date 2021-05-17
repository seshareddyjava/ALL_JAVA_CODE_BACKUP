package com.slokam.Events;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.stereotype.Component;

@Component
public class ApplicationStoppedEvent implements ApplicationListener<ContextStoppedEvent> {

	public void onApplicationEvent(ContextStoppedEvent event) {

		System.out.println("ContextStoppedEvent");
		
	}

}
