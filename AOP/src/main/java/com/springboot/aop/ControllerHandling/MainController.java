package com.springboot.aop.ControllerHandling;

import com.springboot.aop.ServiceHandling.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    StudentService studentService;

    @Autowired
    public MainController(StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping("/student")
    public ResponseEntity<String>create(){
        String responce= studentService.create();

        return ResponseEntity.ok(responce);

    }

}
