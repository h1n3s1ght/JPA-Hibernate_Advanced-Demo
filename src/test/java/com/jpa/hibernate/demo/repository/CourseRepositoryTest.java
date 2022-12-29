package com.jpa.hibernate.demo.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jpa.hibernate.demo.Course;
import com.jpa.hibernate.demo.CourseRepository;
import com.jpa.hibernate.demo.DemoApplication;

@SpringBootTest(classes=DemoApplication.class)
class CourseRepositoryTest {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CourseRepository repository;
	
	@Test
	public void findById_basic() {
		logger.info("CourseRepository Test --> [findById_Basic] is running.");
		Course course = repository.findById(10001L);
		assertEquals("JPA in 50 Steps", course.getName());
	}

}
