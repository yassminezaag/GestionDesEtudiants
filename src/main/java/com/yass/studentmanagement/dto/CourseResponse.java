package com.yass.studentmanagement.dto;

import com.yass.studentmanagement.entities.Chapter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CourseResponse {
    private Long id;
    private String name;
    private int nbre_chapters;


}
