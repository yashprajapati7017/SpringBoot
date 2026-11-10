package com.springboot.interceptors.ControllerHandler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @PostMapping("/student")
    public ResponseEntity<String> Create(){
        System.out.println("this is main controller");
        return ResponseEntity.ok("create student");
    }

}
