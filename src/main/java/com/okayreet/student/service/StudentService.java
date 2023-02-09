package com.okayreet.student.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.okayreet.student.db.StudentRepo;
import com.okayreet.student.entity.Student;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Service
@Data
@RequiredArgsConstructor
public class StudentService {
    
    private final StudentRepo studentRepo;

    public List<Student> getAllStudents(){
        return studentRepo.findAll();
    }
    public Student getStudentById(Long id){
        return studentRepo.findById(id).get();
    }
    public List<Student> getStudentsOfClass(Long class_id){
        return studentRepo.findAllByClassYearId(class_id);
    }
}
