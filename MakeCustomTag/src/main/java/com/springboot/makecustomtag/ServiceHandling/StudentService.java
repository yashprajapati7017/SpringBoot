package com.springboot.makecustomtag.ServiceHandling;

import com.springboot.makecustomtag.MakeAnnotation.TrackExecution;
import com.springboot.makecustomtag.StudentStructure.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @TrackExecution
    public Student CreateStudent(Student student) {

        System.out.println("Student Created");
        return student;
    }

}
