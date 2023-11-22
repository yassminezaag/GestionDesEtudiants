package com.yass.studentmanagement.services;

import com.yass.studentmanagement.dto.StudentRequest;
import com.yass.studentmanagement.dto.StudentResponse;
import com.yass.studentmanagement.entities.Student;
import com.yass.studentmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImp implements StudentService{
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    StudentMapper studentMapper;

    @Override
    public void createStudent(StudentRequest studentRequest) {
        studentRepository.save(studentMapper.toStudent(studentRequest));
    }

    @Override
    public List<StudentResponse> getAll() {
        return studentRepository.findAll()
                .stream()
                .map(studentMapper::toStudentResponse)
                .collect(Collectors.toList());
    }

    @Override
    public Student update(Student student) {
        return studentRepository.saveAndFlush(student);
    }

    @Override
    public void deleteById(Long id) {
            studentRepository.deleteById(id);
    }

    @Override
    public Student findStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public List<Student> findByName(String name) {
        return studentRepository.findByFirstNameLike(name);
    }
}
