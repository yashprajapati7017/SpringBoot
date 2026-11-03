package com.springboot.inheritingthymeleaftemplate.MainController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Control {

    @GetMapping("/about")
    public String about(){

        return "about";
    }
}
