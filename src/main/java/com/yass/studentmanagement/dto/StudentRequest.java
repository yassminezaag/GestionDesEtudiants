package com.yass.studentmanagement.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentRequest {
    @NotNull(message = "must not be null !")
    private String firstName;
    @NotNull(message = "must not be null !")
    private String lastName;
    @NotNull(message = "must not be null !")
    @Min(value = 18)
    private int age;
}
