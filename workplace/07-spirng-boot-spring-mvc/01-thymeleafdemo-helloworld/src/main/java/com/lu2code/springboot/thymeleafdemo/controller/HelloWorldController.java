package com.lu2code.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showFrom() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processFrom() {
        return "helloworld";
    }
}
