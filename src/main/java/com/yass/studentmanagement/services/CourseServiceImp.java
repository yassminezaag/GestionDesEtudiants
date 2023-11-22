package com.yass.studentmanagement.services;

import com.yass.studentmanagement.dto.CourseRequest;
import com.yass.studentmanagement.dto.CourseResponse;
import com.yass.studentmanagement.entities.Course;
import com.yass.studentmanagement.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImp implements CourseService{
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private CourseMapper courseMapper;
    @Override
    public void createCourse(CourseRequest courseRequest) {

         courseRepository.save(courseMapper.toCourse(courseRequest));
    }

    @Override
    public List<CourseResponse> findAll() {

        return courseRepository.findAll().stream()
                .map(courseMapper::ToCourseDto)
                .collect(Collectors.toList());
    }

    @Override
    public void delete(Course course) {
            courseRepository.delete(course);
    }
}
