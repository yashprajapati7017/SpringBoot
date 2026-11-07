package com.springboot.profile.ControllerHandler;

import com.springboot.profile.Notification.NotificationService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    NotificationService notificationService;

    @Autowired
    public MainController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Value("${MainController.Message}")
    private String Message;

    @Value("${MainController.code}")
    private int code;

    @GetMapping("/hello")
    public ResponseEntity<String> Application(){
        return ResponseEntity.ok(Message +" "+code);
    }

    public ResponseEntity<String> Notification(){
        String notifi=notificationService.send();
        return ResponseEntity.ok(notifi);
    }


}
