package com.springboot.pointcut.controllerHandling;

import com.springboot.pointcut.Service.DummyService;
import com.springboot.pointcut.StudentStructure.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    DummyService dummyService;

    public MainController(DummyService dummyService) {
        this.dummyService = dummyService;
    }

    @PostMapping("/student")
    public ResponseEntity<Student> Create(@RequestBody Student student) {
        dummyService.Create(student);
        return ResponseEntity.ok(student);
    }

}
