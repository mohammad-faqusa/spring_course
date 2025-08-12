## 340. @ManyToMany - Coding - Create Course and Students

### The process
1. move to the main application 
```java

public CommandLineRunenr commandLineRunenr(AppDAO theAppDAO) {
    
    runner -> {
        createCourseAndStudents(theAppDAO); 
    }
}

private void createCourseAndStudents(AppDAO theAppDAO) {
    
    // create course 
    Course tempCourse = new Course("Pacman - How to Score One Million Points"); 
    
    // create the students 
    Student tempStudent1 = new Student("Mohammad", "Faqusa", "mohammad@g.com"); 
    Student tempStudent2 = new Student("Ahmad", "Faqusa", "ahmad@g.com"); 
    Student tempStudent3 = new Student("Ali", "Faqusa", "ali@g.com"); 
    
    // add students to the course 
    tempCourse.addStudent(tempStudent1); 
    tempCourse.addStudent(tempStudent2);
    tempCourse.addStudent(tempStudent3);
    
    // save the course and the associated students
    System.out.println("Saving the course: " + tempCourse);
    System.out.println("associated students : " + tempCourse.getStudents()); 
    
    appDAO.save(tempCoruse);

    System.out.println("Done!");
    
}
```
2. run the application 
3. check the data in db 
