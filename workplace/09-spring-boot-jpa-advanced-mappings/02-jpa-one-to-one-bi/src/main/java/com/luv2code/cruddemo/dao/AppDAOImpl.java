package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.entity.Instructor;
import com.luv2code.cruddemo.entity.InstructorDetail;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AppDAOImpl implements AppDAO {

    private EntityManager entityManger;

    @Autowired
    public AppDAOImpl(EntityManager entityManger) {
        this.entityManger = entityManger;
    }


    @Override
    @Transactional
    public void save(Instructor theInstructor) {
        entityManger.persist(theInstructor);
    }

    @Override
    public Instructor findInstructorById(int theId) {
        return entityManger.find(Instructor.class, theId);
    }

    @Override
    @Transactional
    public void deleteInstructorById(int theId) {
        Instructor theInstructor = entityManger.find(Instructor.class, theId);
        entityManger.remove(theInstructor);
    }

    @Override
    public InstructorDetail findInstructorDetailById(int theId) {
        return entityManger.find(InstructorDetail.class, theId);
    }

    @Override
    @Transactional
    public void deleteInstructorDetailById(int theId) {
        InstructorDetail theInstructorDetail = entityManger.find(InstructorDetail.class, theId);

        theInstructorDetail.getInstructor().setInstructorDetail(null);

        entityManger.remove(theInstructorDetail);
    }
}
