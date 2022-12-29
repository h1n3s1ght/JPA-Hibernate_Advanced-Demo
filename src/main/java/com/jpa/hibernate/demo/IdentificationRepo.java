package com.jpa.hibernate.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IdentificationRepo extends JpaRepository<Person, Integer>{}