package com.yass.studentmanagement.Controllers;

import com.yass.studentmanagement.dto.StudentRequest;
import com.yass.studentmanagement.dto.StudentResponse;
import com.yass.studentmanagement.entities.Student;
import com.yass.studentmanagement.services.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public void createStudent(@RequestBody @Valid StudentRequest studentRequest){
        studentService.createStudent(studentRequest);
    }

    @GetMapping("/getall")
    public List<StudentResponse> findAll(){
        return studentService.getAll();
    }
}
