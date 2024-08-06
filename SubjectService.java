package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Subject;
import com.example.demo.Repository.SubjectRepository;

@Service
public class SubjectService {
	
	 @Autowired
	    private SubjectRepository subjectRepository;

	    public List<Subject> getAllSubjects() {
	        return subjectRepository.findAll();
	    }

}
