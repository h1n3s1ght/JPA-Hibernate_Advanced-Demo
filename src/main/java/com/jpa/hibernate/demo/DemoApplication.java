package com.jpa.hibernate.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonRepo personRepo;
	
	@Autowired
	StudentRepo studentRepo;
	
	@Autowired
	IdentificationRepo identificationRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
//		Course course = repository.findById(10001L);
//		logger.info("Course 10001 -> {}", course);
//		repository.deleteById(10001L);
	}

}
