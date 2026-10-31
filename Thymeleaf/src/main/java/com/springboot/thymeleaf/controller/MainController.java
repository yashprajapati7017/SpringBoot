package com.springboot.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Controller
public class MainController {

    @GetMapping("/about")
    public String hello(Model model) {
        System.out.println("this is hello method");
        model.addAttribute("name", "yash");
        model.addAttribute("age", 18);
        model.addAttribute("learn","java");

        List<String> list= List.of("Adam","Jon","Array","Bee");
        model.addAttribute("list",list);

        return "hello";
    }

    @GetMapping("/condition")
    public String Condition(Model model){

        //this is is-else
        System.out.println("check condition");
        model.addAttribute("check", true);

        //this is if-unless
        model.addAttribute("gender", "M");

        return "condition";
    }



}
