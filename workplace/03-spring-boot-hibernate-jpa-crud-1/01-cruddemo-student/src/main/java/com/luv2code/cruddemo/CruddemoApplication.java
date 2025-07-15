package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
//			createMultipleStudents(studentDAO);
//			readStudent(studentDAO);
//			queryStudents(studentDAO);
//			queryForFindByLastName(studentDAO);
//			updateStudent(studentDAO);
//			deleteStudent(studentDAO);
			deleteAllStudents(studentDAO);
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

	private void queryStudents(StudentDAO studentDAO) {

		// get list of students
		List<Student> students = studentDAO.findAll();


		// print the list of students
		for(Student student : students) {
			System.out.println(student);
		}
	}

	private void queryForFindByLastName(StudentDAO studentDAO) {
		// get by last name
		List<Student> students = studentDAO.findByLastName("drabea");
		// print the result
		for(Student student : students) {
			System.out.println(student);
		}
	}

	private void updateStudent(StudentDAO studentDAO) {

		// get student by id
		Student student = studentDAO.findById(1);

		// edit the student first name
		student.setFirstName("Husam");

		// update the student
		studentDAO.update(student);

		// retieve the student
		System.out.println(student);
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int studentId = 3;

		System.out.println("Deleting student with id " + studentId);

		studentDAO.delete(studentId);
		System.out.println("The student of id: " + studentId + " has been deleted");
	}

	private void deleteAllStudents(StudentDAO studentDAO) {
		System.out.println("Deleting all students ...");
		int numOfDeletedStudents = studentDAO.deleteAll();
		System.out.println("The number of deleted students : " + numOfDeletedStudents);
	}
}
