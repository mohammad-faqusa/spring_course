package com.luv2code.springdemo.mvc.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidation implements ConstraintValidator<CourseCode, String> {

    private String coursePrefix;

    public void initialize(CourseCode constraintAnnotation) {
        coursePrefix = constraintAnnotation.value();
    }

    public boolean isValid(String theCode, ConstraintValidatorContext context) {
        return theCode != null && theCode.startsWith(coursePrefix) && theCode.length() > coursePrefix.length();
    }
}
