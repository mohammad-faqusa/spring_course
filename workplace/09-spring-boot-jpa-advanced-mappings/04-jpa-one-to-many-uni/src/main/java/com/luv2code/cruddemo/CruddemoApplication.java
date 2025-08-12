package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.AppDAO;
import com.luv2code.cruddemo.entity.Course;
import com.luv2code.cruddemo.entity.Instructor;
import com.luv2code.cruddemo.entity.InstructorDetail;
import com.luv2code.cruddemo.entity.Review;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CruddemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AppDAO theAppDAO) {

        return runner -> {

//            addCourseWithReviews(theAppDAO);

//            findCourseWithReviews(theAppDAO);

            deleteCourse(theAppDAO);
        };

    }

    private void findCourseWithReviews(AppDAO theAppDAO) {
        // retrieve the course
        int theId = 1;
        Course tempCourse = theAppDAO.findCourseWithReviewsByCourseId(theId);
        // print the course
        System.out.println("findCourseWithReviewsByCourseId " + theId);
        System.out.println("the Course : " + tempCourse);
        // print the reviews
        System.out.println("the Reviews " +  tempCourse.getReviews());


    }

    private void addCourseWithReviews(AppDAO theAppDAO) {
        Course theCourse = new Course("The another Masterclass");

        theCourse.addReview(new Review("great course"));
        theCourse.addReview(new Review("good course"));
        theCourse.addReview(new Review("will done"));

        theAppDAO.save(theCourse);
        System.out.println("Done!");
    }

    private void deleteCourse(AppDAO theAppDAO) {
        int theId = 1;
        System.out.println("Delete course by id: " + theId);
        theAppDAO.deleteCourseById(theId);
        System.out.println("Done!");
    }

    private void updateCourse(AppDAO theAppDAO) {

        int theId = 2;

        System.out.println("Find course by id: " + theId);

        Course tempCourse = theAppDAO.findCourseById(theId);

        tempCourse.setTitle("The Pinball Masterclass - Updated");

        theAppDAO.update(tempCourse);

        System.out.println("Done!");
    }

    private void updateInstructor(AppDAO theAppDAO) {
        int theId = 1;
        System.out.println("Find instructor by id: " + theId);
        Instructor theInstructor = theAppDAO.findInstructorById(theId);
        System.out.println("Found instructor: " + theInstructor);

        theInstructor.setEmail("mohammad@gentool.com");

        theAppDAO.update(theInstructor);

        System.out.println("Done!");
    }

    private void findInstructorWithCourse(AppDAO theAppDAO) {

        int theId = 1;
        System.out.println("Find instructor by id: " + theId);
        Instructor theInstructor = theAppDAO.findInstructorWithCoursesByIdJoinFetch(theId);
        System.out.println("Found instructor: " + theInstructor);
//        System.out.println("The associated courses: " + theInstructor.getCourses());

//        List<Course> theCourses = theAppDAO.findCoursesByInstructorId(theId);
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
        int theId = 1;
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
