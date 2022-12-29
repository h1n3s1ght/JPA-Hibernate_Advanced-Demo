//package com.jpa.hibernate.demo;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Repository;
//
//import jakarta.persistence.EntityManager;
//import jakarta.transaction.Transactional;
//
//
//@Repository
//@Transactional 
//public class CourseApplication implements CommandLineRunner {
//	
//	@Autowired
//	EntityManager em;
//	
//	public Course findById(Long id) {
//		return em.find(Course.class, id);
//	}
//	
//	public void deleteById(Long id) {
//		Course course = findById(id);
//		em.remove(course);
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}
