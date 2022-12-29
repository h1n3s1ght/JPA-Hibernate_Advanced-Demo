package com.jpa.hibernate.demo;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Course {

		@Id
		@GeneratedValue
		private Long id;
		
		@Column
		private String name;
		
		@OneToMany(mappedBy = "course")
		private List<Review> reviewList = new ArrayList<Review>();
		
		@ManyToMany(mappedBy = "courses")
		private List<Student> studentList = new ArrayList<Student>();
		

		@Override
		public String toString() {
			return "Name -> [" + name + "]";
		}
		
		
}
