package com.springboot.devtool;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TextController {

    @RequestMapping("/hello")
    @ResponseBody
    public String  hello(){
         int a =5;
         int b=10;

        return "the sum is"+(a+b);
    }

}
