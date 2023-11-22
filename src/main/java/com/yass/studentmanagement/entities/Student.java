package com.yass.studentmanagement.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student extends AuditModel{
    private String firstName;
    private String lastName;
    private int age;
    @OneToOne(mappedBy = "student")
    @JsonManagedReference
    private Address address;

    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name = "student_id", referencedColumnName = "id"),
               inverseJoinColumns = @JoinColumn(name = "course_id", referencedColumnName = "id"))
    //@JsonManagedReference
    private Set<Course> courses = new HashSet<Course>();
}
