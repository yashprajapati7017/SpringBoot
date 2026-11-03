package com.springframework.springdemo;

import org.springframework.stereotype.Component;

@Component
public class PyamentMethod {

    SetValue setValue;

    public PyamentMethod(SetValue setValue) {
        this.setValue = setValue;
    }

    public void display(){
        System.out.println(setValue);
    }
}
