package com.luv2code.demo.rest;

import com.luv2code.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;

    @PostConstruct
    public void init() {
        theStudents = new ArrayList<>();

        theStudents.add(new Student("mohammad", "faqusa"));
        theStudents.add(new Student("ali", "faqusa"));
        theStudents.add(new Student("ahmad", "faqusa"));

    }

    @GetMapping("/students")
    public List<Student> getStudents() {

        return theStudents;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {

        if(studentId < 0 || studentId >= theStudents.size()) {
            throw new StudentNotFoundException("Student Id " + studentId + " not found");
        }
        return theStudents.get(studentId);
    }

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc) {

        // define the response entity
        StudentErrorResponse response = new StudentErrorResponse();
        response.setMessage(exc.getMessage());
        response.setStamp(System.currentTimeMillis());
        response.setStatus(HttpStatus.NOT_FOUND.value());


        // return the response entity
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

}
