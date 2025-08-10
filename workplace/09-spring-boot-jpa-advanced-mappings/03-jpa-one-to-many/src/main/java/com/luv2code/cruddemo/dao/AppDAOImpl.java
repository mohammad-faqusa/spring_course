package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.entity.Course;
import com.luv2code.cruddemo.entity.Instructor;
import com.luv2code.cruddemo.entity.InstructorDetail;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

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
    @Transactional
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

    @Override
    public List<Course> findCoursesByInstructorId(int theId) {
        TypedQuery<Course> query = entityManger.createQuery("from Course where instructor.id = :data", Course.class);
        query.setParameter("data", theId);

        List<Course> result = query.getResultList();
        return result;
    }
}
