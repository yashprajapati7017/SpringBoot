package com.springboot.pointcut.Service;

import com.springboot.pointcut.StudentStructure.Student;
import org.springframework.stereotype.Service;

@Service
public class DummyService {

    public Student Create(Student student) {

        System.out.println("Student Created");
        return student;

    }

}
