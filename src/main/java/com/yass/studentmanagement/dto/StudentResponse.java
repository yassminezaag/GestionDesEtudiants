package com.yass.studentmanagement.dto;

import com.yass.studentmanagement.entities.Course;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentResponse {
    private Long id;
    private String firstName;
    private String lastName;
    private int nbreCourses;

}
