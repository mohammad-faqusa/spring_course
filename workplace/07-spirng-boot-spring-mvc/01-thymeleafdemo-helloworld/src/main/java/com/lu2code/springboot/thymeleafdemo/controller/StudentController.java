package com.lu2code.springboot.thymeleafdemo.controller;

import com.lu2code.springboot.thymeleafdemo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @GetMapping("/showStudentForm")
    public String showStudentForm(Model model) {

        // create the sutdent object
        Student theStudent=new Student();

        // add the student to model
        model.addAttribute("student",theStudent);

        // return the tamplate
        return "student-form";
    }
}
