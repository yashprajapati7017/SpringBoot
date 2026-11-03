package com.springframework.springdemo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DisplayDetails implements ApplicationRunner {

    PyamentMethod pyamentMethod;

    public DisplayDetails(PyamentMethod pyamentMethod) {
        this.pyamentMethod = pyamentMethod;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        pyamentMethod.display();
    }
}
