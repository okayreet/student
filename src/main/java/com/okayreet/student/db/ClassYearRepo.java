package com.okayreet.student.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.okayreet.student.entity.ClassYear;

public interface ClassYearRepo extends JpaRepository<ClassYear, Long>{
    
}