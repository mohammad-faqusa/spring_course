package com.luv2code.demo.rest;

import com.luv2code.demo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @GetMapping("/students")
    public List<Student> getStudents() {
        // create sample list of students
        List<Student> students = new ArrayList<>();

        students.add(new Student("mohammad", "faqusa"));
        students.add(new Student("ali", "faqusa"));
        students.add(new Student("ahmad", "faqusa"));

        // return the students

        return students;
    }


}
