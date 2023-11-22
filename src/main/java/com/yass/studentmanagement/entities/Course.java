package com.yass.studentmanagement.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course extends AuditModel{
    private String name;

    @ManyToMany(mappedBy = "courses")
    @JsonBackReference
    private List<Student> students = new ArrayList<Student>();

    @OneToMany(mappedBy = "course", fetch = FetchType.EAGER)
    //@JsonManagedReference
    private Set<Chapter> chapters = new HashSet<Chapter>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(name, course.name) && Objects.equals(students, course.students) && Objects.equals(chapters, course.chapters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
