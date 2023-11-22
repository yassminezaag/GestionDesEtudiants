package com.yass.studentmanagement.services;

import com.yass.studentmanagement.dto.CourseRequest;
import com.yass.studentmanagement.dto.CourseResponse;
import com.yass.studentmanagement.entities.Chapter;
import com.yass.studentmanagement.entities.Course;
import com.yass.studentmanagement.repository.ChapterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CourseMapper {
    @Autowired
    ChapterRepository chapterRepository;
    public Course toCourse(CourseRequest courseRequest){
       Course course = new Course();
       course.setName(courseRequest.getName());
       return course;
    }

    public CourseResponse ToCourseDto(Course course){
        //Set<Chapter> chapters = chapterRepository.findByCourse(course);
        var dto = CourseResponse.builder()
                .id(course.getId())
                .name(course.getName())
                .nbre_chapters(course.getChapters().size())
                .build();
        return dto;
    }
}
