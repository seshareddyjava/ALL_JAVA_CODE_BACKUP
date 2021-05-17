package com.slokam.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ProtoTypeService {

	public void test() {
		System.out.println("proto service test");
	}
}
