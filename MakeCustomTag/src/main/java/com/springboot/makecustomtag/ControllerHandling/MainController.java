package com.springboot.makecustomtag.ControllerHandling;

import com.springboot.makecustomtag.ServiceHandling.StudentService;
import com.springboot.makecustomtag.StudentStructure.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    StudentService studentService;

    MainController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/student")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {

        studentService.CreateStudent(student);

        return ResponseEntity.ok().body(student);

    }

}
