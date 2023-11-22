package com.yass.studentmanagement.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address extends AuditModel{
    private Long id;
    private String city;
    private String street;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    @JsonBackReference
    private Student student;


}
