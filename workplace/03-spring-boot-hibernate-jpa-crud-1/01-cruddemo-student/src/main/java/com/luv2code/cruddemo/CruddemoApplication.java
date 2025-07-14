package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
//			createMultipleStudents(studentDAO);
			readStudent(studentDAO);
		};
	}

	private void createMultipleStudents(StudentDAO studentDAO) {
		// create multiple students
		System.out.println("Creating 3 student objects ...");
		Student tempStudent1 = new Student("Mohammad", "drabea","mm@gm.com");
		Student tempStudent2 = new Student("ahmad", "faqusa","ahmad@gm.com");
		Student tempStudent3 = new Student("ali", "faqusa","ali@gm.com");

		// save the student objects

		System.out.println("Saving the students ....");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);

	}

	private void readStudent(StudentDAO studentDAO) {
		// create multiple students
		System.out.println("Creating 3 student objects ...");
		Student tempStudent1 = new Student("ali", "drabea","ali@g.com");

		// save to data base
		studentDAO.save(tempStudent1);

		int studentId = tempStudent1.getId() ;

		System.out.println("Reading student with id " + studentId);

	}

}
