package com.springboot.filter.ControlleeHandler;

import com.springboot.filter.Service.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    Student student;

    MainController(Student student) {
        this.student = student;
    }

    @PostMapping("/student")
    public ResponseEntity<String>create() {
        return ResponseEntity.ok().body("create");
    }

}
