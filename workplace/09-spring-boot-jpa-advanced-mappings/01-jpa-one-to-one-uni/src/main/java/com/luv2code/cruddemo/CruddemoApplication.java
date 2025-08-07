package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.AppDAO;
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
            createInstructor(theAppDAO);
        };
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
