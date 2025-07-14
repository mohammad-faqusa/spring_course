## 73. Saving a Java Object with JPA - Coding - Part 2

#### Step 3: Update the main application 

```java
@Bean
public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
    
    return runner -> {
        createStudent(studentDAO); 
    };
    
    private void createStudent(StudentDAO studentDAO) {
        // create the student object 
        System.out.println("Creating new student object ..."); 
        Student tempStudent = new Student("Mohammad", "Faqusa", "mohammad@gmail.com");
        
        
        // save the student object 
        System.out.println("Saving the sutdent.... ");
        studentDAO.save(tempStudnet); 
        
        
        // display id of hte saved student 
        System.out.println("Saved student. Generated id : " + tempStudent.getId()); 
        
    }
}
```
* before running the app, check the postgre Admin , and check student table , 
* compare the table after running the app