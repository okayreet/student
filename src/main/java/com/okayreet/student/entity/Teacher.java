package com.okayreet.student.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Data
@Entity
public class Teacher {
    @Id
    @SequenceGenerator(name = "teacher_id_sequence", sequenceName = "teacher_id_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teacher_id_sequence")
    private Long id;
    private String first_name;
    private String last_name;
    private LocalDate date_of_birth;
    private Integer telephone_number;
    private String email;
    private String address_1;
    private String address_2;
    private String city;
    private String post_code;
    @JsonIgnore 
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subject_id")
    private Subject subject;
}
