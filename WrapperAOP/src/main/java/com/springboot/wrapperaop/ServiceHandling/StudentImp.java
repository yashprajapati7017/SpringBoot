package com.springboot.wrapperaop.ServiceHandling;

import com.springboot.wrapperaop.Entity.Student;
import com.springboot.wrapperaop.StudentStructure.MainStudent;
import org.springframework.stereotype.Component;

@Component
public class StudentImp implements MainStudent {

    @Override
    public void create(Student student) {
        System.out.println("Create Student");
    }
}
