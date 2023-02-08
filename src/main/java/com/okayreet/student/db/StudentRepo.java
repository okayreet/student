package com.okayreet.student.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.okayreet.student.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long>{
}