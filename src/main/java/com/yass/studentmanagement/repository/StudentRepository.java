package com.yass.studentmanagement.repository;

import com.yass.studentmanagement.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    public List<Student> findByFirstNameLike(String fname);
}
