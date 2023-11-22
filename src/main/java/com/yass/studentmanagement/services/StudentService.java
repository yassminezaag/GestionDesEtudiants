package com.yass.studentmanagement.services;

import com.yass.studentmanagement.dto.StudentRequest;
import com.yass.studentmanagement.dto.StudentResponse;
import com.yass.studentmanagement.entities.Student;

import java.util.List;

public interface StudentService {
    public void createStudent(StudentRequest studentRequest);
    public List<StudentResponse> getAll();
    public Student update(Student student);
    public void deleteById(Long id);
    public Student findStudentById(Long id);
    public List<Student> findByName(String name);

}
