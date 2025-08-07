package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.entity.Instructor;
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
}
