package com.cay.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {
    @RequestMapping("/helloworld")
    public String helloWorld(){
        return "helloworld";
    }
}
