package com.springboot.studentdto.StudentEntityDto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class StudentResponceDTO {

    private Integer id;
    @NotBlank
    private String name;
    @Min(value =18)
    private int age;
    @Email
    @NotBlank
    private String email;
    @NotBlank
    private String subject;
}
