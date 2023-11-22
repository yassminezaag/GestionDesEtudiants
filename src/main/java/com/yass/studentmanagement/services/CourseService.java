package com.yass.studentmanagement.services;

import com.yass.studentmanagement.dto.CourseRequest;
import com.yass.studentmanagement.dto.CourseResponse;
import com.yass.studentmanagement.entities.Course;

import java.util.List;

public interface CourseService {

    public void createCourse(CourseRequest courseRequest);
    public List<CourseResponse> findAll();
    public void delete(Course course);

}
