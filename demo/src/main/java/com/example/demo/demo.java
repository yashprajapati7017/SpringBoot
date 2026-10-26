package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class demo {

    @RequestMapping("/text")
    public String display(){
        System.out.println("This is display method");
        return "text";
    }

    @RequestMapping("/context")
    public String context(){
        System.out.println("This is display method");
        return "context";
    }


}
