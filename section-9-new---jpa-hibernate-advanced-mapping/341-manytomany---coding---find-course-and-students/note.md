## 341. @ManyToMany - Coding - Find Course and Students

### The process 
1. go to dta interface, and create method `findcourseAndStudentsByCourseId` of type Course
2. implement the method : 
```java
public findcourseAndStudentsByCourseId(int theId) {
    
    TypedQuery<Course> query = entityManager.createQuery(
//            "select Course c from Course where ", copy from the previous methods 
    ); 
    
    // set the parameter 
    
    // return the result  
}
```
3. move to the main application 
```java
public CommandLineRunner commandLineRunner(AppDAO theAppDAO){
    findCourseAndStudents(theAppDAO)
}

private void findCourseAndStudents(AppDAO theAppDAO) {
    
    int theId = 10; 
    
    // find the course 
    Course tempCourse = appDAO.findcourseAndStudentsByCourseId(theId);

    System.out.println("Loaded course : " + tempCourse);
    System.out.println("Students : " + tempCourse.getStudents());
}
```