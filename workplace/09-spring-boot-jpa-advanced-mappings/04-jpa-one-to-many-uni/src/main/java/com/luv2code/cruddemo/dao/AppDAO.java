package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.entity.Course;
import com.luv2code.cruddemo.entity.Instructor;
import com.luv2code.cruddemo.entity.InstructorDetail;

import java.util.List;

public interface AppDAO {

    public void save(Instructor theInstructor);

    public Instructor findInstructorById(int theId);

    public void deleteInstructorById(int theId);

    InstructorDetail findInstructorDetailById(int theId);

    void deleteInstructorDetailById(int theId);

    List<Course> findCoursesByInstructorId(int theId);

    Instructor findInstructorWithCoursesByIdJoinFetch(int theId);

    void update(Instructor theInstructor);

    Course findCourseById(int theId);

    void update(Course theCourse);

    void deleteCourseById(int theId);

    void save(Course theCourse);

}
