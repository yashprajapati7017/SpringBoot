package com.springboot.profile.Notification;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("Prod")
public class Gmail implements NotificationService {
    @Override
    public String send() {
        return "this is message from Gmail";
    }
}
