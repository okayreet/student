package com.okayreet.student.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Subject {
    @Id
    @JsonIgnore 
    private Long id;
    private String name;
}
