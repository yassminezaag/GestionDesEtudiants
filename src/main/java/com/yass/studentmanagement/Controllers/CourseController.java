package com.yass.studentmanagement.Controllers;

import com.yass.studentmanagement.dto.CourseRequest;
import com.yass.studentmanagement.dto.CourseResponse;
import com.yass.studentmanagement.entities.Course;
import com.yass.studentmanagement.services.CourseService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController{
    @Autowired
    private CourseService courseService;

    @PostMapping("/add")
    private void createCourse(@RequestBody @Valid CourseRequest courseRequest){
         courseService.createCourse(courseRequest);
    }

    @GetMapping("/getall")
    private List<CourseResponse> findAll(){
        return courseService.findAll();
    }
}
