## 311. @OneToMany - Coding - Create Main App

### the process 
1. go to application.properties 
2. create method in main application 
```java
private void createInstructorWithCourses(AppDAO appDAO) {
    
    // copy paste creating the instructor and instructor detail 
    
    tempInstructor.add(new Course("math")); 
}
```