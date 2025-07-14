package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    public void save(Student student);

    public Student findById(Integer id);

    public List<Student> findAll();

    public List<Student> findByLastName(String lastName);
}
