## 77. Reading Objects with JPA - Coding

### The Process 
1. add new method `findById` in `StudentDAO` interface 
```java
Student findById(Integer id);
```
2. add new method to `StudentDAOImpl`
```java
@Override 
public Student findById(Integer id) {
    return entityManger.find(Student.class, id); 
}
```
3. Update the main application 
```java
public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
    return runner -> {
        readStudent(studentDAO);
    };
}

public void readStudent(StudentDAO studentDAO) {
    // create a student 
    System.out.println("Creating new student : ....");
    
    Student tempStudent = new Student("mohammad", "khaled", "m@h.com"); 
    // save the student 
    
    studentDAO.save(tempStudent); 
    // display id of the saved student 
    
    int theId = tempStudent.getId(); 
    System.out.println("Saved student. Generated id: " + theId); 
    // retrieve student based on the id: primary key
    System.out.println("Retrieving student with id: " + theId); 
    Student myStudent = studentDAO.findById(theId); 
    // display student 
    System.out.println("Found the student: " + myStudent); 
}
```
4. run the application and check out; 

