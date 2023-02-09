package com.okayreet.student.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.okayreet.student.service.ClassYearService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/class")
public class ClassYearController {
    private final ClassYearService classYearService;

    @GetMapping("/all")
    public ResponseEntity<?> getStudents(){
        return new ResponseEntity<>(classYearService.getAllClasses(), HttpStatus.OK);
    }
    @GetMapping("/{student_id}")
    public ResponseEntity<?> getStudentById(@RequestBody Long student_id){
        return new ResponseEntity<>(classYearService.getClassById(student_id), HttpStatus.OK);
    }
}
