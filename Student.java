package com.example.demo.Model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
	public class Student {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String sname;
	    private String address;

	    @ManyToMany(cascade = CascadeType.ALL)
	    @JoinTable(
	        name = "student_subject",
	        joinColumns = @JoinColumn(name = "student_id"),
	        inverseJoinColumns = @JoinColumn(name = "subject_id")
	        )
	    private Set<Subject> subjects = new HashSet<>();

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		
		public String getSname() {
			return sname;
		}

		public void setSname(String sname) {
			this.sname = sname;
		}

		public Set<Subject> getSubjects() {
			return subjects;
		}

		public void setSubjects(Set<Subject> subjects) {
			this.subjects = subjects;
		}

	    
	    
	    
	}


