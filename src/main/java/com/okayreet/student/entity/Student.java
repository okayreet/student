package com.okayreet.student.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @SequenceGenerator(name = "student_id_sequence", sequenceName = "student_id_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_id_sequence")
    private Long id;
    private String first_name;
    private String last_name;
    private Date date_of_birth;
    private String address_1;
    private String address_2;
    private String city;
    private String post_code;
    private Integer telephone_number;
    private String email;
//     @ManyToOne(fetch = FetchType.LAZY)
//     @JoinColumn(name = "ClassYear_ID")
//     private ClassYear classYear;
}
