## 74. Primary Keys

### In student table 
1. view information of table,  
by selecting `Alter`, we will not **alter** the table 
2. you can select `properties` in postgre Admin
3. go to `main` application 
```java

public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
    
    return runner -> {
        
        // createStudent(studentDAO); 
        
        createMultipleStudents(studentDAO); 
        
    }; 
    
}

private void createMultipleStudents(StudentDAO studentDAO) {
    // create multiple students
    System.out.println("Creating 3 student objects ...");
    Student tempStudent1 = new Student("Mohammad", "faqusa","mohammad@gm.com"); 
    Student tempStudent2 = new Student("ahmad", "faqusa","ahmad@gm.com"); 
    Student tempStudent3 = new Student("ali", "faqusa","ali@gm.com"); 
    
    // save the student objects 
    
    System.out.pirntln("Saving the students ...."); 
    studentDAO.save(tempStudent1); 
    studentDAO.save(tempStudent2); 
    studentDAO.save(tempStudent3); 
    
}
```
