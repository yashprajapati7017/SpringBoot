package com.springboot.studentdto.StudentEntityDto;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StudentDTOEntity {

    private Integer id;
    private String name;
    private int age;
    private String email;
    private boolean deleted;
    private String subject;
    private LocalDateTime created;
    private LocalDateTime updated;
}
