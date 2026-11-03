package com.springboot.thymeleaftemplates.MainController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainControl {

    @GetMapping("/service")
    public String serviceHandling(Model model) {

        model.addAttribute("title", "I am first time learn this");
        model.addAttribute("subtitle", "Learn Thymeleaf");
        return "service";
    }
}
