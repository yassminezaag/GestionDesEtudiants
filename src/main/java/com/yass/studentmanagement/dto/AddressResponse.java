package com.yass.studentmanagement.dto;

import com.yass.studentmanagement.entities.Student;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddressResponse {
    private Long id;
    private String city;
    private String street;
}
