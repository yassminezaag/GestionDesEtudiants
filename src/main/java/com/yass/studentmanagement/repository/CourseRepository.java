package com.yass.studentmanagement.repository;

import com.yass.studentmanagement.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
