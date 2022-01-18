package com.example.studentexample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.studentexample.model.Assignment;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignment, Long> {
	List<Assignment> findByStudentId(Long studentId);
}
