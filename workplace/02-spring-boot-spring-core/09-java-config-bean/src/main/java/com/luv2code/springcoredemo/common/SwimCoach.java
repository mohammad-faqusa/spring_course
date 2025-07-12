package com.luv2code.springcoredemo.common;

public class SwimCoach implements Coach {

    public SwimCoach() {

    }

    @Override
    public String getDailyWorkout() {
        return "take breath, swim!";
    }
}
