package com.app.controller.dto;


import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

    @NotNull
    private String name;
    @NotNull
    @Size(min = 3, max = 15)
    private String lastName;
    @NotBlank
    @Email
    private String email;
    private Long phone;
    @Min(18)
    @Max(25)
    private byte age;

    private double height;
    private boolean married;
    private LocalDate dateOfBirth;
    @Valid
    private DepartmentDTO departmentDTO;

}
