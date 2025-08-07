package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.entity.Instructor;

public interface AppDAO {

    public void save(Instructor theInstructor);

    public Instructor findInstructorById(int theId);
}
