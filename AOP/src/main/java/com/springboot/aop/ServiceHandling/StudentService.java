package com.springboot.aop.ServiceHandling;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public String create(){

        System.out.println("Student create");

//        throw new RuntimeException("RuntimeException");

        return "Student create";
    }

}
