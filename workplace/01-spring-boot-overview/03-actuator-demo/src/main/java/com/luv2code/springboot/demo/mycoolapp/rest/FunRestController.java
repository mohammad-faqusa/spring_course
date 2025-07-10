package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String getFun() {
        return "Hello World!";
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
