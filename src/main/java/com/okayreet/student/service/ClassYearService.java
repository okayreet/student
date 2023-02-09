package com.okayreet.student.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.okayreet.student.db.ClassYearRepo;
import com.okayreet.student.entity.ClassYear;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Service
@Data
@RequiredArgsConstructor
public class ClassYearService {
    
    private final ClassYearRepo classYearRepo;

    public List<ClassYear> getAllClasses(){
        return classYearRepo.findAll();
    }
    public ClassYear getClassById(Long id){
        return classYearRepo.findById(id).get();
    }
}
