package com.springboot.makecustomtag.StudentStructure;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
public class Student {

    private int id;
    private String name;
    private int age;
    private String role;

}
