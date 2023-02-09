package com.okayreet.student.db;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.okayreet.student.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long>{
    List<Student> findAllByClassYearId(Long class_id);
}