package com.springboot.wrapperaop.Entity;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class Student {

    private int id;
    private String name;
    private String role;

}
