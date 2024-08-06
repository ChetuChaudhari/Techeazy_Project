package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
