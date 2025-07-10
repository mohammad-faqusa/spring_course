package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    //expose new endpoint for "teaminfo"
    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Coach: " + coachName + ", Team name: " + teamName;
    }

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
