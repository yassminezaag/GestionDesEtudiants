package com.yass.studentmanagement.services;

import com.yass.studentmanagement.dto.CourseResponse;
import com.yass.studentmanagement.dto.StudentRequest;
import com.yass.studentmanagement.dto.StudentResponse;
import com.yass.studentmanagement.entities.Student;
import com.yass.studentmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class StudentMapper {
    @Autowired
    StudentRepository studentRepository;

    public Student toStudent(StudentRequest studentRequest){
        Student student = new Student();
        student.setFirstName(studentRequest.getFirstName());
        student.setLastName(studentRequest.getLastName());
        student.setAge(studentRequest.getAge());
        return student;
    }

    public StudentResponse toStudentResponse(Student student){

        var studentResponse = StudentResponse.builder()
                .id(student.getId())
                .firstName(student.getFirstName())
                .lastName(student.getLastName())
                .nbreCourses(student.getCourses().size())
                .build();
        return studentResponse;
    }
}
