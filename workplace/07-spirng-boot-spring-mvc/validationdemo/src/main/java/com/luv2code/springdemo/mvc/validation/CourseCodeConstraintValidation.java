package com.luv2code.springdemo.mvc.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidation implements ConstraintValidator<CourseCode, String> {

    private String coursePrefix;

    // use the IDE to generate the implemented methods


    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {
        boolean result = theCode.startsWith(coursePrefix);

        return false;
    }

    @Override
    public void initialize(CourseCode theCourseCode) {
        coursePrefix =  theCourseCode.value();
    }
}
