package com.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aop.aspect.Customer;

@SpringBootApplication
public class SpringAopApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
		
		Customer customer = new Customer();
		
		customer.setName("Jason");
		
		System.err.println(customer.getName());
		
	}

}
