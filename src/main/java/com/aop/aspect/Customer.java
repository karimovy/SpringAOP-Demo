package com.aop.aspect;

import org.springframework.stereotype.Component;

@Component
public class Customer {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
