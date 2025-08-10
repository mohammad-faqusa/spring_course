package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.AppDAO;
import com.luv2code.cruddemo.entity.Course;
import com.luv2code.cruddemo.entity.Instructor;
import com.luv2code.cruddemo.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CruddemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AppDAO theAppDAO) {

        return runner -> {
//            createInstructor(theAppDAO);
//            findInstructor(theAppDAO);
//            deleteInstructor(theAppDAO);
//            findInstructorDetail(theAppDAO);
//            deleteInstructorDetail(theAppDAO);
//            createInstructorWithCourse(theAppDAO);
            findInstructorWithCourse(theAppDAO);
        };
    }

    private void findInstructorWithCourse(AppDAO theAppDAO) {

        int theId = 1;
        System.out.println("Find instructor by id: " + theId);
        Instructor theInstructor = theAppDAO.findInstructorById(theId);
        System.out.println("Found instructor: " + theInstructor);
        System.out.println("The associated courses: " + theInstructor.getCourses());
        System.out.println("Done!");
    }

    private void createInstructorWithCourse(AppDAO theAppDAO) {

        // create instructor detail
        InstructorDetail theInstructorDetail = new InstructorDetail("General", "Gaming");

        // create instructor
        Instructor theInstructor = new Instructor("Faqusa", "Faqusa", "clear@g.com");


        // associate
        theInstructor.setInstructorDetail(theInstructorDetail);

        Course tempCourse1 = new Course("Air Guitar - The Ultimate Guide");
        Course tempCourse2 = new Course("The Pinball Masterclass");

        // add courses to instructor
        theInstructor.add(tempCourse1);
        theInstructor.add(tempCourse2);

        //save the instructor

        System.out.println("Saving instructor: " + theInstructor);
        System.out.println("The courses: " + theInstructor.getCourses());
        theAppDAO.save(theInstructor);

        System.out.println("Done!");

    }

    private void deleteInstructorDetail(AppDAO theAppDAO) {
        int theId = 2;
        System.out.println("Delete instructor detail by id: " + theId);
        theAppDAO.deleteInstructorDetailById(theId);
        System.out.println("Done!");
    }


    private void findInstructorDetail(AppDAO theAppDAO) {

        int theId = 2;
        System.out.println("Find instructor detail by id: " + theId);
        InstructorDetail theInstructorDetail = theAppDAO.findInstructorDetailById(theId);
        System.out.println("Found instructor detail: " + theInstructorDetail);
        System.out.println("The associated Instructor : " + theInstructorDetail.getInstructor());
        System.out.println("Done!");
    }

    private void deleteInstructor(AppDAO theAppDAO) {
        int theId = 1;
        System.out.println("Delete instructor by id: " + theId);
        theAppDAO.deleteInstructorById(theId);
        System.out.println("Done!");
    }

    private void findInstructor(AppDAO theAppDAO) {
        int theId = 1;
        System.out.println("Find instructor by id: " + theId);
        Instructor theInstructor = theAppDAO.findInstructorById(theId);
        System.out.println("Found instructor: " + theInstructor);
        System.out.println("The associated Instructor Detail : " + theInstructor.getInstructorDetail());
        System.out.println("Done!");
    }

    private void createInstructor(AppDAO theAppDAO) {

//        // create instructor detail
//        InstructorDetail theInstructorDetail = new InstructorDetail("mohammadfaqusa9", "Programming");
//
//        // create instructor
//        Instructor theInstructor = new Instructor("Mohammad", "Faqusa" , "mohammad@g.com");

        // create instructor detail
        InstructorDetail theInstructorDetail = new InstructorDetail("CleaR", "Gaming");

        // create instructor
        Instructor theInstructor = new Instructor("CleaR", "Faqusa", "clear@g.com");


        // associate
        theInstructor.setInstructorDetail(theInstructorDetail);

        // save the instructor
        System.out.println("Saving the instructor: " + theInstructor);
        theAppDAO.save(theInstructor);
        System.out.println("Done!");
    }
}
