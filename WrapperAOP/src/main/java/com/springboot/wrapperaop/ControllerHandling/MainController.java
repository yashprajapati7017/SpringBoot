package com.springboot.wrapperaop.ControllerHandling;

import com.springboot.wrapperaop.Entity.Student;
import com.springboot.wrapperaop.StudentStructure.MainStudent;
import com.springboot.wrapperaop.Wrapper.WrapperImp;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    MainStudent mainStudent;

    public MainController(MainStudent mainStudent){
        this.mainStudent = mainStudent;
    }

    @PostMapping("/student")
    public ResponseEntity<String> Create(Student student){

        mainStudent.create(student);

        return ResponseEntity.ok("Strudent Create");

    }
}
