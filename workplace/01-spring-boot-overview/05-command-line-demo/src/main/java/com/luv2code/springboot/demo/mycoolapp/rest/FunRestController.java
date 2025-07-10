package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @Value("${info.app.name}")
    private String infoName;

    @GetMapping("/")
    public String getFun() {
        return "Hello World!" + infoName;
    }

    @GetMapping("/hello")
    public String getHello() {
        return "Hello World!, This is Mohammad Faqusa";
    }

    @GetMapping("/workout")
    public String getWorkout() {
        return "Lest workout together !";
    }
}
