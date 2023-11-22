package com.yass.studentmanagement.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddressRequest {

    @NotNull(message = "must not be null !")
    private String city;
    @NotNull(message = "must not be null !")
    private String street;
}
