package com.springboot.filter.Service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Student {

    public void createStudent(Student student) {
        System.out.println("createStudent");
    }
}
