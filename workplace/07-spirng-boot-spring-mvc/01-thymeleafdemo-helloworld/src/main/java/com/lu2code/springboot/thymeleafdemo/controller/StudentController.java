package com.lu2code.springboot.thymeleafdemo.controller;

import com.lu2code.springboot.thymeleafdemo.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    @Value("${countries}")
    private List<String> countries;

    @Value("${languages}")
    private List<String> languages;

    @GetMapping("/showStudentForm")
    public String showStudentForm(Model model) {

        // create the sutdent object
        Student theStudent=new Student();

        // add the student to model
        model.addAttribute("student",theStudent);
        model.addAttribute("countries",countries);
        model.addAttribute("languages",languages);

        // return the tamplate
        return "student-form";
    }

    @PostMapping("/processStudent")
    public String proceeStudent(@ModelAttribute("student") Student theStudent,  Model model) {

        System.out.println(theStudent);

        model.addAttribute("student",theStudent);

        return "student-confirmation";
    }
}
