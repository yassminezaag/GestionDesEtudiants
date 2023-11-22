package com.yass.studentmanagement.dto;

import com.yass.studentmanagement.entities.Chapter;
import jakarta.validation.constraints.NotNull;
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
public class CourseRequest {
    @NotNull(message = "must not be null !!")
    private String name;


}
