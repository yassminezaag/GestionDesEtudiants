package com.yass.studentmanagement.repository;

import com.yass.studentmanagement.entities.Chapter;
import com.yass.studentmanagement.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface ChapterRepository extends JpaRepository<Chapter, Long> {

    Set<Chapter> findByCourse(Course course);
}
