## 342. @ManyToMany - Coding - Find Student and Courses

### Find a Student and its Courses 
1. go to dao interface 
```java
Student findStudentAndCoursesByStudentId(int theId); 
```
2. implement the dao, _copy from related methods_ 
3. open the main application 
```java
private void findStudentAndCourses(AppDAO theAppDAO) { 
    int theId = 1 ; 
    // find the student 
    Student theStudent = theAppDAO.findStudentAndCourses(theId);
    
    // print the student 
    System.out.println("the student : " + theStudent);
    
    // print the courses
    System.out.println("The courses : " + theStudent.getCourses());
    
    // done 
}
```